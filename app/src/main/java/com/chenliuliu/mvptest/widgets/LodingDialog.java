package com.chenliuliu.mvptest.widgets;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;

import com.chenliuliu.mvptest.R;

/**
 * Created by liuliuchen on 16/8/11.
 */
public class LodingDialog extends Dialog {


    public LodingDialog(Context context, int themeResId) {
        super(context, themeResId);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dialog_loding);
        this.setCanceledOnTouchOutside(false);
    }
}
