package com.huanpet.huanpet.view.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import com.huanpet.huanpet.R;
import com.huanpet.huanpet.bean.HomeBase;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by mMaster
 * on 2018/3/30.
 * at 北京
 */

public class HomeListAdapter extends RecyclerView.Adapter<HomeListAdapter.MyViewHolder> {
    private List<HomeBase.DescBean> resultBeans;
    private Context mContext;

    public HomeListAdapter(List<HomeBase.DescBean> resultBeans, Context mContext) {
        this.resultBeans = resultBeans;
        this.mContext = mContext;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
       View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_main_recycler, parent, false);
       MyViewHolder myViewHolder = new MyViewHolder(inflate);

       return myViewHolder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, final int position) {
        Picasso.with(mContext).load(resultBeans.get(position).getUserImage()).into(holder.image);
        holder.name.setText(resultBeans.get(position).getFamily());
        holder.id.setText(resultBeans.get(position).getAddress());
        String pric="￥";
        String pricend="起";
        holder.pric.setText(pric+resultBeans.get(position).getPrice()+pricend);
        float score =(float) resultBeans.get(position).getScore();
        holder.viewById.setRating(score);
        holder.viewById.setStepSize(((float)0.5));
        holder.viewById.setIsIndicator(true);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


            }
        });
        holder.itemView.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {


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
        private final TextView name;
        private final TextView pric;
        private final TextView id;
        private final RatingBar viewById;

        public MyViewHolder(View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.image_item_main);
            name = itemView.findViewById(R.id.textName_item_main);
            viewById = itemView.findViewById(R.id.ratingbar_item_main);
            id = itemView.findViewById(R.id.textID_item_main);
            pric = itemView.findViewById(R.id.textPics_item_main);

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
