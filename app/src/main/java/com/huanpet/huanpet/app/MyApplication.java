package com.huanpet.huanpet.app;

import android.app.Application;
import android.database.sqlite.SQLiteDatabase;


import app.jiyun.com.testsqlitegd.DaoMaster;
import app.jiyun.com.testsqlitegd.DaoSession;

public class MyApplication extends Application {

    private static MyApplication myApplication;

    private DaoSession daoSession;

    public static MyApplication getApplication(){
        return myApplication;
    }
    {

    }
    @Override
    public void onCreate() {
        super.onCreate();
        myApplication = this;
        createData();
    }

    private void createData() {
        DaoMaster.OpenHelper helper = new DaoMaster.DevOpenHelper(myApplication,"shiti.db");
        SQLiteDatabase writableDatabase = helper.getWritableDatabase();
        DaoMaster daoMaster = new DaoMaster(writableDatabase);
        daoSession = daoMaster.newSession();
    }

    public DaoSession getDaoSession(){
        return daoSession;
    }
}
