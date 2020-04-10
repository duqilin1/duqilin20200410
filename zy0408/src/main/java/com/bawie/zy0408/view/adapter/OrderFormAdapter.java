package com.bawie.zy0408.view.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.bawie.zy0408.R;
import com.bawie.zy0408.model.bean.HomeBean;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/*
 *@auther:杜其林
 *@Date: 2020/4/8
 *@Time:20:45
 *@Description:${DESCRIPTION}
 * */
public class OrderFormAdapter extends RecyclerView.Adapter<OrderFormAdapter.MyViewHolder> {

    private List<HomeBean.OrderListBean> orderList;

    public OrderFormAdapter(List<HomeBean.OrderListBean> orderList) {

        this.orderList = orderList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_orderfrom, null);
        return new MyViewHolder(inflate);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        HomeBean.OrderListBean orderListBean = orderList.get(position);
        holder.tvDing.setText("订单号 "+orderListBean.getOrderId());
        holder.tvTime.setText(orderListBean.getOrderTime()+"");
        List<HomeBean.OrderListBean.DetailListBean> detailList = orderListBean.getDetailList();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(holder.itemView.getContext());
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        holder.rvA.setLayoutManager(linearLayoutManager);
        OrderForm2Adapter orderForm2Adapter = new OrderForm2Adapter(detailList);
        holder.rvA.setAdapter(orderForm2Adapter);
    }

    @Override
    public int getItemCount() {
        return orderList.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.tv_ding)
        TextView tvDing;
        @BindView(R.id.rv_a)
        RecyclerView rvA;
        @BindView(R.id.tv_time)
        TextView tvTime;

        public MyViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
