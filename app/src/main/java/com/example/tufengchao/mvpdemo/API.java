package com.example.tufengchao.mvpdemo;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by tufengchao on 2017/6/5.
 */

public interface API {
    /**https://film.spider.com.cn/huayins/filmList.html?filetype=json&cityCode=shanghai&filmId=&sign=0f7ce49df5b6e3172eda9739bc7491d0&version=430&key=huayins
     * /huayins/filmList.html?filetype=json&cityCode=shanghai&filmId=&sign=0f7ce49df5b6e3172eda9739bc7491d0&version=430&key=huayins HTTP/1.1
     * @param us
     * @return
     */
    @GET("filmList.html")
    Call<FileInfoData> getList(@Query("filetype") String filetype, @Query("cityCode") String cityCode, @Query("sign") String sign, @Query("version") String version, @Query("key")String key );

}
