package com.example.yyl.helloandroid.storedata;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/**
 * Created by Administrator on 2017/9/29.
 */

public class DBHelper extends SQLiteOpenHelper {

    private static final String TAG = "DatabaseHelper";
    private static final String DB_NAME = "test_db";//数据库名字
    public static String TABLE_NAME = "person";// 表名
    public static String FIELD_ID = "id";// 列名
    public static String  FIELD_NAME= "name";// 列名
    private static final int DB_VERSION = 1;   // 数据库版本

    public  DBHelper(Context context){
        super(context, DB_NAME, null, DB_VERSION);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {

        //创建表
        String  sql = "CREATE TABLE " + TABLE_NAME + "(" + FIELD_ID + " integer primary key autoincrement , " + FIELD_NAME + " text not null);";
        try {
            db.execSQL(sql);
        } catch (SQLException e) {
            Log.e(TAG, "onCreate " + TABLE_NAME + "Error" + e.toString());
            return;
        }

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
