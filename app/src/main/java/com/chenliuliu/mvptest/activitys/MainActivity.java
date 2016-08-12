package com.chenliuliu.mvptest.activitys;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.chenliuliu.mvptest.R;
import com.chenliuliu.mvptest.bean.InfoBean;
import com.chenliuliu.mvptest.bean.LoginBean;
import com.chenliuliu.mvptest.presenter.InfoPresenter;
import com.chenliuliu.mvptest.utils.AppUtils;
import com.chenliuliu.mvptest.utils.ProgressUtil;
import com.chenliuliu.mvptest.utils.ToastUtils;
import com.chenliuliu.mvptest.views.IInfoView;

import java.util.HashMap;
import java.util.Map;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends BaseActivity implements IInfoView, View.OnClickListener {
    private static final String TAG = "MainActivity";
    @Bind(R.id.txt_test)
    TextView mHello;
    private InfoPresenter presenter;
    public String SENSORID = "500004DF6A4A";
    public String KEY = "v34uvm9y839vg6y23mhLSKDF84f10a";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        presenter = new InfoPresenter(this);
        findViewById(R.id.btn_test).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Map<String, String> params = new HashMap<>();
                params.put("SENSORID", SENSORID);
                params.put("KEY", KEY);
                presenter.getInfo(params);
            }
        });
        findViewById(R.id.btn_get_session).setOnClickListener(new View.OnClickListener() {
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

                presenter.getSession(params);
            }
        });
    }

    @Override
    public void onClick(View v) {

    }

    @Override
    public void showInfoSuccess(InfoBean info) {
        System.out.println(info.getMessage() + "1");
        ToastUtils.toast(this,info.getMessage(),ToastUtils.LENGTH_SHORT);
        mHello.setText(info.getMessage());
    }

    @Override
    public void showInfoSuccess2(LoginBean info) {
        mHello.setText(info.getLogin_result());
        ToastUtils.toast(this,info.getLogin_result(),ToastUtils.LENGTH_SHORT);
    }

    @Override
    public void showFailureMsg(String info) {
        Toast.makeText(this, info, Toast.LENGTH_LONG).show();

    }

    @Override
    public void showProgress() {
        ProgressUtil.showProgressDlg(this);
    }

    @Override
    public void hideProgress() {
        ProgressUtil.stopProgressDlg();
    }
}
