package com.huanpet.huanpet.untils;

import android.text.TextUtils;

import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * Created by mMaster
 * on 2018/3/29.
 * at 北京
 */

public class FileUtil {
    public static final String LOGIN = "login";
    public static final String TOKEN = "token";
    public static final String JPUSHISOK = "jpushisok";
    /**
     * 获取Token
     */
    public static String getToken() {

        String code = null;
        // 对象输入�??
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(AppUtils.getAppContext().openFileInput(TOKEN));
            // 获取用户对象
            code = (String) ois.readObject();
            if (TextUtils.isEmpty(code)) {
                return null;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            if (ois != null) {
                try {
                    ois.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return code;
    }
}
