package com.huanpet.huanpet.view.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.huanpet.huanpet.R;
import com.huanpet.huanpet.bean.HomeBase;
import com.huanpet.huanpet.presenter.DatailsPresenter;
import com.huanpet.huanpet.presenter.contract.Contract;
import com.huanpet.huanpet.untils.CJSON;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.datatype.Duration;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.FormBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class DtailsActivity extends AppCompatActivity implements Contract.ViewInf{
    private String url="http://123.56.150.230:8885/dog_family/users/getUsersInfoByVO.jhtml";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dtails);
        Map<String,Object> map=new HashMap<>();
        map.put("beginIndex","0");
        map.put("coordX","40.116384");
        map.put("coordY","116.250374");
        map.put("endIndex","10");
        map.put("orderBy","distance asc");
        String s = CJSON.toJSON0(map);
        FormBody data = new FormBody.Builder().add("data",s).build();
        Request post = new Request.Builder().url(url).post(data).build();
        OkHttpClient okHttpClient=new OkHttpClient.Builder().build();
        okHttpClient.newCall(post).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                Log.e("看看报错",e.getMessage());
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                Toast.makeText(DtailsActivity.this, "toast", Toast.LENGTH_SHORT).show();
                Log.e("看看集合",response.body().string());
            }
        });


    }
    public String getCJson(){
        Map<String,Object> map=new HashMap<>();
        map.put("userId","d80488022f1e4278a3149f54beeac02a");
        String s = CJSON.toJSON0(map);
        return s;
    }

    @Override
    public <T> void UpdataUi(T t) {
        Log.e("Datails",t.toString());
    }

    @Override
    public void upDataHomeUi(List<HomeBase.DescBean> list) {

    }
}
