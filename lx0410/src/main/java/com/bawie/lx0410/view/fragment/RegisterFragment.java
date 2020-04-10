package com.bawie.lx0410.view.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.bawie.lx0410.R;
import com.bawie.lx0410.base.BaseFragment;
import com.bawie.lx0410.contract.ILoginContract;
import com.bawie.lx0410.model.bean.LoginBean;
import com.bawie.lx0410.model.bean.RegisterBean;
import com.bawie.lx0410.presenter.LoginPresenter;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;

/**
 * A simple {@link Fragment} subclass.
 */
public class RegisterFragment extends BaseFragment<LoginPresenter> implements ILoginContract.IView {

    @BindView(R.id.ed_phone)
    EditText edPhone;
    @BindView(R.id.ed_pwd)
    EditText edPwd;
    @BindView(R.id.bt_login)
    Button btLogin;

    @Override
    protected int layoutId() {
        return R.layout.fragment_register;
    }

    @Override
    protected void inintData() {

    }

    @Override
    protected void initView(View inflate) {

    }

    @Override
    protected LoginPresenter providePresenter() {
        return new LoginPresenter();
    }

    @Override
    public void onLoginSeccess(LoginBean loginBean) {

    }

    @Override
    public void onLoginFailure(Throwable throwable) {

    }

    @Override
    public void onRegisterSeccess(RegisterBean registerBean) {
        Toast.makeText(getContext(),registerBean.getMessage(),Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onRegisterFailure(Throwable throwable) {
        Toast.makeText(getContext(),"请求失败",Toast.LENGTH_SHORT).show();
        Log.d("dql", "onRegisterFailure: "+throwable);
    }

    @OnClick(R.id.bt_login)
    public void onViewClicked() {
        String phone = edPhone.getText().toString();
        String pwd = edPwd.getText().toString();
        if (phone == null){
            Toast.makeText(getContext(),"求输入手机号",Toast.LENGTH_SHORT).show();
        }
        if (pwd == null){
            Toast.makeText(getContext(),"求输入密码",Toast.LENGTH_SHORT).show();
        }

        mPresenter.getRegisterData(phone,pwd);
    }
}
