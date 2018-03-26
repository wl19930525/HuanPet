package com.huanpet.huanpet.view.activity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.huanpet.huanpet.R;
import com.huanpet.huanpet.base.BaseActivity;

public class RegistActivity extends BaseActivity {

    private EditText edi_phonenumber;
    private EditText edi_Verificationcode;
    private EditText edi_username;
    private EditText edi_password;

    private Button btn_Verificationcode;
    private Button btn_regist;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regist);
    }

    @Override
    protected int initgetId() {
        return R.layout.activity_regist;
    }

    @Override
    protected void initData() {

    }

    @Override
    protected void initView() {

    }

    @Override
    protected void initListener() {

    }

    @Override
    protected void initAdapter() {

    }

}
