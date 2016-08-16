package com.chenliuliu.mvptest.presenter;

import android.view.View;

import com.chenliuliu.mvptest.modelIml.model.MainModel;
import com.chenliuliu.mvptest.modelIml.MainModelImpl;
import com.chenliuliu.mvptest.utils.AppUtils;
import com.chenliuliu.mvptest.utils.ToastUtils;
import com.chenliuliu.mvptest.views.MainView;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by liuliuchen on 16/5/9.
 */
public class MainPresenter extends BasePresenter {
    private MainModel infoModel;
    private MainView infoView;

    public MainPresenter(MainView infoView) {
        super(infoView);
        this.infoView = infoView;
        infoModel = new MainModelImpl();
    }

    public void getInfo(Map<String, String> params) {
        infoModel.getInfo(params, this.infoView);

    }

    public void getSession(Map<String, String> params) {
        infoModel.getSession(params, this.infoView);
    }

    public View.OnClickListener getBtnTest(final String SENSORID,final String KEY) {
        return new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Map<String, String> params = new HashMap<>();
                params.put("SENSORID", SENSORID);
                params.put("KEY", KEY);
                getInfo(params);
                ToastUtils.toast(mContext, "SENSORID", ToastUtils.LENGTH_SHORT);
            }
        };
    }

    public View.OnClickListener getBtnSession() {
        return new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Map<String, String> params = new HashMap<>();
                params.put("username", "yw1");
                params.put("passwordvalue", "000000");
                params.put("password", AppUtils.md5("000000"));
                params.put("nologin", "true");
//        params.put("imei", DeviceUtils.getIMEI(this));
                params.put("imei", "000000000000000");
//        params.put("deviceName", DeviceUtils.getDeviceName());
                params.put("deviceName", "Bjdv测试设备");
                getSession(params);
            }
        };
    }
}
