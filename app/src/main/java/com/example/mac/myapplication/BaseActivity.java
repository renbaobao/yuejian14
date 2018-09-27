package com.example.mac.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by mac on 2018/9/12.
 */

public abstract class BaseActivity extends Activity implements BaseView{

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void showLoding() {
        
    }

    @Override
    public void toastMsg() {

    }

    @Override
    public void dismissLoding() {

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

    }
}
