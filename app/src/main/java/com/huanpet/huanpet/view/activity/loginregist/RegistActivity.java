package com.huanpet.huanpet.view.activity.loginregist;

import android.content.Intent;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.huanpet.huanpet.R;
import com.huanpet.huanpet.base.BaseActivity;
import com.huanpet.huanpet.untils.CJSON;
import com.huanpet.huanpet.untils.CallBackListener;
import com.huanpet.huanpet.untils.HttpUntils;
import com.huanpet.huanpet.view.activity.loginregist.loginbean.EventBusBean.EventBusBean;

import org.greenrobot.eventbus.EventBus;

import java.util.HashMap;
import java.util.Map;

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
        settextcencel(true);
        setTextlogin(true);
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

        if (isPhoneNumber(RegistPhonenumber) && isPassWord(RegistPassword)) {


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

            //这里没打印出来
            EventBus.getDefault().postSticky((new EventBusBean(RegistPhonenumber, RegistPassword)));

            Intent intent = new Intent(RegistActivity.this, LoginActivity.class);
            startActivity(intent);

            finish();
        } else {
            return;
        }
    }

    public  boolean isPhoneNumber(String number) {
    /*
    移动：134、135、136、137、138、139、150、151、152、157(TD)、158、159、178(新)、182、184、187、188
    联通：130、131、132、152、155、156、185、186
    电信：133、153、170、173、177、180、181、189、（1349卫通）
    总结起来就是第一位必定为1，第二位必定为3或5或8，其他位置的可以为0-9
    */
        String num = "[1][34578]\\d{9}";//"[1]"代表第1位为数字1，"[34578]"代表第二位可以为3、4、5、7、8中的一个，"\\d{9}"代表后面是可以是0～9的数字，有9位。
        if (TextUtils.isEmpty(number)) {
            Toast.makeText(RegistActivity.this, "用户名不合格", Toast.LENGTH_SHORT).show();
            return false;
        } else {
            //matches():字符串是否在给定的正则表达式匹配
            return number.matches(num);
        }
    }

    public boolean isPassWord(String pass) {

        if (pass.length() < 6) {
            Toast.makeText(this, "密码长度不能小于6位", Toast.LENGTH_SHORT).show();
            return false;
        } else if (pass.length() > 12) {
            Toast.makeText(this, "密码长度不能大于12位", Toast.LENGTH_SHORT).show();
            return false;
        } else {
            Toast.makeText(this, "注册成功", Toast.LENGTH_SHORT).show();
            return true;
        }
    }

    public boolean isUserName(String name) {

        if (name.length() < 3) {
            Toast.makeText(this, "用户名不合格，请重新输入", Toast.LENGTH_SHORT).show();
            return false;
        } else if (name.contains(" ")) {
            Toast.makeText(this, "用户名不合法", Toast.LENGTH_SHORT).show();
            return false;
        } else {
            return true;
        }

    }
}
