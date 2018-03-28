package com.huanpet.huanpet.screen;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.amap.api.services.core.LatLonPoint;
import com.amap.api.services.geocoder.GeocodeAddress;
import com.amap.api.services.geocoder.GeocodeQuery;
import com.amap.api.services.geocoder.GeocodeResult;
import com.amap.api.services.geocoder.GeocodeSearch;
import com.amap.api.services.geocoder.RegeocodeResult;
import com.huanpet.huanpet.R;
import com.huanpet.huanpet.base.BaseActivity;
import com.huanpet.huanpet.screen.adapter.CityAdapter;
import com.huanpet.huanpet.screen.adapter.SortAdapter;
import com.huanpet.huanpet.screen.view.CitySortModel;
import com.huanpet.huanpet.screen.view.EditTextWithDel;
import com.huanpet.huanpet.screen.view.PinyinComparator;
import com.huanpet.huanpet.screen.view.PinyinUtils;
import com.huanpet.huanpet.screen.view.SideBar;
import com.huanpet.huanpet.view.activity.MainActivity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 筛选Activity
 */
public class ScreenActivity extends BaseActivity implements View.OnClickListener{
    private ListView sortListView;
    private SideBar sideBar;
    private TextView dialog;
    private SortAdapter adapter;
    private EditTextWithDel mEtCityName;
    private List<CitySortModel> SourceDateList;
    private TextView text_confirm;
    private ImageView image_comeback;
    @Override
    protected int initgetId() {
        return R.layout.activity_screen;
    }

    @Override
    protected void initData() {

    }

    @Override
    protected void initView() {
        setTitle("城市筛选");
        settexttitle(true);
        settextconfirm(true);
        setimagecomeback(true);
        mEtCityName = (EditTextWithDel) findViewById(R.id.et_search);
        sideBar = (SideBar) findViewById(R.id.sidrbar);
        dialog = (TextView) findViewById(R.id.dialog);
        sortListView = (ListView) findViewById(R.id.country_lvcountry);
        text_confirm = findViewById(R.id.text_confirm);
        text_confirm.setOnClickListener(this);
        image_comeback = findViewById(R.id.image_comeback);
        image_comeback.setOnClickListener(this);
        initDatas();
        initEvents();
        setAdapter();
    }

    @Override
    protected void initListener() {

    }

    @Override
    protected void initAdapter() {

    }

    private void setAdapter() {
        SourceDateList = filledData(getResources().getStringArray(R.array.provinces));
        Collections.sort(SourceDateList, new PinyinComparator());
        adapter = new SortAdapter(this, SourceDateList);
        sortListView.addHeaderView(initHeadView());
        sortListView.setAdapter(adapter);
    }

    private void initEvents() {
        //设置右侧触摸监听
        sideBar.setOnTouchingLetterChangedListener(new SideBar.OnTouchingLetterChangedListener() {
            @Override
            public void onTouchingLetterChanged(String s) {
                //该字母首次出现的位置
                int position = adapter.getPositionForSection(s.charAt(0));
                if (position != -1) {
                    sortListView.setSelection(position + 1);
                }
            }
        });

        //ListView的点击事件
        sortListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Toast.makeText(getApplication(), ((CitySortModel) adapter.getItem(position)).getName(), Toast.LENGTH_SHORT).show();
               /* setTitleToShare(((CitySortModel) adapter.getItem(position)).getName());
                Intent intent = getIntent();
                intent.putExtra("city",((CitySortModel) adapter.getItem(position)).getName());
                setResult(100,intent);
                finish();*/
//                intent.setClass(MainActivity.this, SecondActivity.class);
//                MainActivity.this.startActivity(intent);
            }
        });

        //根据输入框输入值的改变来过滤搜索
        mEtCityName.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                //当输入框里面的值为空，更新为原来的列表，否则为过滤数据列表
                filterData(s.toString());
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }

    private void initDatas() {
        sideBar.setTextView(dialog);
    }

    private View initHeadView() {
        View headView = getLayoutInflater().inflate(R.layout.headview, null);
        GridView mGvCity = (GridView) headView.findViewById(R.id.gv_hot_city);
        String[] datas = getResources().getStringArray(R.array.city);
        ArrayList<String> cityList = new ArrayList<>();
        for (int i = 0; i < datas.length; i++) {
            cityList.add(datas[i]);
        }
        CityAdapter adapter = new CityAdapter(getApplicationContext(), R.layout.gridview_item, cityList);
        mGvCity.setAdapter(adapter);
        return headView;
    }

    /**
     * 根据输入框中的值来过滤数据并更新ListView
     *
     * @param filterStr
     */
    private void filterData(String filterStr) {
        List<CitySortModel> mSortList = new ArrayList<>();
        if (TextUtils.isEmpty(filterStr)) {
            mSortList = SourceDateList;
        } else {
            mSortList.clear();
            for (CitySortModel sortModel : SourceDateList) {
                String name = sortModel.getName();
                if (name.toUpperCase().indexOf(filterStr.toString().toUpperCase()) != -1 || PinyinUtils.getPingYin(name).toUpperCase().startsWith(filterStr.toString().toUpperCase())) {
                    mSortList.add(sortModel);
                }
            }
        }
        // 根据a-z进行排序
        Collections.sort(mSortList, new PinyinComparator());
        adapter.updateListView(mSortList);
    }

    private List<CitySortModel> filledData(String[] date) {
        List<CitySortModel> mSortList = new ArrayList<>();
        ArrayList<String> indexString = new ArrayList<>();

        for (int i = 0; i < date.length; i++) {
            CitySortModel sortModel = new CitySortModel();
            sortModel.setName(date[i]);
            String pinyin = PinyinUtils.getPingYin(date[i]);
            String sortString = pinyin.substring(0, 1).toUpperCase();
            if (sortString.matches("[A-Z]")) {
                sortModel.setSortLetters(sortString.toUpperCase());
                if (!indexString.contains(sortString)) {
                    indexString.add(sortString);
                }
            }
            mSortList.add(sortModel);
        }
        Collections.sort(indexString);
        sideBar.setIndexText(indexString);
        return mSortList;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.image_comeback:
                finish();
                break;
            case R.id.text_confirm:
                finish();
                break;
        }
    }
}

