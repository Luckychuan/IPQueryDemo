package com.example.luckychuan.ipquery;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements MainView {

    private static String IP_ADDRESS = "111.19.33.78";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new QueryModelImpl().getData(IP_ADDRESS, new QueryModel.Callback() {
            @Override
            public void onSuccess(IPInfo.Data data) {
                showIPInfo(data);
            }

            @Override
            public void onFail(String msg) {

            }
        });

    }

    @Override
    public void showIPInfo(IPInfo.Data data) {
        ((TextView) findViewById(R.id.ip_info)).setText(data.toString());
    }
}
