package com.chenliuliu.mvptest.views;

import com.chenliuliu.mvptest.bean.InfoBean;
import com.chenliuliu.mvptest.bean.LoginBean;

/**
 * Created by liuliuchen on 16/5/9.
 */
public interface MainView extends MvpView {
    void showInfoSuccess(InfoBean info);
    void showInfoSuccess2(LoginBean info);

}
