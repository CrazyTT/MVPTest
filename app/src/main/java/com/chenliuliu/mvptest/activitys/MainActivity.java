package com.chenliuliu.mvptest.activitys;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.chenliuliu.mvptest.R;
import com.chenliuliu.mvptest.bean.InfoBean;
import com.chenliuliu.mvptest.presenter.InfoPresenter;
import com.chenliuliu.mvptest.views.IInfoView;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends BaseActivity implements IInfoView, View.OnClickListener {
    private InfoPresenter presenter;
    private ProgressDialog dialog;
    public String SENSORID = "500004DF6A4A";
    public String KEY = "v34uvm9y839vg6y23mhLSKDF84f10a";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dialog = new ProgressDialog(this);
        presenter = new InfoPresenter(this);
        findViewById(R.id.txt_test).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Map<String, String> params = new HashMap<>();
                params.put("SENSORID", SENSORID);
                params.put("KEY", KEY);
                presenter.getInfo(params);
                presenter.getInfo2(params);
            }
        });

    }

    @Override
    public void onClick(View v) {

    }

    @Override
    public void showInfoSuccess(InfoBean info) {
        System.out.println(info.getMessage() + "1");
        Toast.makeText(this, info.getMessage(), Toast.LENGTH_LONG).show();

    }

    @Override
    public void showInfoSuccess2(InfoBean info) {
        System.out.println(info.getMessage() + "2");
        Toast.makeText(this, info.getMessage(), Toast.LENGTH_LONG).show();
    }

    @Override
    public void showFailureMsg(String info) {
        Toast.makeText(this, info, Toast.LENGTH_LONG).show();

    }

    @Override
    public void showProgress() {
        dialog.show();

    }

    @Override
    public void hideProgress() {
        if (dialog != null && dialog.isShowing()) {
            dialog.dismiss();
        }

    }
}
