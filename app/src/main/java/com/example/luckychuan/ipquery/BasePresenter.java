package com.example.luckychuan.ipquery;

/**
 * Created by Luckychuan on 2017/4/19.
 */
public abstract class BasePresenter<T> {

    private T mView;

    public void attach(T view){
        mView =view;
    }

    public void detach(){
        mView = null;
    }

}
