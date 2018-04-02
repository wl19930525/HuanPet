package com.huanpet.huanpet.bean;

import android.widget.ImageView;

/**
 * Created by 执笔画商
 * on 2018/3/30.
 * at 北京
 */

public class MyPetBean {

    private ImageView petImageportrait;
    private String perTitle;
    private String introduce;
    private ImageView petSex;

    public MyPetBean() {
    }

    public ImageView getPetImageportrait() {
        return petImageportrait;
    }

    public void setPetImageportrait(ImageView petImageportrait) {
        this.petImageportrait = petImageportrait;
    }

    public String getPerTitle() {
        return perTitle;
    }

    public void setPerTitle(String perTitle) {
        this.perTitle = perTitle;
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }

    public ImageView getPetSex() {
        return petSex;
    }

    public void setPetSex(ImageView petSex) {
        this.petSex = petSex;
    }

    @Override
    public String toString() {
        return "MyPetBean{" +
                "petImageportrait=" + petImageportrait +
                ", perTitle='" + perTitle + '\'' +
                ", introduce='" + introduce + '\'' +
                ", petSex=" + petSex +
                '}';
    }
}
