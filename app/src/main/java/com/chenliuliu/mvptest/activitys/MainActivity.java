package com.chenliuliu.mvptest.activitys;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.chenliuliu.mvptest.R;
import com.chenliuliu.mvptest.bean.InfoBean;
import com.chenliuliu.mvptest.bean.LoginBean;
import com.chenliuliu.mvptest.presenter.MainPresenter;
import com.chenliuliu.mvptest.utils.ProgressUtil;
import com.chenliuliu.mvptest.utils.ToastUtils;
import com.chenliuliu.mvptest.views.MainView;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends BaseActivity implements MainView {
    private static final String TAG = "MainActivity";
    @Bind(R.id.txt_test)
    TextView mHello;
    @Bind(R.id.btn_test)
    Button mBtnTest;
    @Bind(R.id.btn_get_session)
    Button mBtnGetSession;
    private MainPresenter presenter;
    public String SENSORID = "500004DF6A4A";
    public String KEY = "v34uvm9y839vg6y23mhLSKDF84f10a";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        presenter = new MainPresenter(this);
        mBtnTest.setOnClickListener(presenter.getBtnTest(SENSORID, KEY));
        mBtnGetSession.setOnClickListener(presenter.getBtnSession());
    }

    @Override
    public void showInfoSuccess(InfoBean info) {
        ToastUtils.toast(this, info.getMessage(), ToastUtils.LENGTH_SHORT);
        mHello.setText(info.getMessage());
    }

    @Override
    public void showInfoSuccess2(LoginBean info) {
        mHello.setText(info.getLogin_result());
        ToastUtils.toast(this, info.getLogin_result(), ToastUtils.LENGTH_SHORT);
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
