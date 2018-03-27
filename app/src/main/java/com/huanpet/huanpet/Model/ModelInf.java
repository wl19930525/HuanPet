package com.huanpet.huanpet.Model;

import com.huanpet.huanpet.untils.CallBackListener;

import java.util.Map;

/**
 * Created by 执笔画商
 * on 2018/3/23.
 * at 北京
 */

public interface ModelInf {
    <T>void Login(String string, Map<String,String> map, CallBackListener<T> callBackListener);
    <T>void Regist(String string, Map<String,String> hendmap, Map<String,String> bodymap,CallBackListener<T> callBackListener);

}
