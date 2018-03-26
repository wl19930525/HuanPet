package com.huanpet.huanpet.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by 吕楠 on 2018/3/26.
 */

public abstract class BaseFragment extends Fragment{

    private View AllVIEW;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        AllVIEW = inflater.inflate(getFragmentLayoutID(),null);
        initView();
        initData();
        initInfo();
        return AllVIEW;

    }

    protected abstract void initInfo();

    protected abstract void initData();

    protected abstract void initView();

    protected abstract int getFragmentLayoutID();
}
