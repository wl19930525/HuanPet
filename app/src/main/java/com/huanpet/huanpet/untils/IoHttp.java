package com.huanpet.huanpet.untils;

import java.util.Map;

/**
 * Created by 执笔画商
 * on 2018/3/23.
 * at 北京
 */

public interface IoHttp {
    <T> void get(String url, CallBackListener<T> callback);

    <T> void post(String url ,String JSON, CallBackListener<T> callback);
}
