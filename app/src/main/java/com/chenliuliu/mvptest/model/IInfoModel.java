package com.chenliuliu.mvptest.model;

import com.chenliuliu.mvptest.views.IInfoView;

import java.util.Map;

/**
 * Created by liuliuchen on 16/5/9.
 */
public interface IInfoModel {
    //从数据提供者获取数据方法
    void getInfo(Map<String, String> params, IInfoView uu);
    void getInfo2(Map<String, String> params, IInfoView uu);
}
