package com.huanpet.huanpet.view.activity.loginregist;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.huanpet.huanpet.R;
import com.huanpet.huanpet.base.BaseActivity;
import com.huanpet.huanpet.untils.CallBackListener;
import com.huanpet.huanpet.untils.HttpUntils;
import com.huanpet.huanpet.untils.Md5Encrypt;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import butterknife.BindView;
import butterknife.ButterKnife;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.FormBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class RegistActivity extends BaseActivity implements View.OnClickListener{


    @BindView(R.id.textView4)
    TextView textView4;
    @BindView(R.id.editRegist_phonenumber)
    EditText editRegistPhonenumber;
    @BindView(R.id.btnRegist_VerificationCode)
    Button btnRegistVerificationCode;
    @BindView(R.id.editRegist_Verificationcode)
    EditText editRegistVerificationcode;
    @BindView(R.id.editRegist_username)
    EditText editRegistUsername;
    @BindView(R.id.editRegist_password)
    EditText editRegistPassword;
    @BindView(R.id.button_regist)
    Button buttonRegist;
    @BindView(R.id.textView)
    TextView textView;
    @BindView(R.id.imgRegist_QQRegist)
    ImageView imgRegistQQRegist;
    @BindView(R.id.imgRegist_weixinRegist)
    ImageView imgRegistWeixinRegist;
    @BindView(R.id.textView7)
    TextView textView7;
    @BindView(R.id.textView5)
    TextView textView5;
    String url = "http://123.56.150.230:8885/dog_family/user/register.jhtml";
    private TextView text_cencel;
    private TextView text_login;

    @Override
    protected int initgetId() {
        return R.layout.activity_regist;
    }

    @Override
    protected void initData() {
        Map<String,String> headmap = new HashMap<>();
        Map<String,String> bodymap = new HashMap<>();
        headmap.put("sign","AF8318B333BD98A29A3FFE7194FBACFE");
        headmap.put("ip","172.16.48.7");
        headmap.put("token","1DF094171F873B8DF64F9AABCE3D82BC");
        headmap.put("channel","android");

        bodymap.put("aaa","17611030319");
        bodymap.put("userName","wl19930525");
        bodymap.put("password", Md5Encrypt.md5("ww12345678", "UTF-8"));

        OkHttpClient okHttpClient = new OkHttpClient();
        FormBody.Builder body = new FormBody.Builder();
        body.add("uuu","\"{\"+\"\"header\":{\"sign\"+\"EE2DCEEBB1EF53EBEF46A92B2BA91B7D\",\"ip\":\"172.16.45.18\",\"token\":\"EE2DCEEBB1EF53EBEF46A92B2BA91B7D\",\"channel\":\"android\"},\"body\":{\"userPhone\":\"17611030319\",\"userName\":\"wanglei\",\"password\":\"wl12345678\"\"");
        Request.Builder post = new Request.Builder().url(url).post(body.build());
        Request request = post.build();
        okHttpClient.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {

            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                String string = response.body().string();
                Log.e("------",string);
            }
        });


    }

    @Override
    protected void initView() {
        settextcencel(true);
        setTextlogin(true);
        text_cencel = findViewById(R.id.text_cencel);
        text_cencel.setOnClickListener(this);
        text_login = findViewById(R.id.text_login);
        text_login.setOnClickListener(this);
    }

    @Override
    protected void initListener() {

    }

    @Override
    protected void initAdapter() {

    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.text_cencel:
                finish();
                break;
            case R.id.text_login:
                Intent intent = new Intent(this,LoginActivity.class);
                startActivity(intent);
                break;
        }
    }
}
