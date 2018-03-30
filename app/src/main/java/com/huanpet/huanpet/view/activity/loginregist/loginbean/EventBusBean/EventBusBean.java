package com.huanpet.huanpet.view.activity.loginregist.loginbean.EventBusBean;

/**
 * Created by 吕楠 on 2018/3/30.
 */

public class EventBusBean {

    private String username;
    private String password;

    public EventBusBean(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
