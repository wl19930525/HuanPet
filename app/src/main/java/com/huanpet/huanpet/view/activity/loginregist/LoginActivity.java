package com.huanpet.huanpet.view.activity.loginregist;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import com.huanpet.huanpet.R;
import com.huanpet.huanpet.base.BaseActivity;


public class LoginActivity extends BaseActivity implements View.OnClickListener {


    private ImageView imageview_comeback;
    private TextView button_regist;
    private EditText Username;
    private EditText Password;
    private TextView textView;
    private Button button_login;
    private TextView Forgetpassword;
    private FrameLayout frameLayout;
    private ImageView image_QQ;
    private ImageView image_Weixin;
    private TextView textView2;
    private TextView textView3;

    @Override
    protected int initgetId() {
        return R.layout.activity_login;
    }

    @Override
    protected void initData() {

    }

    @Override
    protected void initView() {
       setlinearBase(false);
        imageview_comeback = findViewById(R.id.imageview_comeback);
        imageview_comeback.setOnClickListener(this);
        button_regist = findViewById(R.id.button_regist);
        button_regist.setOnClickListener(this);
        Username = findViewById(R.id.Username);
        Username.setOnClickListener(this);
        Password = findViewById(R.id.Password);
        Password.setOnClickListener(this);
        button_login = findViewById(R.id.button_login);
        button_login.setOnClickListener(this);
        Forgetpassword = findViewById(R.id.Forgetpassword);
        Forgetpassword.setOnClickListener(this);
        image_QQ = findViewById(R.id.image_QQ);
        image_QQ.setOnClickListener(this);
        image_Weixin = findViewById(R.id.image_Weixin);
        image_Weixin.setOnClickListener(this);

    }

    @Override
    protected void initListener() {

    }

    @Override
    protected void initAdapter() {

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            //注册监听
            case R.id.button_regist:
                Intent intent = new Intent(LoginActivity.this, RegistActivity.class);
                startActivity(intent);
                break;
            //登录监听
            case R.id.button_login:
                break;
            //忘记密码
            case R.id.Forgetpassword:
                break;
            //第三方QQ
            case R.id.image_QQ:
                break;
            //第三方微信
            case R.id.image_Weixin:
                break;
            case R.id.imageview_comeback:
                finish();
                break;
        }
    }


}
