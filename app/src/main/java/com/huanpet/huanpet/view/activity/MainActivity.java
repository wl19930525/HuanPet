package com.huanpet.huanpet.view.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.huanpet.huanpet.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private DrawerLayout mDrawerLayout;
    private ActionBarDrawerToggle mDrawerToggle;

    private ImageView mImage;
    private ImageView image_personal;
    private ImageView image_orientate;
    private ImageView Home_Image;
    private TextView Deawer_name;
    private TextView Deawer_nuber;
    private RelativeLayout head_portrait_linear;
    private LinearLayout information_linear;
    private LinearLayout pet_linear;
    private LinearLayout orderfrom_linear;
    private LinearLayout Need_to_know;
    private LinearLayout set_linear;
    private DrawerLayout dl_left;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initDrawerLayout();
        initView();
        initCeMenu();


    }

    private void initView() {
        Home_Image = (ImageView) findViewById(R.id.Home_Image);
        Home_Image.setOnClickListener(this);
        Deawer_name = (TextView) findViewById(R.id.Deawer_name);
        Deawer_name.setOnClickListener(this);
        Deawer_nuber = (TextView) findViewById(R.id.Deawer_nuber);
        Deawer_nuber.setOnClickListener(this);
        head_portrait_linear = findViewById(R.id.head_portrait_linear);
        head_portrait_linear.setOnClickListener(this);
        information_linear = (LinearLayout) findViewById(R.id.information_linear);
        information_linear.setOnClickListener(this);
        pet_linear = (LinearLayout) findViewById(R.id.pet_linear);
        pet_linear.setOnClickListener(this);
        orderfrom_linear = (LinearLayout) findViewById(R.id.orderfrom_linear);
        orderfrom_linear.setOnClickListener(this);
        Need_to_know = (LinearLayout) findViewById(R.id.Need_to_know);
        Need_to_know.setOnClickListener(this);
        set_linear = (LinearLayout) findViewById(R.id.set_linear);
        set_linear.setOnClickListener(this);
        dl_left = (DrawerLayout) findViewById(R.id.dl_left);
        dl_left.setOnClickListener(this);
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
        mDrawerToggle = new ActionBarDrawerToggle(this, mDrawerLayout, R.string.app_name, R.string.app_name) {
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

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.image_personal:
                initCeMenu();
                break;
            case R.id.image_orientate:
                break;
            case R.id.head_portrait_linear:
                Intent intent = new Intent(MainActivity.this,LoginActivity.class);
                startActivity(intent);
                break;
            case R.id.information_linear:


                break;
            case R.id.pet_linear:
                break;
            case R.id.orderfrom_linear:
                break;
            case R.id.Need_to_know:
                break;
            case R.id.set_linear:
                break;


        }
    }
}
