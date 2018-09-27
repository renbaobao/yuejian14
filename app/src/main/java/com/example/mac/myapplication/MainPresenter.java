package com.example.mac.myapplication;

import android.app.Activity;
import android.content.Intent;

/**
 * Created by mac on 2018/9/18.
 */

public class MainPresenter extends BasePresenter<MainView> {

    void intent() {
        view.showLoding();
        ((Activity) view).startActivity(new Intent(((Activity) view), LoginActivity.class));
    }
}
