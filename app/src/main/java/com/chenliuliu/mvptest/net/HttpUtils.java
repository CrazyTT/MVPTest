package com.chenliuliu.mvptest.net;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import com.chenliuliu.mvptest.BuildConfig;
import com.chenliuliu.mvptest.app.BaseApplication;
import com.socks.library.KLog;
import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.callback.Callback;
import com.zhy.http.okhttp.request.RequestCall;

import java.util.HashMap;
import java.util.Map;

import okhttp3.Call;
import okhttp3.Response;

/**
 * Created by liuliuchen on 16/1/21.
 */
public class HttpUtils<T> {

    private volatile static OkHttpUtils okHttpUtils;

    private volatile static HttpUtils instance;
    private SharedPreferences mSharedPreferences;

    private HttpUtils() {
        mSharedPreferences = PreferenceManager.getDefaultSharedPreferences(BaseApplication.getInstance());
    }

    public static HttpUtils getInstance() {
        if (null == instance) {
            synchronized (HttpUtils.class) {
                if (null == instance) {
                    instance = new HttpUtils();
                }
            }
        }
        return instance;
    }

    /**
     * @param url      地址
     * @param params   form表单
     * @param callback 自定义回掉
     * @param mClass   回掉类型
     */
    public void executeGet(final String url, Map<String, String> params, final Class<T> mClass, final HttpUtilsCallBack<T> callback) {
        if (BuildConfig.DEBUG) {
            KLog.d("url", getFormatterUrl(url, params));
        }
        Map<String, String> header = new HashMap<>();
        String cookies = mSharedPreferences.getString("Cookie", null);
//        if (cookies != null) {
//            header.put("Cookie", cookies);
//        }
        getHttpUtils().get().url(url).params(params).headers(header).build().execute(new Callback<T>() {
            @Override
            public T parseNetworkResponse(Response responsem, int id) throws Exception {
                //这边可以存放token
                String cookies = responsem.header("Set-Cookie", "");
                String string = responsem.body().string();
                if (!"".equals(cookies) && cookies != null) {
                    SharedPreferences.Editor editor = mSharedPreferences.edit();
                    editor.putString("Cookie", cookies);
                    editor.commit();
                }
                if (BuildConfig.DEBUG) {
                    KLog.json("response", string);
                    KLog.d("Cookie", cookies);
                }
                T reponse = JsonUtils.getInstance().json2object(string, mClass);
                return reponse;
            }

            @Override
            public void onError(Call call, Exception e, int id) {
                if (BuildConfig.DEBUG) {
                    KLog.e(e.getMessage());
                }
                if (callback != null) {
                    callback.onError("网络错误");
                }
            }

            @Override
            public void onResponse(T response, int id) {
                if (response != null) {
                    if (callback != null) {
                        callback.onSuccess(response);
                    }
                } else {
                    if (callback != null) {
                        callback.onError("网络错误");
                    }
                }
            }
        });
    }


    /**
     * @param url      地址
     * @param params   form表单
     * @param callback okhttp自带的回掉
     */
    public void executeGet(final String url, Map<String, String> params, Callback callback) {
        if (BuildConfig.DEBUG) {
            KLog.d("url", url);
        }
        getHttpUtils().get().url(url).params(params).build().execute(callback);
    }

    /**
     * @param url      地址
     * @param params   form表单
     * @param callback okhttp自带的回掉
     */
    public void executePost(final String url, Map<String, String> params, Callback callback) {
        if (BuildConfig.DEBUG) {
            KLog.d("url", url);
        }
        getHttpUtils().post().url(url).params(params).build().execute(callback);
    }

    /**
     * @param url      地址
     * @param params   form表单
     * @param callback 自定义回掉
     * @param mClass   回掉类型
     */
    public void executePost(final String url, Map<String, String> params, final Class<T> mClass, final HttpUtilsCallBack<T> callback) {
        if (BuildConfig.DEBUG) {
            KLog.d("url", getFormatterUrl(url, params));
        }
        Map<String, String> header = new HashMap<>();
        String cookies = mSharedPreferences.getString("Cookie", null);
        if (cookies != null) {
            header.put("Cookie", cookies);
        }
        getHttpUtils().post().url(url).params(params).headers(header).build().execute(new Callback<T>() {
            @Override
            public T parseNetworkResponse(Response response, int id) throws Exception {
                //这边可以存放token
                String string = response.body().string();
                String cookies = response.header("Set-Cookie", "");
                if (!"".equals(cookies) && cookies != null) {
                    SharedPreferences.Editor editor = mSharedPreferences.edit();
                    editor.putString("Cookie", cookies);
                    editor.commit();
                }
                if (BuildConfig.DEBUG) {
                    KLog.json("response", string);
                    KLog.d("Cookie", cookies);
                }
                T reponse = JsonUtils.getInstance().json2object(string, mClass);
                return reponse;
            }

            @Override
            public void onError(Call call, Exception e, int id) {
                if (BuildConfig.DEBUG) {
                    KLog.e(e.getMessage());
                }
                if (callback != null) {
                    callback.onError("网络错误");
                }
            }

            @Override
            public void onResponse(T response, int id) {
                if (response != null) {
                    if (callback != null) {
                        callback.onSuccess(response);
                    }
                } else {
                    if (callback != null) {
                        callback.onError("网络错误");
                    }
                }
            }
        });
    }

    private String getFormatterUrl(String url, Map<String, String> params) {
        if (params.isEmpty()) {
            return url;
        } else {
            url = url + "?";
        }
        for (String key : params.keySet()) {
            String temp = key + "=" + params.get(key) + "&";
            url = url + temp;
        }
        return url.substring(0, url.length() - 1);
    }


    /**
     * @param url 根据访问地址，cancle request
     */
    public void cancleWithUrl(String url) {
        RequestCall call = getHttpUtils().get().url(url).build();
        call.cancel();
    }

    /**
     * @param tag 根据TAG，cancle request
     */
    public void cancleWithTag(String tag) {
        getHttpUtils().cancelTag(tag);
    }

    public OkHttpUtils getHttpUtils() {
        if (null == okHttpUtils) {
            synchronized (HttpUtils.class) {
                if (null == okHttpUtils) {
                    okHttpUtils = OkHttpUtils.getInstance();
                }
            }
        }
        return okHttpUtils;
    }
}