package com.example.tufengchao.mvpdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.google.gson.Gson;

import java.util.List;

import okhttp3.OkHttpClient;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends BaseActivity implements MainView {
    public static final String API_URL = "https://film.spider.com.cn/huayins/";
    private TextView result_tv;
    private IMainPresenter presenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        result_tv = (TextView) findViewById(R.id.result_tv);
        presenter=new MainPresenterImpl(this);
        presenter.load();

    }


    @Override
    public void setTextView(String json) {
        result_tv.setText(json);
    }

    @Override
    protected void onResume() {
        super.onResume();

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        presenter.destoryView();
    }
}
