package com.chenliuliu.mvptest.modelIml.model;

import com.chenliuliu.mvptest.views.MainView;

import java.util.Map;

/**
 * Created by liuliuchen on 16/5/9.
 */
public interface MainModel {
    void getInfo(Map<String, String> params, MainView uu);
    void getSession(Map<String, String> params, MainView uu);
}
