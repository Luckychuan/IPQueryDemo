package com.example.luckychuan.ipquery;

/**
 * Created by Luckychuan on 2017/4/19.
 */
public interface QueryModel {

    void getData(String ip,Callback callback);

    interface Callback{
       void  onSuccess(IPInfo.Data data);
        void onFail(String msg);
    }

}
