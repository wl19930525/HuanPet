package com.huanpet.huanpet.bean;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

/**
 * Created by 执笔画商
 * on 2018/3/26.
 * at 北京
 */
@Entity
public class UserBean {
    @Id(autoincrement = true)
    Long id;
    //头像
    String portrait;
    //姓名
    String name;
    //性别
    String sex;
    //出生日期
    String natality;
    //手机号
    String phono;
    //微信
    String WeiXin;
    //QQ
    String qq;
    //地址
    String location;
    @Generated(hash = 1821486430)
    public UserBean(Long id, String portrait, String name, String sex,
            String natality, String phono, String WeiXin, String qq,
            String location) {
        this.id = id;
        this.portrait = portrait;
        this.name = name;
        this.sex = sex;
        this.natality = natality;
        this.phono = phono;
        this.WeiXin = WeiXin;
        this.qq = qq;
        this.location = location;
    }
    @Generated(hash = 1203313951)
    public UserBean() {
    }
    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getPortrait() {
        return this.portrait;
    }
    public void setPortrait(String portrait) {
        this.portrait = portrait;
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSex() {
        return this.sex;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }
    public String getNatality() {
        return this.natality;
    }
    public void setNatality(String natality) {
        this.natality = natality;
    }
    public String getPhono() {
        return this.phono;
    }
    public void setPhono(String phono) {
        this.phono = phono;
    }
    public String getWeiXin() {
        return this.WeiXin;
    }
    public void setWeiXin(String WeiXin) {
        this.WeiXin = WeiXin;
    }
    public String getQq() {
        return this.qq;
    }
    public void setQq(String qq) {
        this.qq = qq;
    }
    public String getLocation() {
        return this.location;
    }
    public void setLocation(String location) {
        this.location = location;
    }

}
