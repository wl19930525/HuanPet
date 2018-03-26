package com.huanpet.huanpet.view.activity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.huanpet.huanpet.R;
import com.huanpet.huanpet.view.adapter.MyViewPagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 执笔画商
 * on 2018/3/23.
 * at 北京
 */


public class YindaoyeActivity extends AppCompatActivity implements View.OnClickListener{

    int[] intlist = {R.mipmap.pager01,R.mipmap.pager02,R.mipmap.pager03};
    private ViewPager vp;
    private LinearLayout linear;
    private Button btn_ent;
    private List<ImageView> imlist;
    private List<ImageView> imagelist;
    private SharedPreferences sp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yindaoye);
        initView();
        initData();
        initAdapter();
        initListener();
        sp = getSharedPreferences("config", MODE_PRIVATE);
         boolean flag = sp.getBoolean("flag", false);
        if (flag){
            enterDeal();
            return;
        }
    }
    private void initAdapter() {
        MyViewPagerAdapter viewPagerAdapter = new MyViewPagerAdapter(imlist);
        vp.setAdapter(viewPagerAdapter);
    }
    private void initListener() {
        vp.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                for (int i = 0; i < intlist.length; i++) {
                    if (position == i) {
                        imagelist.get(i).setImageResource(R.drawable.cicleshape);
                    } else {
                        imagelist.get(i).setImageResource(R.drawable.cicleshapehui);
                    }
                }
                if (position == imlist.size() - 1) {
                    btn_ent.setVisibility(View.VISIBLE);
                    linear.setVisibility(View.GONE);
                }else {
                    btn_ent.setVisibility(View.GONE);
                    linear.setVisibility(View.VISIBLE);
                }

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }

    private void initData() {


        imlist = new ArrayList<>();
        for (int i = 0; i <intlist.length ; i++) {
        ImageView imageView = new ImageView(this);
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setImageResource(intlist[i]);

            imlist.add(imageView);
        }
        imagelist = new ArrayList<>();
        for (int i = 0; i < intlist.length; i++) {

            ImageView imageView = new ImageView(this);
            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,LinearLayout.LayoutParams.WRAP_CONTENT);
            params.height = 30;
            params.width = 30;
            params.rightMargin = 10;
            params.leftMargin= 10;
            imageView.setLayoutParams(params);
            if (i==0){
                imageView.setImageResource(R.drawable.cicleshape);
            }else {
                imageView.setImageResource(R.drawable.cicleshapehui);

            }
            imagelist.add(imageView);
            linear.addView(imageView);


        }

    }

    private void initView() {
        vp = (ViewPager) findViewById(R.id.vp);
        linear = (LinearLayout) findViewById(R.id.linear);
        btn_ent = (Button) findViewById(R.id.btn_enter);

        btn_ent.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_enter:

                SharedPreferences.Editor edit = sp.edit();
                edit.putBoolean("flag", true);
                edit.commit();

                Intent intent = new Intent(YindaoyeActivity.this,MainActivity.class);
                startActivity(intent);
                finish();
                break;
        }
    }
    public void enterDeal() {
// 点击跳转
        Intent intent = new Intent(YindaoyeActivity.this,MainActivity.class);
        startActivity(intent);
        finish();
    }

}
