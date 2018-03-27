package com.huanpet.huanpet.view.activity;

import android.content.Intent;
import android.view.View;
import android.widget.TextView;

import com.huanpet.huanpet.R;
import com.huanpet.huanpet.base.BaseActivity;

import org.w3c.dom.Text;

public class MainActivity extends BaseActivity {

    private TextView mtext;

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
        mtext = findViewById(R.id.mtext);

        mtext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent  in = new Intent(MainActivity.this,Add_PetsActivity.class);
                startActivity(in);
            }
        });

    }

    @Override
    protected void initListener() {

    }

    @Override
    protected void initAdapter() {

    }

    @Override
    public void onClick(View v) {

    }
}
