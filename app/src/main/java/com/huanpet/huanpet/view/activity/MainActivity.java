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

=======
import android.content.Intent;

import android.view.View;
=======
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import android.widget.TextView;

import com.huanpet.huanpet.R;

import org.w3c.dom.Text;

public class MainActivity extends BaseActivity {

    private TextView mtext;


    @Override
    protected int initgetId() {
        return R.layout.activity_main;
    }

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private DrawerLayout mDrawerLayout;
    private ActionBarDrawerToggle mDrawerToggle;

    private ImageView mImage;
    private ImageView image_personal;
    private ImageView image_orientate;
    private ImageView Home_Image;
    private TextView Deawer_name;
    private TextView Deawer_nuber;
    private LinearLayout head_portrait_linear;
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

        mtext = findViewById(R.id.mtext);

        mtext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent  in = new Intent(MainActivity.this,Add_PetsActivity.class);
                startActivity(in);
            }
        });


    }

    private void initView() {
        Home_Image = (ImageView) findViewById(R.id.Home_Image);
        Home_Image.setOnClickListener(this);
        Deawer_name = (TextView) findViewById(R.id.Deawer_name);
        Deawer_name.setOnClickListener(this);
        Deawer_nuber = (TextView) findViewById(R.id.Deawer_nuber);
        Deawer_nuber.setOnClickListener(this);
        head_portrait_linear = (LinearLayout) findViewById(R.id.head_portrait_linear);
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
            case R.id.image_personal:
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
