package com.bawie.duqilin20200409.view.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.bawie.duqilin20200409.R;
import com.bawie.duqilin20200409.model.bean.HomeBean;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/*
 *@auther:杜其林
 *@Date: 2020/4/9
 *@Time:14:30
 *@Description:${DESCRIPTION}
 * */
public class Adapter1 extends RecyclerView.Adapter<Adapter1.MyViewHoder> {

    private List<HomeBean.OrderListBean> orderList;

    public Adapter1(List<HomeBean.OrderListBean> orderList) {

        this.orderList = orderList;
    }

    @NonNull
    @Override
    public MyViewHoder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.item, null);
        return new MyViewHoder(inflate);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHoder holder, int position) {
        HomeBean.OrderListBean orderListBean = orderList.get(position);
        holder.name.setText(orderListBean.getOrderId());
        holder.price.setText(orderListBean.getExpressCompName());

        List<HomeBean.OrderListBean.DetailListBean> detailList = orderListBean.getDetailList();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(holder.itemView.getContext());
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        holder.rva.setLayoutManager(linearLayoutManager);
        Adapter2 adapter2 = new Adapter2(detailList);
        holder.rva.setAdapter(adapter2);
    }

    @Override
    public int getItemCount() {
        return orderList.size();
    }

    public class MyViewHoder extends RecyclerView.ViewHolder {

        @BindView(R.id.name)
        TextView name;
        @BindView(R.id.rva)
        RecyclerView rva;
        @BindView(R.id.price)
        TextView price;

        public MyViewHoder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
