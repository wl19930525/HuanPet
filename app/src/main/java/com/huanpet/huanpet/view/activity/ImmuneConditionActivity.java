package com.huanpet.huanpet.view.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Switch;

import com.huanpet.huanpet.R;

public class ImmuneConditionActivity extends AppCompatActivity {
    private Switch aSwitch;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_immune_condition);
        aSwitch = findViewById(R.id.switch_btn);
    }
}
