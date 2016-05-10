package com.chenliuliu.mvptest.activitys;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.chenliuliu.mvptest.R;
import com.chenliuliu.mvptest.bean.InfoBean;
import com.chenliuliu.mvptest.presenter.InfoPresenter;
import com.chenliuliu.mvptest.views.IInfoView;

public class MainActivity extends AppCompatActivity implements IInfoView, View.OnClickListener {
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
                presenter.getInfo(MainActivity.this);
            }
        });

    }

    @Override
    public void onClick(View v) {

    }

    @Override
    public void showInfoSucess(InfoBean info) {
        Toast.makeText(this, info.getMessage(), Toast.LENGTH_LONG).show();

    }

    @Override
    public void showInfoFailure(String info) {
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