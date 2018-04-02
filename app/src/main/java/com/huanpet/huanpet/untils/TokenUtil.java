package com.huanpet.huanpet.untils;

import android.content.Context;

/**
 *
 * @描述 :Token工具�?
 * @作�?? :Android - csx
 * @创建日期 :2016�?3�?23�? 下午7:45:35
 *
 */
public class TokenUtil {


    /**
     * 唯一标示
     */
    public static final String TOKEN = "token";

    // 全局上下�?
    private static Context context = null;

    public static void init(Context mContext) {
        context = mContext;
    }

}