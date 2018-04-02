
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

/**
 * @描述		:	
 * @作�??	    :Android - csx
 * @创建日期  :2016�?3�?23�? 下午7:12:37  
 *
 */
package com.huanpet.huanpet.untils;

import java.text.SimpleDateFormat;
import java.util.Date;

import android.content.Context;
import android.content.SharedPreferences;

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

	/**
	 * 
	 * @描述 :生成访问Token
	 * @方法名称 :createToken----&gt;TokenUtil.java
	 * @作�?? :Android - csx
	 * @创建日期 :2016�?3�?23�? 下午7:14:17
	 * @return
	 * 
	 */
	public static String createToken() {
		// 生成的token
		String token = null;

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date = new Date(System.currentTimeMillis());

		token = "172.16.48.7" + sdf.format(date) + "CD";

		token = Md5Encrypt.md5(token, "utf-8");

		return token;
	}

}

