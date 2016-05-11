package com.chenliuliu.mvptest.modelIml;

import com.chenliuliu.mvptest.bean.InfoBean;
import com.chenliuliu.mvptest.model.IInfoModel;
import com.chenliuliu.mvptest.net.HttpUtils;
import com.chenliuliu.mvptest.net.HttpUtilsCallBack;
import com.chenliuliu.mvptest.net.JsonUtils;
import com.chenliuliu.mvptest.views.IInfoView;
import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.callback.Callback;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import okhttp3.Call;
import okhttp3.Response;

/**
 * Created by liuliuchen on 16/5/9.
 */
public class InfoModelImpl implements IInfoModel {
    public void getInfo(Map<String, String> params, final IInfoView iInfoView) {
        iInfoView.showProgress();
        HttpUtils.getInstance().executePost("http://weiguo.hanwei.cn/smart/hwmobile/smart/d002!retrieveRealData", params, new HttpUtilsCallBack<InfoBean>() {
            @Override
            public void onError(String str) {
                iInfoView.hideProgress();
                iInfoView.showFailureMsg(str);
            }

            @Override
            public void onSuccess(InfoBean object) {
                iInfoView.hideProgress();
                iInfoView.showInfoSuccess(object);
            }
        }, InfoBean.class);
    }

    public void getInfo2(Map<String, String> params, final IInfoView iInfoView) {
        iInfoView.showProgress();
        OkHttpUtils.post().url("http://weiguo.hanwei.cn/smart/hwmobile/smart/d002!retrieveRealData").params(params).build().execute(new UserCallback() {
            @Override
            public void onError(Call call, Exception e) {
                iInfoView.hideProgress();
                iInfoView.showFailureMsg(e.getMessage());
            }

            @Override
            public void onResponse(InfoBean response) {
                iInfoView.hideProgress();
                iInfoView.showInfoSuccess2(response);
            }
        });

        List<String> images = new ArrayList<>();
        images.add("http://img3.imgtn.bdimg.com/it/u=4271053251,2424464488&fm=21&gp=0.jpg");
        images.add("http://pic36.nipic.com/20131217/6704106_233034463381_2.jpg");
        String str = "<!--IMG#0-->sjdlsklfsjkldfkjsldfjkls<!--IMG#1-->sldjskfjslkfjskfjsklfjskl";
        for (int i = 0; i < images.size(); i++) {
            str=str.replace("<!--IMG#" + i + "-->",
                    "<img src=" + images.get(i) + " /> ");
        }
        System.out.println(str);

    }

    abstract class UserCallback extends Callback<InfoBean> {
        @Override
        public InfoBean parseNetworkResponse(Response response) throws IOException {
            String string = response.body().string();
            InfoBean user = JsonUtils.getInstance().json2object(string, InfoBean.class);
            return user;
        }
    }
}
