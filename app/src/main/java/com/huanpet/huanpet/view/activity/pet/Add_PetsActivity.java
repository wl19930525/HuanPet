package com.huanpet.huanpet.view.activity.pet;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.huanpet.huanpet.R;

public class Add_PetsActivity extends AppCompatActivity implements View.OnClickListener{
    private TextView pet_head;
    private ImageView pet_head_img;
    private RelativeLayout pet_head_layout;
    private TextView pet_name;
    private ImageView pet_name_img;
    private RelativeLayout pet_name_laout;
    private TextView pet_type;
    private ImageView pet_type_img;
    private RelativeLayout person_type_layout;
    private TextView pet_sterilization;
    private ImageView pet_sterilization_img;
    private RelativeLayout pet_sterilization_layout;
    private TextView pet_date;
    private ImageView pet_date_img;
    private RelativeLayout pet_date_layout;
    private TextView pet_weight;
    private ImageView pet_weight_img;
    private RelativeLayout pet_weight_layout;
    private TextView person_immune;
    private TextView person_immune_tv;
    private ImageView person_immune_img;
    private RelativeLayout person_immune_layout_wenzi;
    private RelativeLayout pet_immune_layout;
    private EditText pet_introduce_editext;
    private RelativeLayout pet_introduce_layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add__pets);
        initView();
    }

    private void initView() {
        pet_head = (TextView) findViewById(R.id.pet_head);
        pet_head_img = (ImageView) findViewById(R.id.pet_head_img);
        pet_head_layout = (RelativeLayout) findViewById(R.id.pet_head_layout);
        pet_name = (TextView) findViewById(R.id.pet_name);
        pet_name_img = (ImageView) findViewById(R.id.pet_name_img);
        pet_name_laout = (RelativeLayout) findViewById(R.id.pet_name_laout);
        pet_type = (TextView) findViewById(R.id.pet_type);
        pet_type_img = (ImageView) findViewById(R.id.pet_type_img);
        person_type_layout = (RelativeLayout) findViewById(R.id.person_type_layout);
        person_type_layout.setOnClickListener(this);
        pet_sterilization = (TextView) findViewById(R.id.pet_sterilization);
        pet_sterilization_img = (ImageView) findViewById(R.id.pet_sterilization_img);
        pet_sterilization_layout = (RelativeLayout) findViewById(R.id.pet_sterilization_layout);
        pet_date = (TextView) findViewById(R.id.pet_date);
        pet_date_img = (ImageView) findViewById(R.id.pet_date_img);
        pet_date_layout = (RelativeLayout) findViewById(R.id.pet_date_layout);
        pet_weight = (TextView) findViewById(R.id.pet_weight);
        pet_weight_img = (ImageView) findViewById(R.id.pet_weight_img);
        pet_weight_layout = (RelativeLayout) findViewById(R.id.pet_weight_layout);
        person_immune = (TextView) findViewById(R.id.person_immune);
        person_immune_tv = (TextView) findViewById(R.id.person_immune_tv);
        person_immune_img = (ImageView) findViewById(R.id.person_immune_img);
        person_immune_layout_wenzi = (RelativeLayout) findViewById(R.id.person_immune_layout_wenzi);
        person_immune_layout_wenzi.setOnClickListener(this);
        pet_immune_layout = (RelativeLayout) findViewById(R.id.pet_immune_layout);
        pet_introduce_editext = (EditText) findViewById(R.id.pet_introduce_editext);
        pet_introduce_layout = (RelativeLayout) findViewById(R.id.pet_introduce_layout);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.person_immune_layout_wenzi:
                Intent intent = new Intent(Add_PetsActivity.this,ImmuneConditionActivity.class);
                startActivity(intent);
                break;
            case R.id.person_type_layout:
                Intent intent1 = new Intent(Add_PetsActivity.this,PetTypeActivity.class);
                startActivity(intent1);
                break;
        }
    }
}
