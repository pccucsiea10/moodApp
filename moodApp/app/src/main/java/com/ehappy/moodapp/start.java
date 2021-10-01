package com.ehappy.moodapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class start extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        Button regular = (Button)findViewById(R.id.regular);
        Button normal = (Button)findViewById(R.id.normal);
        Button happy = (Button)findViewById(R.id.happy);
        Button sad = (Button)findViewById(R.id.sad);
        Button homepage = (Button)findViewById(R.id.homepage);

        //實做OnClickListener界面
        regular.setOnClickListener(v -> {
            //初始化Intent物件
            Intent intent = new Intent();
            //從start 到regular
            intent.setClass(start.this , user.class);
            //開啟Activity
            startActivity(intent);
        });

        //實做OnClickListener界面
        normal.setOnClickListener(v -> {
            //初始化Intent物件
            Intent intent = new Intent();
            //從start 到user
            intent.setClass(start.this , user.class);
            //開啟Activity
            startActivity(intent);
        });

        //實做OnClickListener界面
        happy.setOnClickListener(v -> {
            //初始化Intent物件
            Intent intent = new Intent();
            //從start 到user
            intent.setClass(start.this , user.class);
            //開啟Activity
            startActivity(intent);
        });

        //實做OnClickListener界面
        sad.setOnClickListener(v -> {
            //初始化Intent物件
            Intent intent = new Intent();
            //從start 到user
            intent.setClass(start.this , user.class);
            //開啟Activity
            startActivity(intent);
        });

        homepage.setOnClickListener(v -> {
            //初始化Intent物件
            Intent intent = new Intent();
            //從start 到MainActivity
            intent.setClass(start.this , MainActivity.class);
            //開啟Activity
            startActivity(intent);
        });
    }

}