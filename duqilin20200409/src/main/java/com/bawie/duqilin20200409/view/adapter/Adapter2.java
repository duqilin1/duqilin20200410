package com.bawie.duqilin20200409.view.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bawie.duqilin20200409.R;
import com.bawie.duqilin20200409.model.bean.HomeBean;
import com.bumptech.glide.Glide;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/*
 *@auther:杜其林
 *@Date: 2020/4/9
 *@Time:14:30
 *@Description:${DESCRIPTION}
 * */
public class Adapter2 extends RecyclerView.Adapter<Adapter2.MyViewHoder> {

    private List<HomeBean.OrderListBean.DetailListBean> detailList;

    public Adapter2(List<HomeBean.OrderListBean.DetailListBean> detailList) {

        this.detailList = detailList;
    }

    @NonNull
    @Override
    public MyViewHoder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.item1, null);
        return new MyViewHoder(inflate);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHoder holder, int position) {
        HomeBean.OrderListBean.DetailListBean detailListBean = detailList.get(position);
        holder.name.setText(detailListBean.getCommodityName());
        holder.price.setText(detailListBean.getCommodityPrice()+"");
        Glide.with(holder.img)
                .load(detailListBean.getCommodityPic())
                .into(holder.img);
    }

    @Override
    public int getItemCount() {
        return detailList.size();
    }

    public class MyViewHoder extends RecyclerView.ViewHolder {

        @BindView(R.id.img)
        ImageView img;
        @BindView(R.id.name)
        TextView name;
        @BindView(R.id.price)
        TextView price;

        public MyViewHoder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
