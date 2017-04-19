package com.example.luckychuan.ipquery;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements MainView {

    private static String IP_ADDRESS = "111.19.33.78";
    private QueryPresenter mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mPresenter = new QueryPresenter(this);
        mPresenter.attach(this);

        //查询
        mPresenter.requestQuery(IP_ADDRESS);

    }

    @Override
    public void showIPInfo(IPInfo.Data data) {
        ((TextView) findViewById(R.id.ip_info)).setText(data.toString());
    }

    @Override
    public void showError(String error) {
        Toast.makeText(MainActivity.this, error, Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mPresenter.detach();
    }
}
