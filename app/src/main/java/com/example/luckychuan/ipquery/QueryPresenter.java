package com.example.luckychuan.ipquery;

/**
 * Created by Luckychuan on 2017/4/19.
 */
public class QueryPresenter extends BasePresenter<MainView>{

    private MainView mView;
    private QueryModel mModel;

    public QueryPresenter(MainView view){
        mView = view;
        mModel = new QueryModelImpl();
    }

    public void requestQuery(String ip){
        mModel.getData(ip, new QueryModel.Callback() {
            @Override
            public void onSuccess(IPInfo.Data data) {
                mView.showIPInfo(data);
            }

            @Override
            public void onFail(String msg) {
                mView.showError(msg);
            }
        });
    }

}
