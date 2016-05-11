package com.chenliuliu.mvptest.views;

import com.chenliuliu.mvptest.bean.InfoBean;

/**
 * Created by liuliuchen on 16/5/9.
 */
public interface IInfoView extends MvpView {
    void showInfoSuccess(InfoBean info);
    void showInfoSuccess2(InfoBean info);

}
