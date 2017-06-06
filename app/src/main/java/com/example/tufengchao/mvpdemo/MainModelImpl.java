package com.example.tufengchao.mvpdemo;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by tufengchao on 2017/6/5.
 */

public class MainModelImpl implements MainModel {

    @Override
    public void load(final Listener<FileInfoData> listener) {
        RetrofitManager.getInstance().createReq(API.class).getList("json", "shanghai", "0f7ce49df5b6e3172eda9739bc7491d0", "430", "huayins").enqueue(new Callback<FileInfoData>() {
            @Override
            public void onResponse(Call<FileInfoData> call, Response<FileInfoData> response) {
                listener.success(response.body());

            }

            @Override
            public void onFailure(Call<FileInfoData> call, Throwable t) {

            }
        });
        ;
    }
}
