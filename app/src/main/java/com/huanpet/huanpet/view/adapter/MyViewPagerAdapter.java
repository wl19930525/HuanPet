package com.huanpet.huanpet.view.adapter;

import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.List;

/**
 * Created by 执笔画商
 * on 2018/3/5.
 * at 北京
 */

public class MyViewPagerAdapter extends PagerAdapter {
    private List<ImageView> imagelist;

    public MyViewPagerAdapter(List<ImageView> imagelist) {
        this.imagelist = imagelist;
    }

    @Override
    public int getCount() {
        return imagelist.size();
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view==object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        container.addView(imagelist.get(position));
        return imagelist.get(position);
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView(imagelist.get(position));
    }
}
