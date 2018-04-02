package com.huanpet.huanpet.view.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.huanpet.huanpet.R;
import com.huanpet.huanpet.bean.MyPetBean;
import com.squareup.picasso.Picasso;

/**
 * Created by 执笔画商
 * on 2018/3/30.
 * at 北京
 */


public class MyPetAdapter extends RecyclerView.Adapter<MyPetAdapter.ViewHolder> {
    private Context context;
    private MyPetBean myPetBean;

    public MyPetAdapter(Context context, MyPetBean myPetBean) {
        this.context = context;
        this.myPetBean = myPetBean;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.pet_item,null);
        ViewHolder viewHolder = new ViewHolder(inflate);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Picasso.with(context).load(String.valueOf(myPetBean.getPetImageportrait())).into(holder.petImageportrait);
        Picasso.with(context).load(String.valueOf(myPetBean.getPetSex())).into(holder.petSex);
        holder.perTitle.setText(myPetBean.getPerTitle());
        holder.introduce.setText(myPetBean.getIntroduce());
    }

    @Override
    public int getItemCount() {
        return 3;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private final ImageView petImageportrait;
        private final TextView perTitle;
        private final TextView introduce;
        private final ImageView petSex;

        public ViewHolder(View itemView) {
            super(itemView);
            petImageportrait = itemView.findViewById(R.id.imageView_petportrait);
            perTitle = itemView.findViewById(R.id.perTitle);
            introduce = itemView.findViewById(R.id.introduce);
            petSex = itemView.findViewById(R.id.petSex);
        }
    }
}
