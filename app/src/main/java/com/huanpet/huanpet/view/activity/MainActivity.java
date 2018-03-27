package com.huanpet.huanpet.view.activity;


import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.huanpet.huanpet.R;
import com.huanpet.huanpet.base.BaseActivity;
import com.huanpet.huanpet.view.adapter.MyNearPetAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends BaseActivity implements View.OnClickListener {
    private TextView neartext_main;
    private ImageView nearimage_main;
    private LinearLayout near_linear;
    private TextView pwttext_main;
    private ImageView petimage_main;
    private LinearLayout pet_linear;
    private TextView screentext_main;
    private ImageView screenimage_main;
    private LinearLayout screen_linear;
    private LinearLayout linear_main;
    private RecyclerView nearpet_popu;
    private FrameLayout nearpet_frame;
    private Boolean isBool = true;
    private List<String> userList1 = new ArrayList<>();
    private List<String> userList2 = new ArrayList<>();
    private FrameLayout screen_main;
    private TextView selectcity_text;

    @Override
    protected int initgetId() {
        return R.layout.activity_main;
    }

    @Override
    protected void initData() {

    }

    @Override
    protected void initView() {
        setPersinal(true);
        setOrientate(true);
        setSearchImage(true);
        neartext_main = findViewById(R.id.neartext_main);
        pwttext_main = findViewById(R.id.pwttext_main);
        screentext_main = findViewById(R.id.screentext_main);
        screenimage_main = findViewById(R.id.screenimage_main);
        petimage_main = findViewById(R.id.petimage_main);
        nearimage_main = findViewById(R.id.nearimage_main);
        screen_linear = findViewById(R.id.screen_linear);
        screen_linear.setOnClickListener(this);
        pet_linear = findViewById(R.id.pet_linear);
        pet_linear.setOnClickListener(this);
        near_linear = findViewById(R.id.near_linear);
        near_linear.setOnClickListener(this);
        nearpet_popu = findViewById(R.id.nearpet_popu);
        linear_main = findViewById(R.id.linear_main);
        nearpet_frame = findViewById(R.id.nearpet_frame);
        screen_main=findViewById(R.id.screen_main);
        selectcity_text = findViewById(R.id.selectcity_text_main);
        selectcity_text.setOnClickListener(this);
    }

    @Override
    protected void initListener() {

    }

    @Override
    protected void initAdapter() {

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.near_linear:
                Log.e("看看监听", "OK");
                if (isBool) {
                    linear_main.setVisibility(View.GONE);
                    nearpet_frame.setVisibility(View.VISIBLE);
                    nearimage_main.setImageResource(R.drawable.up_arrow);
                    nearpet_popu.setLayoutManager(new LinearLayoutManager(this));
                    if (userList2.size()==0) {
                        userList2.add("附近优先");
                        userList2.add("好评优先");
                        userList2.add("订单优先");
                        userList2.add("价格从高到低");
                        userList2.add("价格从低到高");
                    }
                    nearpet_popu.setAdapter(new MyNearPetAdapter(userList2));
                    isBool = false;
                } else {
                    nearimage_main.setImageResource(R.drawable.down_arrow);
                    nearpet_frame.setVisibility(View.GONE);
                    linear_main.setVisibility(View.VISIBLE);
                    isBool = true;
                }
                break;
            case R.id.pet_linear:
                if (isBool) {
                    linear_main.setVisibility(View.GONE);
                    nearpet_frame.setVisibility(View.VISIBLE);
                    nearpet_popu.setLayoutManager(new LinearLayoutManager(this));
                    if (userList1.size()==0) {
                        userList1.add("小型犬");
                        userList1.add("中型犬");
                        userList1.add("大型犬");
                        userList1.add("猫");
                        userList1.add("小宠");
                        userList1.add("幼犬");
                    }
                    nearpet_popu.setAdapter(new MyNearPetAdapter(userList1));
                    petimage_main.setImageResource(R.drawable.up_arrow);
                    isBool = false;
                } else {
                    petimage_main.setImageResource(R.drawable.down_arrow);
                    nearpet_frame.setVisibility(View.GONE);
                    linear_main.setVisibility(View.VISIBLE);
                    isBool = true;
                }
                break;
            case R.id.screen_linear:
                if (isBool) {
                    linear_main.setVisibility(View.GONE);
                    screen_main.setVisibility(View.VISIBLE);
                    screenimage_main.setImageResource(R.drawable.up_arrow);
                    isBool = false;
                } else {
                    screenimage_main.setImageResource(R.drawable.down_arrow);
                    linear_main.setVisibility(View.VISIBLE);
                    screen_main.setVisibility(View.GONE);
                    isBool = true;
                }
                break;
            case R.id.selectcity_text_main:

                break;
        }
    }
}
