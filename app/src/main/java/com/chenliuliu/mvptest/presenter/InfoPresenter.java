package com.chenliuliu.mvptest.presenter;

import com.chenliuliu.mvptest.activitys.MainActivity;
import com.chenliuliu.mvptest.model.IInfoModel;
import com.chenliuliu.mvptest.model.modelIml.InfoModelImpl;
import com.chenliuliu.mvptest.views.IInfoView;

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

    public void getInfo(MainActivity context) {
        infoModel.getInfo(context, this.infoView);
    }
}
