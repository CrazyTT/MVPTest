package com.chenliuliu.mvptest.model;

import com.chenliuliu.mvptest.activitys.MainActivity;
import com.chenliuliu.mvptest.views.IInfoView;

/**
 * Created by liuliuchen on 16/5/9.
 */
public interface IInfoModel {
    //从数据提供者获取数据方法
    void getInfo(MainActivity context, IInfoView uu);
}
