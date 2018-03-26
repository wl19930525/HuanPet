package com.huanpet.huanpet.view.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RadioGroup;

import com.huanpet.huanpet.R;
import com.huanpet.huanpet.base.BaseActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private DrawerLayout mDrawerLayout;
    private String[] lvs = {"消息", "信息", "宠物", "手机"};
    private ActionBarDrawerToggle mDrawerToggle;
    private ArrayAdapter mAdapter;

    private ImageView mImage;
    private ImageView image_personal;
    private ImageView image_orientate;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initDrawerLayout();
        initView();

        initCeMenu();



    }

    private void initView() {

    }

    private void initDrawerLayout() {
        mDrawerLayout = (DrawerLayout) findViewById(R.id.dl_left);
        mImage = (ImageView) findViewById(R.id.Home_Image);
        image_personal = (ImageView) findViewById(R.id.image_personal);
        image_orientate = (ImageView) findViewById(R.id.image_orientate);
        mImage.setOnClickListener(this);
        image_orientate.setOnClickListener(this);
        image_personal.setOnClickListener(this);
    }

    //??????4
    private void initCeMenu() {
        mDrawerToggle  = new ActionBarDrawerToggle(this, mDrawerLayout, R.string.app_name, R.string.app_name) {
            @Override
            public void onDrawerOpened(View drawerView) {
                super.onDrawerOpened(drawerView);
            }

            @Override
            public void onDrawerClosed(View drawerView) {
                super.onDrawerClosed(drawerView);
            }
        };
        mDrawerToggle.syncState();
        mDrawerLayout.setDrawerListener(mDrawerToggle);
    }





    private void startIntent(Context context, Class cls) {
        startActivity(new Intent(context, cls));
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.image_personal:
                mDrawerToggle.syncState();
                mDrawerLayout.setDrawerListener(mDrawerToggle);
                break;
            case R.id.image_orientate:
                break;
        }
    }
}
