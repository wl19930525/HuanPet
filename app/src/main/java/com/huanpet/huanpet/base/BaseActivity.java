package com.huanpet.huanpet.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by 执笔画商
 * on 2018/3/23.
 * at 北京
 */

public abstract class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getlayoutiD());

        initview();

        initData();
    }
    protected abstract void initData();

    protected abstract void initview();


    public abstract int getlayoutiD();
}
