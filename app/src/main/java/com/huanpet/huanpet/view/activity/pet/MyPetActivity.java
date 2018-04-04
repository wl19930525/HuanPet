package com.huanpet.huanpet.view.activity.pet;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.huanpet.huanpet.R;
import com.huanpet.huanpet.bean.MyPetBean;
import com.huanpet.huanpet.view.adapter.MyPetAdapter;

public class MyPetActivity extends AppCompatActivity {

    private RecyclerView MyPet_Recycler;
    private MyPetAdapter myPetAdapter;
    private TextView ChongwuTianjia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_pet);
        initView();
        initData();
        initListener();
    }

    private void initListener() {
        ChongwuTianjia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MyPetActivity.this,Add_PetsActivity.class);
                startActivity(intent);
            }
        });

    }

    private void initData() {
        MyPetBean myPetBean = new MyPetBean();
        myPetAdapter = new MyPetAdapter(this, myPetBean);
        MyPet_Recycler.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        MyPet_Recycler.setAdapter(myPetAdapter);
    }

    private void initView() {
        MyPet_Recycler = (RecyclerView) findViewById(R.id.MyPet_Recycler);
        ChongwuTianjia = (TextView) findViewById(R.id.ChongwuTianjia);

    }
}
