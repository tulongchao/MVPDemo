package com.example.tufengchao.mvpdemo;

import android.app.Application;

/**
 * Created by tufengchao on 2017/6/5.
 */

public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        RetrofitManager.getInstance();
    }
}
