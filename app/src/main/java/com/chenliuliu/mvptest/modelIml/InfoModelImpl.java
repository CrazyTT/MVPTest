package com.chenliuliu.mvptest.modelIml;

import com.chenliuliu.mvptest.bean.InfoBean;
import com.chenliuliu.mvptest.bean.LoginBean;
import com.chenliuliu.mvptest.model.IInfoModel;
import com.chenliuliu.mvptest.net.HttpUtils;
import com.chenliuliu.mvptest.net.HttpUtilsCallBack;
import com.chenliuliu.mvptest.views.IInfoView;

import java.util.Map;

/**
 * Created by liuliuchen on 16/5/9.
 */
public class InfoModelImpl implements IInfoModel {
    @Override
    public void getInfo(Map<String, String> params, final IInfoView iInfoView) {
        iInfoView.showProgress();
        HttpUtils.getInstance().executePost("http://weiguo.hanwei.cn/smart/hwmobile/smart/d002!retrieveRealData", params, InfoBean.class, new HttpUtilsCallBack<InfoBean>() {
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
        });
    }

    @Override
    public void getSession(Map<String, String> params, final IInfoView iInfoView) {
        iInfoView.showProgress();
        HttpUtils.getInstance().executeGet("http://192.168.50.251:8080/bjgh/main!mobileLogin", params, LoginBean.class, new HttpUtilsCallBack<LoginBean>() {
            @Override
            public void onError(String str) {
                iInfoView.hideProgress();
                iInfoView.showFailureMsg(str);

            }

            @Override
            public void onSuccess(LoginBean object) {
                iInfoView.hideProgress();
                iInfoView.showInfoSuccess2(object);

            }
        });
    }
}
