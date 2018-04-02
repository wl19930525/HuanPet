package com.huanpet.huanpet.view.activity;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.huanpet.huanpet.R;
import com.huanpet.huanpet.bean.HomeBase;
import com.huanpet.huanpet.presenter.Presenter;
import com.huanpet.huanpet.presenter.contract.Contract;
import com.huanpet.huanpet.screen.ScreenActivity;
import com.huanpet.huanpet.untils.CJSON;

import com.huanpet.huanpet.untils.CallBackListener;
import com.huanpet.huanpet.untils.HttpUntils;
import com.huanpet.huanpet.untils.Md5Encrypt;
import com.huanpet.huanpet.view.activity.loginregist.LoginActivity;
import com.huanpet.huanpet.view.adapter.HomeListAdapter;

import com.huanpet.huanpet.untils.Md5Encrypt;
import com.huanpet.huanpet.view.activity.loginregist.LoginActivity;
import com.huanpet.huanpet.view.activity.pet.MyPetActivity;

import com.huanpet.huanpet.view.adapter.MyNearPetAdapter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.FormBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;




public class MainActivity extends AppCompatActivity implements View.OnClickListener ,Contract.ViewInf{
    private ImageView image_personal;
    private ImageView image_orientate;
    private LinearLayout search;
    private EditText editText;
    private ImageView imageView;
    private TextView neartext_main;
    private ImageView nearimage_main;
    private LinearLayout near_linear;
    private TextView pwttext_main;
    private ImageView petimage_main;
    private LinearLayout pet_linear2;
    private TextView screentext_main;
    private ImageView screenimage_main;
    private LinearLayout screen_linear;
    private LinearLayout linear_main;
    private RecyclerView nearpet_popu;
    private FrameLayout nearpet_frame;
    private TextView selectcity_text_main;
    private ImageView choice;
    private Button location;
    private Button shower;
    private Button shuttle;
    private Button egg;
    private Button spring;
    private Button qingming;
    private Button labour;
    private Button dragonBoat;
    private Button mid_autumn;
    private Button national;
    private Button reset;
    private Button determine;
    private FrameLayout screen_main;
    private ImageView Home_Image;
    private TextView Deawer_nuber;
    private TextView Deawer_name;
    private ImageView image_go;
    private RelativeLayout head_portrait_linear;
    private LinearLayout information_linear;
    private LinearLayout pet_linear;
    private LinearLayout orderfrom_linear;
    private LinearLayout Need_to_know;
    private LinearLayout set_linear;
    private Button button_application;
    private DrawerLayout dl_left;
    private ImageView mImage;
    private ActionBarDrawerToggle mDrawerToggle;
    private DrawerLayout mDrawerLayout;
    private Boolean isBool = true;
    private List<String> userList1 = new ArrayList<>();
    private List<String> userList2 = new ArrayList<>();
    private String url="http://123.56.150.230:8885/dog_family/users/getUsersInfoByVO.jhtml";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new Presenter(this).doSumshing2(url,getCJson());
        initView();
        initDrawerLayout();
        getCJson();
        initCeMenu();


    }
    public String getCJson(){
        Map<String,Object> map=new HashMap<>();
        map.put("beginIndex","0");
        map.put("coordX","40.116384");
        map.put("coordY","116.250374");
        map.put("endIndex","10");
        map.put("orderBy","distance asc");
        String s = CJSON.toJSON0(map);
        return s;

        initData();
    }

    private void initData() {

    }



    private void initView() {

        image_personal = (ImageView) findViewById(R.id.image_personal);
        image_personal.setOnClickListener(this);
        image_orientate = (ImageView) findViewById(R.id.image_orientate);
        image_orientate.setOnClickListener(this);
        search =findViewById(R.id.search);
        search.setOnClickListener(this);
        editText = (EditText) findViewById(R.id.editText);
        editText.setOnClickListener(this);
        imageView = (ImageView) findViewById(R.id.imageView);
        imageView.setOnClickListener(this);
        neartext_main = (TextView) findViewById(R.id.neartext_main);
        neartext_main.setOnClickListener(this);
        nearimage_main = (ImageView) findViewById(R.id.nearimage_main);
        nearimage_main.setOnClickListener(this);
        near_linear = (LinearLayout) findViewById(R.id.near_linear);
        near_linear.setOnClickListener(this);
        pwttext_main = (TextView) findViewById(R.id.pwttext_main);
        pwttext_main.setOnClickListener(this);
        petimage_main = (ImageView) findViewById(R.id.petimage_main);
        petimage_main.setOnClickListener(this);
        pet_linear2 = (LinearLayout) findViewById(R.id.pet_linear2);
        pet_linear2.setOnClickListener(this);
        screentext_main = (TextView) findViewById(R.id.screentext_main);
        screentext_main.setOnClickListener(this);
        screenimage_main = (ImageView) findViewById(R.id.screenimage_main);
        screenimage_main.setOnClickListener(this);
        screen_linear = (LinearLayout) findViewById(R.id.screen_linear);
        screen_linear.setOnClickListener(this);
        linear_main = (LinearLayout) findViewById(R.id.linear_main);
        linear_main.setOnClickListener(this);
        nearpet_popu = (RecyclerView) findViewById(R.id.nearpet_popu);
        nearpet_popu.setOnClickListener(this);
        nearpet_frame = (FrameLayout) findViewById(R.id.nearpet_frame);
        nearpet_frame.setOnClickListener(this);
        selectcity_text_main = (TextView) findViewById(R.id.selectcity_text_main);
        selectcity_text_main.setOnClickListener(this);
        choice = (ImageView) findViewById(R.id.choice);
        choice.setOnClickListener(this);
        location = (Button) findViewById(R.id.location);
        location.setOnClickListener(this);
        shower = (Button) findViewById(R.id.shower);
        shower.setOnClickListener(this);
        shuttle = (Button) findViewById(R.id.shuttle);
        shuttle.setOnClickListener(this);
        egg = (Button) findViewById(R.id.egg);
        egg.setOnClickListener(this);
        spring = (Button) findViewById(R.id.spring);
        spring.setOnClickListener(this);
        qingming = (Button) findViewById(R.id.qingming);
        qingming.setOnClickListener(this);
        labour = (Button) findViewById(R.id.labour);
        labour.setOnClickListener(this);
        dragonBoat = (Button) findViewById(R.id.dragonBoat);
        dragonBoat.setOnClickListener(this);
        mid_autumn = (Button) findViewById(R.id.mid_autumn);
        mid_autumn.setOnClickListener(this);
        national = (Button) findViewById(R.id.national);
        national.setOnClickListener(this);
        reset = (Button) findViewById(R.id.reset);
        reset.setOnClickListener(this);
        determine = (Button) findViewById(R.id.determine);
        determine.setOnClickListener(this);
        screen_main = (FrameLayout) findViewById(R.id.screen_main);
        screen_main.setOnClickListener(this);
        Home_Image = (ImageView) findViewById(R.id.Home_Image);
        Home_Image.setOnClickListener(this);
        Deawer_nuber = (TextView) findViewById(R.id.Deawer_nuber);
        Deawer_nuber.setOnClickListener(this);
        Deawer_name = (TextView) findViewById(R.id.Deawer_name);
        Deawer_name.setOnClickListener(this);
        image_go = (ImageView) findViewById(R.id.image_go);
        image_go.setOnClickListener(this);
        head_portrait_linear = (RelativeLayout) findViewById(R.id.head_portrait_linear);
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
        button_application = (Button) findViewById(R.id.button_application);
        button_application.setOnClickListener(this);
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

            case R.id.near_linear:
                Log.e("看看监听", "OK");
                if (isBool) {
                    linear_main.setVisibility(View.GONE);
                    nearpet_frame.setVisibility(View.VISIBLE);
                    nearimage_main.setImageResource(R.mipmap.up_arrow);
                    petimage_main.setImageResource(R.mipmap.down_arrow);
                    screenimage_main.setImageResource(R.mipmap.down_arrow);
                    nearpet_popu.setLayoutManager(new LinearLayoutManager(this));
                    if (userList2.size() == 0) {
                        userList2.add("附近优先");
                        userList2.add("好评优先");
                        userList2.add("订单优先");
                        userList2.add("价格从高到低");
                        userList2.add("价格从低到高");
                    }
                    nearpet_popu.setAdapter(new MyNearPetAdapter(userList2));
                    isBool = false;
                } else {
                    nearimage_main.setImageResource(R.mipmap.down_arrow);
                    nearpet_frame.setVisibility(View.GONE);
                    linear_main.setVisibility(View.VISIBLE);
                    isBool = true;
                }
                break;
            case R.id.pet_linear2:
                if (isBool) {
                    linear_main.setVisibility(View.GONE);
                    nearpet_frame.setVisibility(View.VISIBLE);
                    nearpet_popu.setLayoutManager(new LinearLayoutManager(this));
                    if (userList1.size() == 0) {
                        userList1.add("小型犬");
                        userList1.add("中型犬");
                        userList1.add("大型犬");
                        userList1.add("猫");
                        userList1.add("小宠");
                        userList1.add("幼犬");
                    }
                    nearpet_popu.setAdapter(new MyNearPetAdapter(userList1));
                    petimage_main.setImageResource(R.mipmap.up_arrow);
                    screenimage_main.setImageResource(R.mipmap.down_arrow);
                    nearimage_main.setImageResource(R.mipmap.down_arrow);
                    isBool = false;
                } else {
                    petimage_main.setImageResource(R.mipmap.down_arrow);
                    nearpet_frame.setVisibility(View.GONE);
                    linear_main.setVisibility(View.VISIBLE);
                    isBool = true;
                }
                break;
            case R.id.screen_linear:
                if (isBool) {
                    linear_main.setVisibility(View.GONE);
                    screen_main.setVisibility(View.VISIBLE);
                    screenimage_main.setImageResource(R.mipmap.up_arrow);
                    nearimage_main.setImageResource(R.mipmap.down_arrow);
                    petimage_main.setImageResource(R.mipmap.down_arrow);
                    isBool = false;
                } else {
                    screenimage_main.setImageResource(R.mipmap.down_arrow);
                    linear_main.setVisibility(View.VISIBLE);
                    screen_main.setVisibility(View.GONE);
                    isBool = true;
                }
                break;

            case R.id.selectcity_text_main:
                Intent intent1 = new Intent(MainActivity.this, ScreenActivity.class);
                startActivity(intent1);
                break;
            case R.id.image_personal:
                break;
            case R.id.image_orientate:
                Intent intent2 = new Intent(MainActivity.this,OrientateActivity.class);
                startActivity(intent2);
                break;
            case R.id.head_portrait_linear:
                Intent intent = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(intent);
                break;
            case R.id.information_linear:
                break;
            case R.id.pet_linear:
                Intent intent3 = new Intent(MainActivity.this, MyPetActivity.class);
                startActivity(intent3);
                break;
            case R.id.orderfrom_linear:
                break;
            case R.id.Need_to_know:
                break;
            case R.id.set_linear:
                break;


        }
    }

    @Override
    public <T> void UpdataUi(T t) {

    }

    @Override
    public void upDataHomeUi(List<HomeBase.DescBean> list) {

        RecyclerView recy=findViewById(R.id.home_recy_main);
        recy.setLayoutManager(new LinearLayoutManager(MainActivity.this));
        HomeListAdapter adapter = new HomeListAdapter(list, MainActivity.this);
        recy.setAdapter(adapter);
    }



}
