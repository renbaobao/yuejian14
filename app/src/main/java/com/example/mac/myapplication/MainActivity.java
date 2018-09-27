package com.example.mac.myapplication;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.mac.myapplication.databinding.ActivityMainBinding;

public class MainActivity extends BaseActivity implements MainView {
    ActivityMainBinding binding;
    MainPresenter mainPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        mainPresenter = new MainPresenter();
        mainPresenter.attachView(this);
        binding.text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent();
            }
        });
        binding.text.setOnClickListener((v)->intent());
    }

    @Override
    public void intent() {
        mainPresenter.intent();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mainPresenter.delView();
    }
}
