package com.huanpet.huanpet.view.activity;

import com.huanpet.huanpet.R;
import com.huanpet.huanpet.base.BaseActivity;

public class MainActivity extends BaseActivity {
    @Override
    protected int initgetId() {
        return R.layout.activity_main;
    }

    @Override
    protected void initData() {

    }

    @Override
    protected void initView() {
        setPersinal(true);
        setOrientate(true);
        setSearchImage(true);
    }

    @Override
    protected void initListener() {

    }

    @Override
    protected void initAdapter() {

    }

}
