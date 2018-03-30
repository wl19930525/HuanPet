package com.huanpet.huanpet.view.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.amap.api.maps.AMap;
import com.amap.api.maps.MapView;
import com.huanpet.huanpet.R;

public class OrientateActivity extends AppCompatActivity {
    AMap aMap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_orientate);
        MapView mapView = (MapView) findViewById(R.id.map);
        mapView.onCreate(savedInstanceState);


        if (aMap == null) {
            aMap = mapView.getMap();
        }
    }
}
