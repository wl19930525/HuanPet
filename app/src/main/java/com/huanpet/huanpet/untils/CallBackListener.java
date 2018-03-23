package com.huanpet.huanpet.untils;

/**
 * Created by 执笔画商
 * on 2018/3/23.
 * at 北京
 */

public interface CallBackListener<T> {
    void Error(String string);
    void Success(T t);
}
