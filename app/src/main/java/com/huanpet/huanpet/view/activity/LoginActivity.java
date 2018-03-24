package com.huanpet.huanpet.view.activity;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


import com.huanpet.huanpet.R;
import com.huanpet.huanpet.base.BaseActivity;


public class LoginActivity extends BaseActivity{


    private TextView regist;
    private ImageView comeback;

    @Override
    protected int initgetId() {
        return R.layout.activity_login;
    }

    @Override
    protected void initData() {

    }

    @Override
    protected void initView() {
        regist = findViewById(R.id.button_regist);
        comeback = findViewById(R.id.imageview_comeback);
    }

    @Override
    protected void initListener() {

    }

    @Override
    protected void initAdapter() {

    }

    @Override
    public void onClick(View v) {

    }
}
