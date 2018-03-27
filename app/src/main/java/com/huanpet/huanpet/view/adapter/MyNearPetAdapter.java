package com.huanpet.huanpet.view.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.huanpet.huanpet.R;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by mMaster
 * on 2018/3/26.
 * at 北京
 */

public class MyNearPetAdapter extends RecyclerView.Adapter<MyNearPetAdapter.MyViewHolder>{
    private List<String> resultBeans;
    private Boolean isBool=true;


    public MyNearPetAdapter(List<String> resultBeans) {
        this.resultBeans = resultBeans;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
       View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.itemnear_recy, parent, false);
       MyViewHolder myViewHolder = new MyViewHolder(inflate);

       return myViewHolder;
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, final int position) {
        holder.text1.setText(resultBeans.get(position));
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                        if (isBool) {
                            holder.image.setVisibility(View.VISIBLE);
                            isBool = false;
                        } else {
                            holder.image.setVisibility(View.GONE);
                            isBool = true;
                        }

                }
        });
        holder.itemView.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                onc.onLongClick(position);

                return true;
            }
        });
    }

    @Override
    public int getItemCount() {
        return resultBeans.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        private final ImageView image;
        private final TextView text1;

        public MyViewHolder(View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.imagenear_item);
            text1 = itemView.findViewById(R.id.textnear_item);
        }
    }
    public interface OnClick{
        void onClick(int position);
        void onLongClick(int position);
    }
    private OnClick onc;
    public void setOnClickListener(OnClick onc){
        this.onc=onc;
    }
}
