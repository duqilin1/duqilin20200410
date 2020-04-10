package com.bawie.duqilin20200408.view.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;

import com.bawie.duqilin20200408.R;
import com.bawie.duqilin20200408.model.bean.HomeBean;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/*
 *@auther:杜其林
 *@Date: 2020/4/8
 *@Time:14:23
 *@Description:${DESCRIPTION}
 * */
public class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.MyViewHolder> {

    private List<HomeBean.ResultBean> result;

    public HomeAdapter(List<HomeBean.ResultBean> result) {

        this.result = result;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.item, null);
        return new MyViewHolder(inflate);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        HomeBean.ResultBean resultBean = result.get(position);
        holder.name.setText(resultBean.getCategoryName());
        List<HomeBean.ResultBean.ShoppingCartListBean> shoppingCartList = resultBean.getShoppingCartList();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(holder.itemView.getContext());
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        holder.rva.setLayoutManager(linearLayoutManager);
        HomeAdapter2 homeAdapter = new HomeAdapter2(shoppingCartList);
        holder.rva.setAdapter(homeAdapter);
    }

    @Override
    public int getItemCount() {
        return result.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.cb)
        CheckBox cb;
        @BindView(R.id.name)
        TextView name;
        @BindView(R.id.rva)
        RecyclerView rva;

        public MyViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
