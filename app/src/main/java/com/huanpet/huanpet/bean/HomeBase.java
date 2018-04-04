package com.huanpet.huanpet.bean;

import java.util.List;

/**
 * Created by mMaster
 * on 2018/3/30.
 * at 北京
 */

public class HomeBase {

    /**
     * desc : [{"address":"北京市昌平区沙河沙阳路18号北京科技职业学院","coordX":"40.11765","coordY":"116.250639","distance":129,"family":"小街爆的家","orderCount":84,"price":20,"score":3.6667,"userImage":"http://q.qlogo.cn/qqapp/100371282/290BB8E0BEC8DF5989060A6947C3E75D/40","usersId":"536e2c7b99204bbb81ad8fa7e6b2860f"},{"address":"四平市 北京市昌平区沙河","coordX":"40.134235","coordY":"116.280098","distance":3467,"family":"李丽丽了","orderCount":37,"price":10,"score":3.5,"userImage":"/d80488022f1e4278a3149f54beeac02a/IMG_20160509_140258.jpg","usersId":"d80488022f1e4278a3149f54beeac02a"},{"address":"福建省.福州市.枞阳县","coordX":"40.0493","coordY":"116.296482","distance":8140,"family":"寄养998","orderCount":23,"price":30,"score":0,"userImage":"http://q.qlogo.cn/qqapp/100371282/B368CC7246CC4A360C4305F64FE9173A/40","usersId":"6e710fd188b94d12bf12a6509ff3fe1f"},{"address":"北京市  西城区","coordX":"39.912289","coordY":"116.365868","distance":23450,"family":"昵称","orderCount":9,"price":10,"score":0,"usersId":"43e2a6c8829245d488f90197e3c84b08"},{"address":"北京昌平","coordX":"39.906898","coordY":"116.397238","distance":25583,"family":"张三三","orderCount":73,"price":30,"score":3.2222,"userImage":"/f30e56db51d7ce93b3b58dbb16aea142/IMG_20160601_174725.png","usersId":"f30e56db51d7ce93b3b58dbb16aea142"},{"address":"北京市","coordX":"39.90403","coordY":"116.407526","distance":26417,"family":"zachay","orderCount":1,"price":10,"score":0,"usersId":"893cb45fa9ea4ffb8c9b28656f41a146"},{"address":"北京市","coordX":"39.90403","coordY":"116.407526","distance":26417,"family":"咿呀咿呀哟","orderCount":4,"price":10,"score":0,"usersId":"fca3070783a94babaee37c52a52bb14a"},{"address":"北京市城市\t北京市  海淀区\t城市\t北京市  昌平区","coordX":"39.92147","coordY":"116.443108","distance":27411,"family":"好放假了是的回复","orderCount":0,"price":30,"score":0,"userImage":"http://q.qlogo.cn/qqapp/1105285855/862B29312F8D30591BEAC254DAFA551E/40","usersId":"a2ac592b1bdc4316a61054db23896f9a"},{"address":"吕梁市汾阳市东关村牛王堂","coordX":"36.856329","coordY":"114.494758","distance":370272,"family":"家家","orderCount":2,"price":40,"score":0,"userImage":"/63344fce512f449a988b1f330ee0e8db/IMG_20160424_162747.png","usersId":"63344fce512f449a988b1f330ee0e8db"},{"address":"北京市九寨沟","coordX":"36.856329","coordY":"114.494758","distance":370272,"family":"家家","orderCount":0,"score":0,"userImage":"1","usersId":"0e6a26bb351c4a818512c72d4b6bd7e5"}]
     * ret : true
     */

    private boolean ret;
    private List<DescBean> desc;

    public boolean isRet() {
        return ret;
    }

    public void setRet(boolean ret) {
        this.ret = ret;
    }

    public List<DescBean> getDesc() {
        return desc;
    }

    public void setDesc(List<DescBean> desc) {
        this.desc = desc;
    }

    public static class DescBean {
        /**
         * address : 北京市昌平区沙河沙阳路18号北京科技职业学院
         * coordX : 40.11765
         * coordY : 116.250639
         * distance : 129
         * family : 小街爆的家
         * orderCount : 84
         * price : 20
         * score : 3.6667
         * userImage : http://q.qlogo.cn/qqapp/100371282/290BB8E0BEC8DF5989060A6947C3E75D/40
         * usersId : 536e2c7b99204bbb81ad8fa7e6b2860f
         */

        private String address;
        private String coordX;
        private String coordY;
        private int distance;
        private String family;
        private int orderCount;
        private int price;
        private double score;
        private String userImage;
        private String usersId;

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getCoordX() {
            return coordX;
        }

        public void setCoordX(String coordX) {
            this.coordX = coordX;
        }

        public String getCoordY() {
            return coordY;
        }

        public void setCoordY(String coordY) {
            this.coordY = coordY;
        }

        public int getDistance() {
            return distance;
        }

        public void setDistance(int distance) {
            this.distance = distance;
        }

        public String getFamily() {
            return family;
        }

        public void setFamily(String family) {
            this.family = family;
        }

        public int getOrderCount() {
            return orderCount;
        }

        public void setOrderCount(int orderCount) {
            this.orderCount = orderCount;
        }

        public int getPrice() {
            return price;
        }

        public void setPrice(int price) {
            this.price = price;
        }

        public double getScore() {
            return score;
        }

        public void setScore(double score) {
            this.score = score;
        }

        public String getUserImage() {
            return userImage;
        }

        public void setUserImage(String userImage) {
            this.userImage = userImage;
        }

        public String getUsersId() {
            return usersId;
        }

        public void setUsersId(String usersId) {
            this.usersId = usersId;
        }
    }
}
