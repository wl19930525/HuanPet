package com.huanpet.huanpet.presenter.contract;

import com.huanpet.huanpet.bean.HomeBase;

import java.util.List;
import java.util.Map;

/**
 * Created by 执笔画商
 * on 2018/3/23.
 * at 北京
 */

public interface Contract {

    public interface ViewInf{
        <T>void UpdataUi(T t);
        void upDataHomeUi(List<HomeBase.DescBean> list);

    }
    public interface PresenterInf{

        void doSumshing(String url, String string);
        void doSumshing2(String url,String stringJson);

        void doSumshing(String url, String JSON);

    }

}
