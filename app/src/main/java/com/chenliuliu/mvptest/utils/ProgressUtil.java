package com.chenliuliu.mvptest.utils;

import android.content.Context;

import com.chenliuliu.mvptest.R;
import com.chenliuliu.mvptest.widgets.LodingDialog;

/**
 * Created by liuliuchen on 16/8/11.
 */
public class ProgressUtil {
    static LodingDialog progressDlg = null;

    public static void showProgressDlg(Context ctx) {
        if (null == progressDlg) {
            progressDlg = new LodingDialog(ctx, R.style.myDialogTheme);
            progressDlg.show();
        }
    }

    /**
     * 结束进度条
     */
    public static void stopProgressDlg() {
        if (null != progressDlg) {
            progressDlg.dismiss();
            progressDlg = null;
        }
    }
}
