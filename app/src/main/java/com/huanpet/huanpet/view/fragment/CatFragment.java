package com.huanpet.huanpet.view.fragment;


import android.support.v4.app.Fragment;
import android.widget.ExpandableListView;
import android.widget.TextView;

import com.huanpet.huanpet.R;
import com.huanpet.huanpet.base.BaseFragment;
import com.huanpet.huanpet.view.adapter.DetailListAdapter;
import com.huanpet.huanpet.view.fragment.catutil.SideIndexBar;

/**
 * A simple {@link Fragment} subclass.
 */
public class CatFragment extends BaseFragment {
    private TextView mText;
    private SideIndexBar sideIndexBar;

    private ExpandableListView expandableListView;
    //private String [] groups={"热门宠物","A", "B", "C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z","#"};
    private String[][] childs={{"暗逝","运上"},{"安和","安贵"},{"北北","悖论"},{"菜牙","才文"}};
    private String [] groups ={"热门宠物","A","B","C"};
    public CatFragment() {

    }

    @Override
    protected void initInfo() {

    }

    @Override
    protected void initData() {
        DetailListAdapter listAdapter = new DetailListAdapter(groups,childs,getActivity());
        expandableListView.setAdapter(listAdapter);
    }

    @Override
    protected void initView() {
        mText = AllVIEW.findViewById(R.id.text_dialog);
        expandableListView = AllVIEW.findViewById(R.id.expandableListView);
        sideIndexBar = AllVIEW.findViewById(R.id.index_bar);
        sideIndexBar.setLetters("ABCDEFGHIJKLMNOPQRSTUVWXYZ#");
        sideIndexBar.setTextDialog(mText);

        sideIndexBar.setOnLetterChangedListener(new SideIndexBar.OnLetterChangedListener() {
            @Override
            public void onChanged(String s, int position) {

            }
        });

    }

    @Override
    protected int getFragmentLayoutID() {
        return R.layout.fragment_cat;
    }


}
