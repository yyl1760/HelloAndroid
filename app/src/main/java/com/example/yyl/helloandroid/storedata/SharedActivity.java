package com.example.yyl.helloandroid.storedata;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.yyl.helloandroid.R;

public class SharedActivity extends AppCompatActivity implements View.OnClickListener{

    protected static final String ACTIVITY_TAG="SharedActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shared);

        //监听按钮
        findViewById(R.id.button11).setOnClickListener(this);
        findViewById(R.id.button12).setOnClickListener(this);

        findViewById(R.id.button9).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if( v.getId() == R.id.button11 ){ //存储
            EditText editText = (EditText) findViewById(R.id.editText);
            EditText editText2 = (EditText) findViewById(R.id.editText2);

            Log.i( ACTIVITY_TAG,"editText:"+editText.getText().toString().isEmpty()) ;
            Log.i( ACTIVITY_TAG,"editText2:"+editText2.getText().toString().isEmpty() ) ;
            if(  editText.getText().toString().isEmpty()  ){
                Toast.makeText(this,"用户名不能为空",Toast.LENGTH_SHORT).show(); ;
                return ;
            }
            if(  editText2.getText().toString().isEmpty()  ){
                Toast.makeText(this,"密码不能为空",Toast.LENGTH_SHORT).show(); ;
                return ;
            }
            Toast.makeText(this,"验证通过",Toast.LENGTH_SHORT).show(); ;
            Log.i( ACTIVITY_TAG,"editText2验证通过：:"+editText2.getText().toString().isEmpty() ) ;

            //存储信息
            //步骤2-1：创建一个SharedPreferences.Editor接口对象，lock表示要写入的XML文件名，MODE_WORLD_WRITEABLE写操作
            SharedPreferences.Editor editor = getSharedPreferences("mylock", Context.MODE_PRIVATE).edit() ;
            //步骤2-2：将获取过来的值放入文件
            editor.putString("user", editText.getText().toString());
            editor.putString("pass", editText2.getText().toString());
            //步骤3：提交
            editor.commit();
            Toast.makeText(getApplicationContext(), "口令设置成功", Toast.LENGTH_LONG).show();

        }else if( v.getId() == R.id.button12 ){ //获取
            //步骤1：创建一个SharedPreferences接口对象
            SharedPreferences read = getSharedPreferences("mylock", Context.MODE_PRIVATE);
            //步骤2：获取文件中的值
            String user = read.getString("user","");
            String pass = read.getString("pass","");
            Toast.makeText(getApplicationContext(), "用户名："+user+",密码："+pass, Toast.LENGTH_LONG).show();
        }else{
            finish();
        }

    }
}
