package com.example.yyl.helloandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.yyl.helloandroid.storedata.SharedActivity;
import com.example.yyl.helloandroid.storedata.SqlLiteActivity;

public class StoreDataActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_store_data);

        //设置监听对象

        findViewById(R.id.button4).setOnClickListener(this);//share存储
        findViewById(R.id.button5).setOnClickListener(this);//sqlLite存储
        findViewById(R.id.button6).setOnClickListener(this);//file存储
        findViewById(R.id.button7).setOnClickListener(this);//ContentProvider存储
        //ss
        //监听返回按钮
        findViewById(R.id.button10).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if( v.getId() == R.id.button4 ){
            Intent intent = new Intent(StoreDataActivity.this, SharedActivity.class) ;
            startActivity(intent);
        }else if( v.getId() == R.id.button5 ){
            Intent intent = new Intent(StoreDataActivity.this, SqlLiteActivity.class) ;
            startActivity(intent);
        }else if( v.getId() == R.id.button6 ){

        }else if( v.getId() == R.id.button7 ){

        }else{
            finish();
        }
    }
}
