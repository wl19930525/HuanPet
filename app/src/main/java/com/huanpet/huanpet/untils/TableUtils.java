package com.huanpet.huanpet.untils;

import android.provider.BaseColumns;

/**
 * Created by mMaster
 * on 2018/3/29.
 * at 北京
 */

public class TableUtils {
    /**
     * @描述 :用户信息实体
     * @类名 : DictInfo
     * @作�?? : Android - yhq
     * @版本 : v1.0
     * @日期 : Mar 23, 2016
     */
    public static final class UserInfo implements BaseColumns {
        public static final String TABLE_NAME = "UserInfo.db";// 表名
        public static final String ID = "id";
        public static final String USERID = "userId";// 用户id
        public static final String USERSID = "usersId";// 寄养师Id
        public static final String USERNAME = "userName";// 用户�??
        public static final String PASSWORD = "password";// 密码
        public static final String USERPHONE = "userPhone";// 手机�??
        public static final String POSITION = "position";// 用户身份
        public static final String ADDRESS = "address";// 用户地址
        public static final String IDENTIFY = "identify";// 地图标识
        public static final String USERPRICE = "userPrice";// 帐号金额
        public static final String CREATETIME = "createTime";// 创建时间
        public static final String UPSTRINGTIME = "upStringTime";// 修改时间
        public static final String QQ = "qq";// QQ
        public static final String REALNAME = "realName";// 真实姓名
        public static final String FAMILY = "family";// 寄养家庭
        public static final String IDENTITYCARD = "identityCard";// 身份证号
        public static final String IDENTITYIMAGE = "identityImage";// 身份证照�??
        public static final String LASTREGISTERTIME = "lastRegisterTime";// �??后登录时�??
        public static final String THREEID = "threeId";// 第三方登录标�??
        public static final String USERIMAGE = "userImage";// 用户图片
        public static final String USERSEX = "userSex";// 用户年龄
        public static final String BIRTHDAY = "birthday";// 出生日期
        public static final String ISUSE = "isUse";// 是否启用
        public static final String TOKEN = "token";
        public static final String INTRO = "intro";// 家庭�??�??
        public static final String WECHAT = "wechat";// 微信
        public static final String OPENBEGINTIME = "openBeginTime";// 寄养�??始时�??
        public static final String OPENENDTIME = "openEndTime";// 寄养结束时间
        public static final String OPENTIME = "openTime";// 寄养�??始时�??
        public static final String ENDTIME = "endTime";// 寄养结束时间
    }
}

