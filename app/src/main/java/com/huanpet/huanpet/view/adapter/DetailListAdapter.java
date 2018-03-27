package com.huanpet.huanpet.view.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

import com.huanpet.huanpet.R;

/**
 * Created by 吕楠 on 2018/3/26.
 */

public class DetailListAdapter extends BaseExpandableListAdapter {

    private String[] groups;
    private String[][] childs;
    private Context context;

    public DetailListAdapter(String[] groups, String[][] childs, Context context) {
        this.groups = groups;
        this.childs = childs;
        this.context = context;
    }

    @Override
    public int getGroupCount() {
        return groups.length;
    }

    @Override
    public int getChildrenCount(int i) {

        return childs[i].length;
    }

    @Override
    public Object getGroup(int i) {
        return groups[i];
    }

    @Override
    public Object getChild(int i, int i1) {
        return childs[i][i1];
    }

    @Override
    public long getGroupId(int i) {
        return i;
    }

    @Override
    public long getChildId(int i, int i1) {
        return i1;
    }

    @Override
    public boolean hasStableIds() {
        return true;
    }

    @Override
    public View getGroupView(int i, boolean b, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = LayoutInflater.from(context).inflate(R.layout.list_item, null);

        }
        TextView textView = view.findViewById(R.id.text_listitem);
        textView.setText(groups[i]);
        return view;
    }

    @Override
    public View getChildView(int i, int i1, boolean b, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = LayoutInflater.from(context).inflate(R.layout.list_item2, null);
        }
        TextView textView = view.findViewById(R.id.text_listitem2);
        textView.setText(childs[i][i1]);
        return view;
    }

    @Override
    public boolean isChildSelectable(int i, int i1) {
        return true;
    }

}
