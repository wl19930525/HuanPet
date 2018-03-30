package com.huanpet.huanpet.presenter.contract;

import java.util.Map;

/**
 * Created by 执笔画商
 * on 2018/3/23.
 * at 北京
 */

public interface Contract {

    public interface ViewInf{
        <T>void UpdataUi(T t);
    }
    public interface PresenterInf{
        void doSumshing(String url, String JSON);
    }
}
