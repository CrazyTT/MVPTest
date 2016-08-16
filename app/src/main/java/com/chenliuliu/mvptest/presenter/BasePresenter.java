package com.chenliuliu.mvptest.presenter;

import android.content.Context;

import com.chenliuliu.mvptest.views.MvpView;

/**
 * Created by liuliuchen on 16/8/16.
 */
public class BasePresenter {
    protected Context mContext;

    public BasePresenter(MvpView context) {
        mContext = (Context) context;
    }
}
