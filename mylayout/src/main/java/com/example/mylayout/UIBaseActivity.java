package com.example.mylayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class UIBaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uibase);
    }
}
