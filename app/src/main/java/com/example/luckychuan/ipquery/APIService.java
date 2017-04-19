package com.example.luckychuan.ipquery;

import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by Luckychuan on 2017/4/19.
 */
public interface APIService {

    @GET("service/getIpInfo.php")
    Observable<IPInfo> getData(@Query("ip") String ip);
}
