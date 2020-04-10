package com.bawie.zy0408.view.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bawie.zy0408.R;
import com.bawie.zy0408.model.bean.HomeBean;
import com.bumptech.glide.Glide;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/*
 *@auther:杜其林
 *@Date: 2020/4/8
 *@Time:20:46
 *@Description:${DESCRIPTION}
 * */
public class OrderForm2Adapter extends RecyclerView.Adapter<OrderForm2Adapter.MyViewHolder> {


    private List<HomeBean.OrderListBean.DetailListBean> detailList;

    public OrderForm2Adapter(List<HomeBean.OrderListBean.DetailListBean> detailList) {

        this.detailList = detailList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_orderfrom2, null);
        return new MyViewHolder(inflate);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        HomeBean.OrderListBean.DetailListBean detailListBean = detailList.get(position);
        holder.tvname.setText(detailListBean.getCommodityName());
        holder.tvprice.setText(detailListBean.getCommodityPrice()+"");
        String commodityPic = detailListBean.getCommodityPic();
        String[] split = commodityPic.split(",");
        Glide.with(holder.img).load(split[0]).into(holder.img);
    }

    @Override
    public int getItemCount() {
        return detailList.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.img)
        ImageView img;
        @BindView(R.id.tvname)
        TextView tvname;
        @BindView(R.id.tvprice)
        TextView tvprice;

        public MyViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}

