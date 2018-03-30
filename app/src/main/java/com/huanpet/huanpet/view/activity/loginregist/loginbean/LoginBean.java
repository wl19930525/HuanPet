package com.huanpet.huanpet.view.activity.loginregist.loginbean;

/**
 * Created by 吕楠 on 2018/3/30.
 */

public class LoginBean {


    /**
     * ret : true
     * result : {"isUse":0,"userPhone":18612187602,"password":"123456","id":0,"state":0,"qq":0,"userSex":1,"userName":"uln632","userId":"73fe933f7f884b3d90545901cfa9c520","position":1}
     */

    private boolean ret;
    private ResultBean result;

    public boolean isRet() {
        return ret;
    }

    public void setRet(boolean ret) {
        this.ret = ret;
    }

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public static class ResultBean {
        /**
         * isUse : 0
         * userPhone : 18612187602
         * password : 123456
         * id : 0
         * state : 0
         * qq : 0
         * userSex : 1
         * userName : uln632
         * userId : 73fe933f7f884b3d90545901cfa9c520
         * position : 1
         */

        private int isUse;
        private long userPhone;
        private String password;
        private int id;
        private int state;
        private int qq;
        private int userSex;
        private String userName;
        private String userId;
        private int position;

        public int getIsUse() {
            return isUse;
        }

        public void setIsUse(int isUse) {
            this.isUse = isUse;
        }

        public long getUserPhone() {
            return userPhone;
        }

        public void setUserPhone(long userPhone) {
            this.userPhone = userPhone;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getState() {
            return state;
        }

        public void setState(int state) {
            this.state = state;
        }

        public int getQq() {
            return qq;
        }

        public void setQq(int qq) {
            this.qq = qq;
        }

        public int getUserSex() {
            return userSex;
        }

        public void setUserSex(int userSex) {
            this.userSex = userSex;
        }

        public String getUserName() {
            return userName;
        }

        public void setUserName(String userName) {
            this.userName = userName;
        }

        public String getUserId() {
            return userId;
        }

        public void setUserId(String userId) {
            this.userId = userId;
        }

        public int getPosition() {
            return position;
        }

        public void setPosition(int position) {
            this.position = position;
        }
    }
}
