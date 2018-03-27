package com.huanpet.huanpet.bean;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

/**
 * Created by 执笔画商
 * on 2018/3/23.‘
 * at 北京
 */
@Entity
public class MyLoginBean {
    @Id(autoincrement = true)
    Long id;
    String userPhone;
    String passwork;
    @Generated(hash = 989020028)
    public MyLoginBean(Long id, String userPhone, String passwork) {
        this.id = id;
        this.userPhone = userPhone;
        this.passwork = passwork;
    }
    @Generated(hash = 1580997013)
    public MyLoginBean() {
    }
    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getUserPhone() {
        return this.userPhone;
    }
    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }
    public String getPasswork() {
        return this.passwork;
    }
    public void setPasswork(String passwork) {
        this.passwork = passwork;
    }
    
}
