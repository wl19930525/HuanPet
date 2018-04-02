package com.huanpet.huanpet.view.activity.loginregist;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.MainThread;
import android.support.annotation.Nullable;
import android.telephony.gsm.GsmCellLocation;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;
import com.huanpet.huanpet.R;
import com.huanpet.huanpet.base.BaseActivity;
import com.huanpet.huanpet.untils.CJSON;
import com.huanpet.huanpet.untils.CallBackListener;
import com.huanpet.huanpet.untils.HttpUntils;
import com.huanpet.huanpet.view.activity.loginregist.loginbean.EventBusBean.EventBusBean;
import com.huanpet.huanpet.view.activity.loginregist.loginbean.LoginBean;
import com.lzy.okhttputils.https.HttpsUtils;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

import java.util.HashMap;


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


    private String userName;
    private String passWord;

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
                getLogin();
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

    private void getLogin() {
        userName = Username.getText().toString().trim();
        passWord = Password.getText().toString().trim();

        String url = "http://123.56.150.230:8885/dog_family/user/login.jhtml";
        HashMap<String, Object> map = new HashMap<>();
        map.put("userPhone", userName);
        map.put("password", passWord);
        String s = CJSON.toJSONMap(map);
        HttpUntils.getInstance().post(url, s, new CallBackListener<LoginBean>() {
            @Override
            public void Error(String string) {

            }

            @Override
            public void Success(LoginBean loginBean) {

            }
        });
    }

    @Subscribe(sticky = true,threadMode = ThreadMode.MAIN)
    public void OnEvents(EventBusBean eventBusBean) {
        Username.setText(eventBusBean.getUsername());
        Password.setText(eventBusBean.getPassword());
    }

    @Override
    protected void onStop() {
        super.onStop();
        if (EventBus.getDefault().isRegistered(this)) {
            EventBus.getDefault().unregister(this);
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        EventBus.getDefault().register(this);
    }
}
