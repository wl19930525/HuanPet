package com.huanpet.huanpet.view.activity.loginregist;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.Nullable;
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
import com.lzy.okhttputils.OkHttpUtils;
import com.lzy.okhttputils.callback.StringCallback;
import com.lzy.okhttputils.request.PostRequest;

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

    @Override
    protected int initgetId() {
        return R.layout.activity_regist;
    }

    @Override
    protected void initData() {
        //Map<String,String> map = new HashMap<>();
        //map.put("data",
        // "{
        //
        // \"header\":{
        // \"sign\":\"EE2DCEEBB1EF53EBEF46A92B2BA91B7D\",
        // \"ip\":\"172.16.48.7\",
        // \"channel\":\"android\",
        // \"token\":\"EE2DCEEBB1EF53EBEF46A92B2BA91B7D\"},
        // \"body\":{
        // \"userPhone\":\"17611030319\",
        // \"userName\":\"ww123456\",
        // \"password\":\"E99F09F4B9F871A8789EF7E736AE8F5F\"
        // },
        // }\"");

        /**
         * {
         "header": {
         "sign": "EE2DCEEBB1EF53EBEF46A92B2BA91B7D",
         "ip": "172.28.24.3",
         “token”:” EE2DCEEBB1EF53EBEF46A92B2BA91B7D”,
         "channel": "android"
         },
         "body": {
         "userPhone": "18234834396",
         “userName”:”琉夏”,
         “password”:”123456”
         }
         }

         */

        Map<String, Object> param = new HashMap<>();
        param.put("userPhone", "17611030319");
        param.put("userName", "ww12345");
        param.put("password", Md5Encrypt.md5("wl7639319", "UTF-8"));
        String jsonMap = CJSON.toJSONMap(param);
        OkHttpClient okHttpClient = new OkHttpClient();
        FormBody formBody = new FormBody.Builder().add("data",jsonMap).build();
        Request request = new Request.Builder().url("http://123.56.150.230:8885/dog_family/user/register.jhtml").post(formBody).build();
        okHttpClient.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                Log.e("_____----————",e.getMessage());
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                String string = response.body().string();
                Log.e("_____----——————",string);
            }
        });

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


    @Override
    public void onClick(View v) {

    }
}
