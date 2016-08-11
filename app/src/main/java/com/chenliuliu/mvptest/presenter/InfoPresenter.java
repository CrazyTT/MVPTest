package com.chenliuliu.mvptest.presenter;

import com.chenliuliu.mvptest.model.IInfoModel;
import com.chenliuliu.mvptest.modelIml.InfoModelImpl;
import com.chenliuliu.mvptest.views.IInfoView;

import java.util.Map;

/**
 * Created by liuliuchen on 16/5/9.
 */
public class InfoPresenter {
    private IInfoModel infoModel;
    private IInfoView infoView;

    public InfoPresenter(IInfoView infoView) {
        this.infoView = infoView;
        infoModel = new InfoModelImpl();
    }

    public void getInfo(Map<String, String> params) {
        for (int i = 0; i < 9; i++) {
            infoModel.getInfo(params, this.infoView);
        }

    }

    public void getSession(Map<String, String> params) {
        infoModel.getSession(params, this.infoView);
    }
}
