package com.example.mac.myapplication;

/**
 * Created by mac on 2018/9/18.
 */

public class BasePresenter<V extends BaseView> {
    protected V view;

    protected void attachView(V view) {
        this.view = view;
    }

    protected void delView() {
        this.view = null;
    }

    protected boolean isHasView() {
        if (view == null) return false;
        else return true;
    }

    public V getView() {
        return view;
    }
}
