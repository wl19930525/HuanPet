package com.huanpet.huanpet.base;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.huanpet.huanpet.R;
/**
 * Created by 执笔画商
 * on 2018/3/5.
 * at 北京
 */





public abstract class BaseActivity extends AppCompatActivity implements View.OnClickListener {
    private FrameLayout mContentLayout;
    private ImageView img;
    private TextView text_title;
    private RelativeLayout layout_titlebar;
    private TextView regist;
    private ImageView personal;
    private ImageView Orientate;
    private RelativeLayout image_search;

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
        img = (ImageView) findViewById(R.id.imageview_comeback);
        text_title = (TextView) findViewById(R.id.text_title);
        regist = findViewById(R.id.button_regist);
        layout_titlebar = (RelativeLayout) findViewById(R.id.layout_titlebar);
        mContentLayout = (FrameLayout) findViewById(R.id.layout_content);
        personal = findViewById(R.id.image_personal);
        Orientate = findViewById(R.id.image_orientate);

        image_search = findViewById(R.id.search);
    }
    protected abstract int initgetId();

    protected abstract void initData();

    protected abstract void initView();

    protected abstract void initListener();

    protected abstract void initAdapter();



    protected void setComeBackImage(boolean show) {
        if (img != null) {
            if (show) {
                img.setVisibility(View.VISIBLE);
            } else {
                img.setVisibility(View.GONE);
            }
        }
    }

    protected void setTitleText(boolean show) {
        if (text_title != null) {
            if (show) {

                text_title.setVisibility(View.VISIBLE);
            } else {
                text_title.setVisibility(View.GONE);
            }
        }
    }
    protected void setregistButton(boolean show) {
        if (regist != null) {
            if (show) {

                regist.setVisibility(View.VISIBLE);
            } else {
                regist.setVisibility(View.GONE);
            }
        }
    }
    protected void setPersinal(boolean show) {
        if (personal != null) {
            if (show) {

                personal.setVisibility(View.VISIBLE);
            } else {
                personal.setVisibility(View.GONE);
            }
        }
    }
    protected void setOrientate(boolean show) {
        if (Orientate != null) {
            if (show) {

                Orientate.setVisibility(View.VISIBLE);
            } else {
                Orientate.setVisibility(View.GONE);
            }
        }
    }
    protected void setSearchImage(boolean show) {
        if (image_search != null) {
            if (show) {

                image_search.setVisibility(View.VISIBLE);
            } else {
                image_search.setVisibility(View.GONE);
            }
        }
    }

    //设置标题内容
    @Override
    public void setTitle(int titleId) {
        text_title.setText(titleId);
    }

    //设置标题内容
    @Override
    public void setTitle(CharSequence title) {
        text_title.setText(title);
    }

    //设置标题文字颜色
    @Override
    public void setTitleColor(int textColor) {
        text_title.setTextColor(textColor);
    }

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
