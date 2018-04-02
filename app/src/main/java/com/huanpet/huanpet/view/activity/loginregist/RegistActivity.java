package com.huanpet.huanpet.view.activity.loginregist;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.huanpet.huanpet.R;
import com.huanpet.huanpet.base.BaseActivity;
import com.huanpet.huanpet.mapdemo.ToastUtil;
import com.huanpet.huanpet.untils.AppUtils;
import com.huanpet.huanpet.untils.CJSON;
import com.huanpet.huanpet.untils.CallBackListener;
import com.huanpet.huanpet.untils.ConnectionUtils;
import com.huanpet.huanpet.untils.HttpUntils;
import com.huanpet.huanpet.untils.Md5Encrypt;
import com.huanpet.huanpet.view.activity.loginregist.loginbean.EventBusBean.EventBusBean;
import com.lzy.okhttputils.OkHttpUtils;
import com.lzy.okhttputils.callback.StringCallback;
import com.lzy.okhttputils.request.PostRequest;

import org.greenrobot.eventbus.EventBus;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import cn.sharesdk.framework.ShareSDK;
import cn.smssdk.SMSSDK;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.FormBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import static com.umeng.socialize.utils.DeviceConfig.context;

public class RegistActivity extends BaseActivity implements View.OnClickListener {

    private Handler mHandler;
    private TextView text_cencel;
    private TextView text_login;
    private EditText editRegistPhonenumber;
    private Button btnRegistVerificationCode;
    private EditText editRegistVerificationcode;
    private EditText editRegistUsername;
    private EditText editRegistPassword;
    private Button buttonRegist;
    private ImageView imgRegistQQRegist;
    private ImageView imgRegistWeixinRegist;
    private String phone1;
    private String username1;
    private String password1;

    private String RegistPhonenumber;
    private String RegistVerificationcode;
    private String RegistUsername;
    private String RegistPassword;

    @Override
    protected int initgetId() {
        return R.layout.activity_regist;
    }

    @Override
    protected void initData() {

    }

    @Override
    protected void initView() {
        editRegistPhonenumber = findViewById(R.id.editRegist_phonenumber);
        editRegistVerificationcode = findViewById(R.id.editRegist_Verificationcode);
        editRegistUsername = findViewById(R.id.editRegist_username);
        editRegistPassword = findViewById(R.id.editRegist_password);
        buttonRegist = findViewById(R.id.button_regist);
        buttonRegist.setOnClickListener(this);
    }

    @Override
    protected void initListener() {

    }

    @Override
    protected void initAdapter() {

    }


    @Override
    public void onClick(View v) {
        RegistPhonenumber = editRegistPhonenumber.getText().toString().trim();
        RegistVerificationcode = editRegistVerificationcode.getText().toString().trim();
        RegistUsername = editRegistUsername.getText().toString().trim();
        RegistPassword = editRegistPassword.getText().toString().trim();
        isPhoneNumber(RegistPhonenumber);
        isPassWord(RegistPassword);
        isUserName(RegistUsername);
        String url = "http://123.56.150.230:8885/dog_family/user/register.jhtml";
        Map<String, Object> param = new HashMap<>();
        param.put("userPhone", RegistPhonenumber);
        param.put("userName", RegistUsername);
        param.put("password", RegistPassword);

        String s = CJSON.toJSONMap(param);

        HttpUntils.getInstance().post(url, s, new CallBackListener<Object>() {
            @Override
            public void Error(String string) {

            }

            @Override
            public void Success(Object o) {

            }
        });

    }

    public void isPhoneNumber(String number) {

        String num = "[1][34578]\\d{9}";//"[1]"代表第1位为数字1，"[34578]"代表第二位可以为3、4、5、7、8中的一个，"\\d{9}"代表后面是可以是0～9的数字，有9位。
        if (TextUtils.isEmpty(number)) {
            Toast.makeText(RegistActivity.this, "手机号不能为空", Toast.LENGTH_SHORT).show();
        }
        if (!number.matches(num)) {
            Toast.makeText(this, "手机号输入有误", Toast.LENGTH_SHORT).show();
        }

    }

    public void isPassWord(String pass) {
        if (pass.length() < 6) {
            Toast.makeText(RegistActivity.this, "密码长度不能小于6位", Toast.LENGTH_SHORT).show();
        } else if (pass.length() > 12) {
            Toast.makeText(this, "密码长度不能大于12位", Toast.LENGTH_SHORT).show();
        } else if (pass.contains(" ")) {
            Toast.makeText(this, "密码不能有空格", Toast.LENGTH_SHORT).show();
        } else if (pass.isEmpty()) {
            Toast.makeText(this, "密码不能为空", Toast.LENGTH_SHORT).show();
        }
    }

    public void isUserName(String name) {

        if (name.length() <= 2) {
            Toast.makeText(this, "用户名不能小于两位", Toast.LENGTH_SHORT).show();
        } else if (name.contains(" ")) {
            Toast.makeText(this, "用户名不能有空格", Toast.LENGTH_SHORT).show();
        } else if (name.contains("/")) {
            Toast.makeText(this, "用户名不能有非法字符", Toast.LENGTH_SHORT).show();
        } else if (name.isEmpty()) {
            Toast.makeText(this, "用户名不能为空", Toast.LENGTH_SHORT).show();
        } else {

            EventBus.getDefault().postSticky((new EventBusBean(RegistPhonenumber, RegistPassword)));

            Intent intent = new Intent(RegistActivity.this, LoginActivity.class);
            startActivity(intent);

            finish();
        }
    }
}
