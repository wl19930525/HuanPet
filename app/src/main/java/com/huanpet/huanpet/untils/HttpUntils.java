package com.huanpet.huanpet.untils;

import android.util.Log;

import com.google.gson.Gson;

import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.FormBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by 执笔画商
 * on 2018/3/23.
 * at 北京
 */

public class HttpUntils implements IoHttp{

    private static OkHttpClient okHttpClient = null;

    private static  HttpUntils okHttpUtils;

    public HttpUntils() {
        okHttpClient = new OkHttpClient.Builder().build();
    }

    public static HttpUntils getInstance() {
        if(okHttpUtils==null){
            synchronized (HttpUntils.class){
                if(okHttpUtils==null){
                    okHttpUtils = new HttpUntils();
                }
            }
        }
        return okHttpUtils;

    }

    @Override
    public <T> void get(String url,final CallBackListener<T> callback) {
        final Request request = new Request.Builder().url(url).build();
        okHttpClient.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                callback.Error(e.getMessage());
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                String result = response.body().string();
                Gson gson = new Gson();
                Type tt = ((ParameterizedType)callback.getClass().getGenericSuperclass()).getActualTypeArguments()[0];
                T t =  gson.fromJson(result,tt);

                callback.Success(t);
            }
        });
    }

    @Override
    public <T> void post(String url, String string,final CallBackListener<T> callback) {

        FormBody data = new FormBody.Builder().add("data",string).build();

        Request post = new Request.Builder().url(url).post(data).build();
        okHttpClient.newCall(post).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                callback.Error(e.getMessage());

            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                String result = response.body().string();
                /*Gson gson = new Gson();

                Type[] tt =   callback.getClass().getGenericInterfaces();

                Type[] tp =   ((ParameterizedType)tt[0]).getActualTypeArguments();
                Type t = tp[0];

                T tr =  gson.fromJson(result,t);*/

                callback.Success((T) result);

            }
        });
    }
}
