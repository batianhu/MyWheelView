package com.example.weijunpeng.mygradle;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import java.util.Arrays;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
    private String TAG="MainActivity";

    @Bind(R.id.wheelviewmain)
    WheelView wva;
    private static final String[] PLANETS = new String[]{"河南", "安徽", "北京", "天津", "广东", "福建", "深圳", "浙江"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);


        wva.setOffset(1);
        wva.setItems(Arrays.asList(PLANETS));
        wva.setOnWheelViewListener(new WheelView.OnWheelViewListener() {
            @Override
            public void onSelected(int selectedIndex, String item) {
                Log.d(TAG, "selectedIndex: " + selectedIndex + ", item: " + item);
            }
        });
    }
}
