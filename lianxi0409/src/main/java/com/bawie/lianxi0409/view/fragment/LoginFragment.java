package com.bawie.lianxi0409.view.fragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.bawie.lianxi0409.R;
import com.bawie.lianxi0409.base.BaseFragment;
import com.bawie.lianxi0409.contract.ILoginContract;
import com.bawie.lianxi0409.model.bean.LoginBean;
import com.bawie.lianxi0409.model.bean.RegisterBean;
import com.bawie.lianxi0409.presenter.LoginPresenter;
import com.bawie.lianxi0409.util.CommitUtil;
import com.bawie.lianxi0409.view.activity.HomeActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;

/**
 * A simple {@link Fragment} subclass.
 */
public class LoginFragment extends BaseFragment<LoginPresenter> implements ILoginContract.IView {

    @BindView(R.id.ed_phone)
    EditText edPhone;
    @BindView(R.id.ed_pwd)
    EditText edPwd;
    @BindView(R.id.bt_login)
    Button btLogin;

    @Override
    protected int layoutId() {
        return R.layout.fragment_login;
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
        Intent intent = new Intent(getActivity(), HomeActivity.class);
        startActivity(intent);
    }

    @Override
    public void onLoginFailure(Throwable throwable) {

    }

    @Override
    public void onRegisterSeccess(RegisterBean registerBean) {

    }

    @Override
    public void onRegisterFailure(Throwable throwable) {

    }

    @OnClick(R.id.bt_login)
    public void onViewClicked() {
        String phone = edPhone.getText().toString();
        String pwd = edPwd.getText().toString();
        boolean phone1 = CommitUtil.isPhone(phone);
        if (phone1){
            mPresenter.getLoginData(phone,pwd);
        }
    }
}
