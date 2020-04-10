package com.bawie.duqilin20200408.view.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import com.bawie.duqilin20200408.R;
import com.bawie.duqilin20200408.model.bean.HomeBean;
import com.bumptech.glide.Glide;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/*
 *@auther:杜其林
 *@Date: 2020/4/8
 *@Time:14:23
 *@Description:${DESCRIPTION}
 * */
public class HomeAdapter2 extends RecyclerView.Adapter<HomeAdapter2.MyViewHolder> {

    private List<HomeBean.ResultBean.ShoppingCartListBean> shoppingCartList;

    public HomeAdapter2(List<HomeBean.ResultBean.ShoppingCartListBean> shoppingCartList) {

        this.shoppingCartList = shoppingCartList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.item2, null);
        return new MyViewHolder(inflate);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        HomeBean.ResultBean.ShoppingCartListBean shoppingCartListBean = shoppingCartList.get(position);
        holder.name.setText(shoppingCartListBean.getCommodityName());
        holder.price.setText(shoppingCartListBean.getPrice());
        Glide.with(holder.img)
                .load(shoppingCartListBean.getPic())
                .into(holder.img);
    }

    @Override
    public int getItemCount() {
        return shoppingCartList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.img)
        ImageView img;
        @BindView(R.id.name)
        TextView name;
        @BindView(R.id.price)
        TextView price;

        public MyViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
