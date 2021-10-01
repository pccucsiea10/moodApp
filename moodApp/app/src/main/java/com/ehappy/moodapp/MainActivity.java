package com.ehappy.moodapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //取得此Button的實體
        Button start = (Button)findViewById(R.id.start);
        Button close = (Button)findViewById(R.id.close);

        //實做OnClickListener界面
        start.setOnClickListener(v -> {
            //初始化Intent物件
            Intent intent = new Intent();
            //從MainActivity 到start
            intent.setClass(MainActivity.this , start.class);
            //開啟Activity
            startActivity(intent);
        });

        close.setOnClickListener(v -> System.exit(0));
    }
}