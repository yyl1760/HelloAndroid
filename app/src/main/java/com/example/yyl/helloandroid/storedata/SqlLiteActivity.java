package com.example.yyl.helloandroid.storedata;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.yyl.helloandroid.R;

public class SqlLiteActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sql_lite);

        findViewById(R.id.button13).setOnClickListener(this); ;
    }

    @Override
    public void onClick(View v) {
            finish();
    }
}
