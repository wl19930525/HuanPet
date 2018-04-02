package com.huanpet.huanpet.untils;

import android.content.Context;

/**
 * Created by mMaster
 * on 2018/3/29.
 * at 北京
 */

public class AppUtils {
    // 全局上下文
    public static Context appContext;

    // http://192.168.26.185

    // http://www.yhq1913.com

    // 内网请求连接
    public static final String BASE_URL = "http://192.168.26.185";

    // 数据请求URL
    public static final String REQUESTURL = BASE_URL + "/dog_family/";

    // 请求图片的URL
    public static final String HTTP_IMAGE_URL = BASE_URL + "/dog_family/upload";

    public static String currAccount;

    // 当前用户
    public static UserInfo userInfo;

    public static boolean isPosition;

    public static boolean flag;

    public static String TABLE_ID = "57295c80305a2a09f9a254d6";

    public static String KEY = "8e1bd45d3e74b2e53aaa413c31368dec";

    public static String SAVE_URL = "http://yuntuapi.amap.com/datamanage/data/create";

    public static String UPDATE_URL = "http://yuntuapi.amap.com/datamanage/data/update";

    public static String DELETE_URL = "http://yuntuapi.amap.com/datamanage/data/delete";
    public static UserInfo getUser() {
        return userInfo;
    }
    public static Context getAppContext() {
        return appContext;
    }
}
