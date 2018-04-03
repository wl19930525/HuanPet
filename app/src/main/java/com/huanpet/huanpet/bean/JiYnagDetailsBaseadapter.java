package com.huanpet.huanpet.bean;

/**
 * Created by mMaster
 * on 2018/4/3.
 * at 北京
 */

public class JiYnagDetailsBaseadapter {
    private String typeName;
    private String image;
    private String severiceName;
    private String price;

    public JiYnagDetailsBaseadapter(String typeName, String image, String severiceName, String price) {
        this.typeName = typeName;
        this.image = image;
        this.severiceName = severiceName;
        this.price = price;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getSevericeName() {
        return severiceName;
    }

    public void setSevericeName(String severiceName) {
        this.severiceName = severiceName;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}

