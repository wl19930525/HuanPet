package com.huanpet.huanpet.Model;

import com.huanpet.huanpet.untils.CallBackListener;
import com.huanpet.huanpet.untils.HttpUntils;

import java.util.Map;

/**
 * Created by 执笔画商
 * on 2018/3/23.
 * at 北京
 */

public class HttpModel implements ModelInf{

    @Override
    public <T> void Login(String string, Map<String,String> map, CallBackListener<T> callBackListener) {

    }

    @Override
    public <T> void Regist(String string, String JSON, CallBackListener<T> callBackListener) {
        HttpUntils.getInstance().post(string,JSON,callBackListener);
    }


}
