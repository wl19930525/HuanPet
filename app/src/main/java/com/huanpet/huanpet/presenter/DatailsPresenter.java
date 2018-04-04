package com.huanpet.huanpet.presenter;

import android.util.Log;

import com.huanpet.huanpet.Model.HttpModel;
import com.huanpet.huanpet.Model.ModelInf;
import com.huanpet.huanpet.bean.DetailsBase;
import com.huanpet.huanpet.presenter.contract.Contract;
import com.huanpet.huanpet.untils.CallBackListener;

/**
 * Created by mMaster
 * on 2018/3/30.
 * at 北京
 */

public class DatailsPresenter {
    private Contract.DetailsView viewInf;
    private ModelInf modelInf;

    public DatailsPresenter(Contract.DetailsView viewInf) {
        this.viewInf = viewInf;
        this.modelInf=new HttpModel();
    }
    public void sendData(String url,String cjon){
        modelInf.Regist(url, cjon, new CallBackListener<DetailsBase>() {
            @Override
            public void Error(String string) {
                Log.e("datails",string);
            }

            @Override
            public void Success(DetailsBase s) {
                //Log.e("数据",s.toString());
                DetailsBase.DescBean desc = s.getDesc();
                viewInf.UpdataUi(desc);
            }
        });
    }
}
