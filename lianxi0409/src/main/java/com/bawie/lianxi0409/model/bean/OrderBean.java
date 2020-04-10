package com.bawie.lianxi0409.model.bean;

import java.util.List;

/*
 *@auther:杜其林
 *@Date: 2020/4/9
 *@Time:11:00
 *@Description:${DESCRIPTION}
 * */
public class OrderBean {

    /**
     * msg : 响应成功!
     * code : 200
     * data : [{"orderNum":"132165616557","type":5,"shops":[{"name":"农家自产百合干（500g）","price":22.8,"num":1,"imageUrl":"http://blog.zhaoliang5156.cn/api/images/binggan.png"},{"name":"农家自产百合干（500g）","price":22.8,"num":1,"imageUrl":"http://blog.zhaoliang5156.cn/api/images/binggan.png"}]},{"orderNum":"132165616557","type":1,"shops":[{"name":"农家自产百合干（500g）","price":22.8,"num":1,"imageUrl":"http://blog.zhaoliang5156.cn/api/images/binggan.png"},{"name":"农家自产百合干（500g）","price":22.8,"num":1,"imageUrl":"http://blog.zhaoliang5156.cn/api/images/binggan.png"}]},{"orderNum":"132165616557","type":2,"shops":[{"name":"农家自产百合干（500g）","price":22.8,"num":1,"imageUrl":"http://blog.zhaoliang5156.cn/api/images/binggan.png"},{"name":"农家自产百合干（500g）","price":22.8,"num":1,"imageUrl":"http://blog.zhaoliang5156.cn/api/images/binggan.png"}]},{"orderNum":"132165616557","type":3,"shops":[{"name":"农家自产百合干（500g）","price":22.8,"num":1,"imageUrl":"http://blog.zhaoliang5156.cn/api/images/binggan.png"},{"name":"农家自产百合干（500g）","price":22.8,"num":1,"imageUrl":"http://blog.zhaoliang5156.cn/api/images/binggan.png"}]},{"orderNum":"132165616557","type":4,"shops":[{"name":"农家自产百合干（500g）","price":22.8,"num":1,"imageUrl":"http://blog.zhaoliang5156.cn/api/images/binggan.png"},{"name":"农家自产百合干（500g）","price":22.8,"num":1,"imageUrl":"http://blog.zhaoliang5156.cn/api/images/binggan.png"}]},{"orderNum":"132165616557","type":5,"shops":[{"name":"农家自产百合干（500g）","price":22.8,"num":1,"imageUrl":"http://blog.zhaoliang5156.cn/api/images/binggan.png"},{"name":"农家自产百合干（500g）","price":22.8,"num":1,"imageUrl":"http://blog.zhaoliang5156.cn/api/images/binggan.png"}]},{"orderNum":"132165616557","type":1,"shops":[{"name":"农家自产百合干（500g）","price":22.8,"num":1,"imageUrl":"http://blog.zhaoliang5156.cn/api/images/binggan.png"},{"name":"农家自产百合干（500g）","price":22.8,"num":1,"imageUrl":"http://blog.zhaoliang5156.cn/api/images/binggan.png"}]},{"orderNum":"132165616557","type":2,"shops":[{"name":"农家自产百合干（500g）","price":22.8,"num":1,"imageUrl":"http://blog.zhaoliang5156.cn/api/images/binggan.png"},{"name":"农家自产百合干（500g）","price":22.8,"num":1,"imageUrl":"http://blog.zhaoliang5156.cn/api/images/binggan.png"}]},{"orderNum":"132165616557","type":3,"shops":[{"name":"农家自产百合干（500g）","price":22.8,"num":1,"imageUrl":"http://blog.zhaoliang5156.cn/api/images/binggan.png"},{"name":"农家自产百合干（500g）","price":22.8,"num":1,"imageUrl":"http://blog.zhaoliang5156.cn/api/images/binggan.png"}]},{"orderNum":"132165616557","type":4,"shops":[{"name":"农家自产百合干（500g）","price":22.8,"num":1,"imageUrl":"http://blog.zhaoliang5156.cn/api/images/binggan.png"},{"name":"农家自产百合干（500g）","price":22.8,"num":1,"imageUrl":"http://blog.zhaoliang5156.cn/api/images/binggan.png"}]}]
     */

    private String msg;
    private int code;
    private List<DataBean> data;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * orderNum : 132165616557
         * type : 5
         * shops : [{"name":"农家自产百合干（500g）","price":22.8,"num":1,"imageUrl":"http://blog.zhaoliang5156.cn/api/images/binggan.png"},{"name":"农家自产百合干（500g）","price":22.8,"num":1,"imageUrl":"http://blog.zhaoliang5156.cn/api/images/binggan.png"}]
         */

        private String orderNum;
        private int type;
        private List<ShopsBean> shops;

        public String getOrderNum() {
            return orderNum;
        }

        public void setOrderNum(String orderNum) {
            this.orderNum = orderNum;
        }

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }

        public List<ShopsBean> getShops() {
            return shops;
        }

        public void setShops(List<ShopsBean> shops) {
            this.shops = shops;
        }

        public static class ShopsBean {
            /**
             * name : 农家自产百合干（500g）
             * price : 22.8
             * num : 1
             * imageUrl : http://blog.zhaoliang5156.cn/api/images/binggan.png
             */

            private String name;
            private double price;
            private int num;
            private String imageUrl;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public double getPrice() {
                return price;
            }

            public void setPrice(double price) {
                this.price = price;
            }

            public int getNum() {
                return num;
            }

            public void setNum(int num) {
                this.num = num;
            }

            public String getImageUrl() {
                return imageUrl;
            }

            public void setImageUrl(String imageUrl) {
                this.imageUrl = imageUrl;
            }
        }
    }
}
