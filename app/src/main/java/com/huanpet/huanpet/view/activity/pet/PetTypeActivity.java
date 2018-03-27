package com.huanpet.huanpet.view.activity.pet;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.widget.FrameLayout;
import android.widget.RadioGroup;
import android.widget.SearchView;

import com.huanpet.huanpet.R;
import com.huanpet.huanpet.base.BaseActivity;
import com.huanpet.huanpet.view.fragment.CatFragment;
import com.huanpet.huanpet.view.fragment.DogFragment;
import com.huanpet.huanpet.view.fragment.SmallpetFragment;

import butterknife.BindView;

public class PetTypeActivity extends BaseActivity implements RadioGroup.OnCheckedChangeListener {

    RadioGroup radioGroup;
    FrameLayout frameLayout;
    @BindView(R.id.searchView_petType)
    SearchView searchView;

    private FragmentManager manager;

    private CatFragment catFragment;
    private DogFragment dogFragment;
    private SmallpetFragment smallpetFragment;

    @Override
    protected int initgetId() {
        return R.layout.activity_pet_type;
    }

    @Override
    protected void initData() {
        catFragment = new CatFragment();
        dogFragment = new DogFragment();
        smallpetFragment = new SmallpetFragment();
        FragmentTransaction fragmentTransaction = manager.beginTransaction();
        fragmentTransaction.replace(R.id.frameLayout_petType, catFragment);
        fragmentTransaction.commit();
    }

    @Override
    protected void initView() {
        radioGroup = findViewById(R.id.rdogroup_petType);
        frameLayout =findViewById(R.id.frameLayout_petType);
        manager = getSupportFragmentManager();
        radioGroup.setOnCheckedChangeListener(this);
    }

    @Override
    protected void initListener() {

    }

    @Override
    protected void initAdapter() {

    }

    @Override
    public void onCheckedChanged(RadioGroup radioGroup, int i) {
        switch (i) {
            case R.id.rdobtn_first:
                if (manager == null){
                    return;
                }
                FragmentTransaction fragmentTransaction = manager.beginTransaction();
                fragmentTransaction.replace(R.id.frameLayout_petType, dogFragment);
                fragmentTransaction.commit();
                break;
            case R.id.rdobtn_second:
                if (manager == null){
                    return;
                }
                FragmentTransaction fragmentTransaction2 = manager.beginTransaction();
                fragmentTransaction2.replace(R.id.frameLayout_petType, catFragment);
                fragmentTransaction2.commit();
                break;
            case R.id.rdobtn_thrid:
                if (manager == null){
                    return;
                }
                FragmentTransaction fragmentTransaction3 = manager.beginTransaction();
                fragmentTransaction3.replace(R.id.frameLayout_petType, smallpetFragment);
                fragmentTransaction3.commit();
                break;
        }
    }
}
