package com.chenliuliu.mvptest.views;

import com.chenliuliu.mvptest.bean.InfoBean;

/**
 * Created by liuliuchen on 16/5/9.
 */
public interface IInfoView extends MvpView {
    void showInfoSucess(InfoBean info);

    void showInfoFailure(String info);
}
