package com.huanpet.huanpet.base;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.amap.api.services.core.LatLonPoint;
import com.amap.api.services.geocoder.GeocodeAddress;
import com.amap.api.services.geocoder.GeocodeQuery;
import com.amap.api.services.geocoder.GeocodeResult;
import com.amap.api.services.geocoder.GeocodeSearch;
import com.amap.api.services.geocoder.RegeocodeResult;
import com.huanpet.huanpet.R;
import com.huanpet.huanpet.view.activity.MainActivity;

import org.greenrobot.eventbus.EventBus;

/**
 * Created by 执笔画商
 * on 2018/3/5.
 * at 北京
 */


public abstract class BaseActivity extends AppCompatActivity{
    private FrameLayout mContentLayout;
    private RelativeLayout layout_titlebar;
    private TextView text_cencel;
    private TextView text_login;
    private LatLonPoint mEndLat;
    private GeocodeSearch mEnd;
    private TextView text_title;
    private TextView text_confirm;
    private ImageView image_comeback;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setupViews();
        setContentView(initgetId());
        initView();
        initData();

    }

    private void setupViews() {
        super.setContentView(R.layout.baseativity);
        layout_titlebar = (RelativeLayout) findViewById(R.id.layout_titlebar);
        mContentLayout = (FrameLayout) findViewById(R.id.layout_content);
        text_cencel = findViewById(R.id.text_cencel);
        text_login = findViewById(R.id.text_login);
        text_title = (TextView) findViewById(R.id.text_title);
        text_confirm = (TextView) findViewById(R.id.text_confirm);
        image_comeback = (ImageView) findViewById(R.id.image_comeback);
    }

    protected abstract int initgetId();

    protected abstract void initData();

    protected abstract void initView();

    protected abstract void initListener();

    protected abstract void initAdapter();


    public void setTitleToShare(String title) {
        GeocodeQuery query = new GeocodeQuery(title, null);
        mEnd.getFromLocationNameAsyn(query);
        mEnd.setOnGeocodeSearchListener(new GeocodeSearch.OnGeocodeSearchListener() {
            @Override
            public void onRegeocodeSearched(RegeocodeResult regeocodeResult, int i) {

            }

            @Override
            public void onGeocodeSearched(GeocodeResult geocodeResult, int i) {
                GeocodeAddress geocodeAddress = geocodeResult.getGeocodeAddressList().get(0);
                mEndLat = geocodeAddress.getLatLonPoint();

                Log.e("看看结尾经纬度", "经度是：" + mEndLat.getLongitude() + ",纬度是：" + mEndLat.getLatitude());
                //精度
                getEditor().putString("longitude", mEndLat.getLongitude() + "").commit();
                //纬度
                getEditor().putString("latitude", mEndLat.getLatitude() + "").commit();


            }
        });
    }

    //获取SharedPreferences对象
    public SharedPreferences getShare() {
        return getSharedPreferences("huanpet", MODE_PRIVATE);
    }

    //获取Editor对象
    public SharedPreferences.Editor getEditor() {
        return getShare().edit();

    }
    //城市筛选确定按钮
    protected void settextconfirm(boolean show) {
        if (text_confirm != null) {
            if (show) {

                text_confirm.setVisibility(View.VISIBLE);
            } else {
                text_confirm.setVisibility(View.GONE);
            }
        }
    }
    //城市筛选返回按钮
    protected void setimagecomeback(boolean show) {
        if (image_comeback != null) {
            if (show) {

                image_comeback.setVisibility(View.VISIBLE);
            } else {
                image_comeback.setVisibility(View.GONE);
            }
        }
    }

    protected void settextcencel(boolean show) {
        if (text_cencel != null) {
            if (show) {

                text_cencel.setVisibility(View.VISIBLE);
            } else {
                text_cencel.setVisibility(View.GONE);
            }
        }
    }

    //登录
    protected void setTextlogin(boolean show) {
        if (text_login != null) {
            if (show) {

                text_login.setVisibility(View.VISIBLE);
            } else {
                text_login.setVisibility(View.GONE);
            }
        }
    }

    //标题栏
    protected void setlinearBase(boolean show) {
        if (layout_titlebar != null) {
            if (show) {

                layout_titlebar.setVisibility(View.VISIBLE);
            } else {
                layout_titlebar.setVisibility(View.GONE);
            }
        }
    }

    //设置标题内容

    protected void settexttitle(boolean show) {
        if (text_title != null) {
            if (show) {

                text_title.setVisibility(View.VISIBLE);
            } else {
                text_title.setVisibility(View.GONE);
            }
        }
    }




    //取出FrameLayout并调用父类removeAllViews()方法
    @Override
    public void setContentView(int layoutResID) {
        mContentLayout.removeAllViews();
        View.inflate(this, layoutResID, mContentLayout);
        onContentChanged();
    }

    @Override
    public void setContentView(View view) {
        mContentLayout.removeAllViews();
        mContentLayout.addView(view);
        onContentChanged();
    }

    /* (non-Javadoc)
     * @see android.app.Activity#setContentView(android.view.View, android.view.ViewGroup.LayoutParams)
     */
    @Override
    public void setContentView(View view, ViewGroup.LayoutParams params) {
        mContentLayout.removeAllViews();
        mContentLayout.addView(view, params);
        onContentChanged();
    }

}
