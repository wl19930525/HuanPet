package com.huanpet.huanpet.app;

import android.app.Application;
import android.database.sqlite.SQLiteDatabase;

import com.umeng.socialize.Config;
import com.umeng.socialize.PlatformConfig;
import com.umeng.socialize.UMShareAPI;

import app.jiyun.com.testsqlitegd.DaoMaster;
import app.jiyun.com.testsqlitegd.DaoSession;

public class MyApplication extends Application {

    private static MyApplication myApplication;

    private DaoSession daoSession;

    public static MyApplication getApplication(){
        return myApplication;
    }
    {
        PlatformConfig.setWeixin("wx967daebe835fbeac", "5bb696d9ccd75a38c8a0bfe0675559b3");
        PlatformConfig.setQQZone("100424468", "c7394704798a158208a74ab60104f0ba");
        PlatformConfig.setSinaWeibo("3921700954", "04b48b094faeb16683c32669824ebdad", "http://sns.whalecloud.com");
    }
    @Override
    public void onCreate() {
        super.onCreate();
        myApplication = this;
        createData();
        UMShareAPI.get(this);
        //2debug
        Config.DEBUG = true;
        //3第三方登录
        UMShareAPI.init(this,"\t5a4cd226a40fa33b3a0000f9");
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
