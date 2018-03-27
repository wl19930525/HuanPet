package com.huanpet.huanpet.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.huanpet.huanpet.R;
/**
 * Created by 执笔画商
 * on 2018/3/5.
 * at 北京
 */





public abstract class BaseActivity extends AppCompatActivity implements View.OnClickListener {
public abstract class BaseActivity extends AppCompatActivity {
    private FrameLayout mContentLayout;
    private RelativeLayout layout_titlebar;
    private TextView text_cencel;
    private TextView text_login;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setupViews();
        setContentView(initgetId());
        initView();
        initData();
//        fjdlfkgdfdetgersssssssss
    }

    private void setupViews() {
        super.setContentView(R.layout.baseativity);
        layout_titlebar = (RelativeLayout) findViewById(R.id.layout_titlebar);
        mContentLayout = (FrameLayout) findViewById(R.id.layout_content);
        text_cencel = findViewById(R.id.text_cencel);
        text_login = findViewById(R.id.text_login);
    }

    protected abstract int initgetId();

    protected abstract void initData();

    protected abstract void initView();

    protected abstract void initListener();

    protected abstract void initAdapter();




    protected void settextcencel(boolean show) {
        if (text_cencel != null) {
            if (show) {

                text_cencel.setVisibility(View.VISIBLE);
            } else {
                text_cencel.setVisibility(View.GONE);
            }
        }
    }
    protected void setTextlogin(boolean show) {
        if (text_login != null) {
            if (show) {

                text_login.setVisibility(View.VISIBLE);
            } else {
                text_login.setVisibility(View.GONE);
            }
        }
    }
    protected void setlinearBase(boolean show) {
        if (layout_titlebar != null) {
            if (show) {

                layout_titlebar.setVisibility(View.VISIBLE);
            } else {
                layout_titlebar.setVisibility(View.GONE);
            }
        }
    }

    /*//设置标题内容
    @Override
    public void setTitle(int titleId) {
        regist.setText(titleId);
    }

    //设置标题内容
    @Override
    public void setTitle(CharSequence title) {
        regist.setText(title);
    }

    //设置标题文字颜色
    @Override
    public void setTitleColor(int textColor) {
        regist.setTextColor(textColor);
    }*/

    public void setBarColor(int textColor) {
        layout_titlebar.setBackgroundResource(textColor);
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
