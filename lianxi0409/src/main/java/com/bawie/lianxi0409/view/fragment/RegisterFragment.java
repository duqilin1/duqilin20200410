package com.bawie.lianxi0409.view.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import com.bawie.lianxi0409.R;
import com.bawie.lianxi0409.base.BaseFragment;
import com.bawie.lianxi0409.contract.ILoginContract;
import com.bawie.lianxi0409.model.bean.LoginBean;
import com.bawie.lianxi0409.model.bean.RegisterBean;
import com.bawie.lianxi0409.presenter.LoginPresenter;

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
    @BindView(R.id.cb)
    CheckBox cb;
    @BindView(R.id.bt_register)
    Button btRegister;
    Unbinder unbinder;

    @Override
    protected int layoutId() {
        return R.layout.fragment_register;
    }

    @Override
    protected void initData() {

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
        Toast.makeText(getContext(), registerBean.getMessage(), Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onRegisterFailure(Throwable throwable) {

    }

    @OnClick(R.id.bt_register)
    public void onViewClicked() {
        String phone = edPhone.getText().toString();
        String pwd = edPwd.getText().toString();
        if (phone == null && pwd == null){
            Toast.makeText(getContext(), "求输入手机号或密码", Toast.LENGTH_SHORT).show();
        }
        mPresenter.getRegisterData(phone,pwd);
    }
}
