package com.bawie.duqilin20200408.model.bean;

import java.util.List;

/*
 *@auther:杜其林
 *@Date: 2020/4/8
 *@Time:13:50
 *@Description:${DESCRIPTION}
 * */
public class HomeBean {

    /**
     * result : [{"categoryName":"美妆护肤","shoppingCartList":[{"commodityId":6,"commodityName":"轻柔系自然裸妆假睫毛","count":4,"pic":"http://mobile.bwstudent.com/images/small/commodity/mzhf/cz/4/1.jpg","price":39}]},{"categoryName":"女鞋","shoppingCartList":[{"commodityId":19,"commodityName":"环球 时尚拼色街拍百搭小白鞋 韩版原宿ulzzang板鞋 女休闲鞋","count":4,"pic":"http://mobile.bwstudent.com/images/small/commodity/nx/bx/2/1.jpg","price":78}]}]
     * message : 查询成功
     * status : 0000
     */

    private String message;
    private String status;
    private List<ResultBean> result;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<ResultBean> getResult() {
        return result;
    }

    public void setResult(List<ResultBean> result) {
        this.result = result;
    }

    public static class ResultBean {
        /**
         * categoryName : 美妆护肤
         * shoppingCartList : [{"commodityId":6,"commodityName":"轻柔系自然裸妆假睫毛","count":4,"pic":"http://mobile.bwstudent.com/images/small/commodity/mzhf/cz/4/1.jpg","price":39}]
         */

        private String categoryName;
        private List<ShoppingCartListBean> shoppingCartList;

        public String getCategoryName() {
            return categoryName;
        }

        public void setCategoryName(String categoryName) {
            this.categoryName = categoryName;
        }

        public List<ShoppingCartListBean> getShoppingCartList() {
            return shoppingCartList;
        }

        public void setShoppingCartList(List<ShoppingCartListBean> shoppingCartList) {
            this.shoppingCartList = shoppingCartList;
        }

        public static class ShoppingCartListBean {
            /**
             * commodityId : 6
             * commodityName : 轻柔系自然裸妆假睫毛
             * count : 4
             * pic : http://mobile.bwstudent.com/images/small/commodity/mzhf/cz/4/1.jpg
             * price : 39
             */

            private int commodityId;
            private String commodityName;
            private int count;
            private String pic;
            private int price;

            public int getCommodityId() {
                return commodityId;
            }

            public void setCommodityId(int commodityId) {
                this.commodityId = commodityId;
            }

            public String getCommodityName() {
                return commodityName;
            }

            public void setCommodityName(String commodityName) {
                this.commodityName = commodityName;
            }

            public int getCount() {
                return count;
            }

            public void setCount(int count) {
                this.count = count;
            }

            public String getPic() {
                return pic;
            }

            public void setPic(String pic) {
                this.pic = pic;
            }

            public int getPrice() {
                return price;
            }

            public void setPrice(int price) {
                this.price = price;
            }
        }
    }
}
