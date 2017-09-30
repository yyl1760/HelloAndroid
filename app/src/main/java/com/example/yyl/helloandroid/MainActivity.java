package com.example.yyl.helloandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        //监听button2
        findViewById(R.id.button2).setOnClickListener(this);
        findViewById(R.id.button3).setOnClickListener(this);
        findViewById(R.id.button14).setOnClickListener(this);

    }

    public void onButtonClick(View view){
        //获取view
        EditText editText1 = (EditText)findViewById(R.id.editText5);
        EditText editText2 = (EditText)findViewById(R.id.editText6);
        TextView textView = (TextView) findViewById(R.id.textView4);
        Button button = (Button) findViewById(R.id.button);

        //计算
        int num1 = Integer.parseInt(editText1.getText().toString()) ;
        int num2 = Integer.parseInt(editText2.getText().toString()) ;

        int re = num1 + num2 ;
        //输出
        textView.setText(Integer.toString(re));

    }

    @Override
    public void onClick(View v) {
            if(v.getId() == R.id.button2){ //转向列表
                Intent intent = new Intent(MainActivity.this, ListViewActivity.class);
                intent.putExtra("data", "mainActivity");
                startActivity(intent);
            }else if(v.getId() == R.id.button3){ //数据存储
                Intent intent = new Intent(MainActivity.this, StoreDataActivity.class);
                startActivity(intent);
            }else if(v.getId() == R.id.button14){ //定位功能
                Intent intent = new Intent(MainActivity.this, StoreDataActivity.class);
                startActivity(intent);
            }
    }
}
