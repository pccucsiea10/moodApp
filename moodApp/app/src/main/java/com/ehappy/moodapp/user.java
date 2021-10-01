package com.ehappy.moodapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class user extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);
        Spinner choose = (Spinner)findViewById(R.id.choose);
        final String[] lunch = {"正常心率測試", "開心心率測試", "難過心率測試"};
        ArrayAdapter<String> lunchList = new ArrayAdapter<>(user.this,
                android.R.layout.simple_spinner_dropdown_item,
                lunch);choose.setAdapter(lunchList);
    }
}