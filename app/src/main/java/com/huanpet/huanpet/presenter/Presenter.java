package com.huanpet.huanpet.presenter;

import com.huanpet.huanpet.Model.HttpModel;
import com.huanpet.huanpet.Model.ModelInf;
import com.huanpet.huanpet.presenter.contract.Contract;
import com.huanpet.huanpet.untils.CallBackListener;

import java.util.Map;

import javax.security.auth.callback.Callback;

/**
 * Created by 执笔画商
 * on 2018/3/23.
 * at 北京
 */

public class Presenter implements Contract.PresenterInf{

    Contract.ViewInf viewInf;
    ModelInf modelInf;

    public Presenter(Contract.ViewInf viewInf) {
        this.viewInf = viewInf;
        this.modelInf = new HttpModel();
    }

    @Override
    public void doSumshing(String url, Map<String,String> map) {
        modelInf.Login(url, map, new CallBackListener<Object>() {
            @Override
            public void Error(String string) {

            }

            @Override
            public void Success(Object o) {
                viewInf.UpdataUi(o);
            }
        });

    }
}
