package com.example.yyl.helloandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class ListViewActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);

        //显示ListView
        ListView listView = (ListView) findViewById(R.id.listview1);
        ListAdapter listAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,getData()) ;
        listView.setAdapter(listAdapter);

        //监听返回按钮
        findViewById(R.id.button8).setOnClickListener(this);


    }

    private List<String> getData(){

        List<String> data = new ArrayList<String>();
        data.add("测试数据1");
        data.add("测试数据2");
        data.add("测试数据3");
        data.add("测试数据4");

        return data;
    }

    @Override
    public void onClick(View v) {
        if( v.getId() == R.id.button8 ){
            finish();
        }
    }
}
