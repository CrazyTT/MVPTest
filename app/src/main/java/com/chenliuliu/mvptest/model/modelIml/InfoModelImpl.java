package com.chenliuliu.mvptest.model.modelIml;

import com.chenliuliu.mvptest.activitys.MainActivity;
import com.chenliuliu.mvptest.bean.InfoBean;
import com.chenliuliu.mvptest.model.IInfoModel;
import com.chenliuliu.mvptest.net.HttpUtils;
import com.chenliuliu.mvptest.net.HttpUtilsCallBack;
import com.chenliuliu.mvptest.views.IInfoView;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by liuliuchen on 16/5/9.
 */
public class InfoModelImpl implements IInfoModel {
    public void getInfo(MainActivity context, final IInfoView iInfoView) {
        iInfoView.showProgress();
        Map<String, String> params = new HashMap<>();
        params.put("SENSORID", context.SENSORID);
        params.put("KEY", context.KEY);
        HttpUtils.getInstance().executePost("http://weiguo.hanwei.cn/smart/hwmobile/smart/d002!retrieveRealData", params, new HttpUtilsCallBack<InfoBean>() {
            @Override
            public void onError(String str) {
                iInfoView.hideProgress();
                iInfoView.showInfoFailure(str);
            }

            @Override
            public void onSuccess(InfoBean object) {
                iInfoView.hideProgress();
                iInfoView.showInfoSucess(object);
            }
        }, InfoBean.class);
    }
}
