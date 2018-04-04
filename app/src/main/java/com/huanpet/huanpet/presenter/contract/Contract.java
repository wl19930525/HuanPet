package com.huanpet.huanpet.presenter.contract;

import com.huanpet.huanpet.bean.HomeBase;

import java.util.List;


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

       public void doSumshing(String url, String string);
        public void doSumshing2(String url,String stringJson);


    }

}
