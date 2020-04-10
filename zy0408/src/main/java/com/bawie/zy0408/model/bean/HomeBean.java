package com.bawie.zy0408.model.bean;

import java.util.List;

/*
 *@auther:杜其林
 *@Date: 2020/4/8
 *@Time:19:16
 *@Description:${DESCRIPTION}
 * */
public class HomeBean {

    /**
     * orderList : [{"detailList":[{"commentStatus":1,"commodityCount":3,"commodityId":32,"commodityName":"唐狮女鞋冬季女鞋休闲鞋子女士女鞋百搭帆布鞋女士休闲鞋子女款板鞋休闲女鞋帆布鞋","commodityPic":"http://mobile.bwstudent.com/images/small/commodity/nx/fbx/1/1.jpg,http://mobile.bwstudent.com/images/small/commodity/nx/fbx/1/2.jpg,http://mobile.bwstudent.com/images/small/commodity/nx/fbx/1/3.jpg,http://mobile.bwstudent.com/images/small/commodity/nx/fbx/1/4.jpg,http://mobile.bwstudent.com/images/small/commodity/nx/fbx/1/5.jpg","commodityPrice":88,"orderDetailId":12341}],"expressCompName":"京东快递","expressSn":"1001","orderId":"2020013110353508327911","orderStatus":2,"orderTime":1580438135000,"payAmount":264,"payMethod":1,"userId":27911},{"detailList":[{"commentStatus":1,"commodityCount":1,"commodityId":32,"commodityName":"唐狮女鞋冬季女鞋休闲鞋子女士女鞋百搭帆布鞋女士休闲鞋子女款板鞋休闲女鞋帆布鞋","commodityPic":"http://mobile.bwstudent.com/images/small/commodity/nx/fbx/1/1.jpg,http://mobile.bwstudent.com/images/small/commodity/nx/fbx/1/2.jpg,http://mobile.bwstudent.com/images/small/commodity/nx/fbx/1/3.jpg,http://mobile.bwstudent.com/images/small/commodity/nx/fbx/1/4.jpg,http://mobile.bwstudent.com/images/small/commodity/nx/fbx/1/5.jpg","commodityPrice":88,"orderDetailId":12340}],"expressCompName":"京东快递","expressSn":"1001","orderId":"2020013110350216327911","orderStatus":3,"orderTime":1580438102000,"payAmount":88,"payMethod":1,"userId":27911},{"detailList":[{"commentStatus":1,"commodityCount":1,"commodityId":25,"commodityName":"秋冬季真皮兔毛女鞋韩版休闲平底毛毛鞋软底百搭浅口水钻加绒棉鞋毛毛鞋潮鞋","commodityPic":"http://mobile.bwstudent.com/images/small/commodity/nx/ddx/1/1.jpg,http://mobile.bwstudent.com/images/small/commodity/nx/ddx/1/2.jpg,http://mobile.bwstudent.com/images/small/commodity/nx/ddx/1/3.jpg,http://mobile.bwstudent.com/images/small/commodity/nx/ddx/1/4.jpg,http://mobile.bwstudent.com/images/small/commodity/nx/ddx/1/5.jpg","commodityPrice":158,"orderDetailId":12339}],"expressCompName":"京东快递","expressSn":"1001","orderId":"2020013110324116127911","orderStatus":1,"orderTime":1580437961000,"payAmount":158,"payMethod":1,"userId":27911}]
     * message : 查询成功
     * status : 0000
     */

    private String message;
    private String status;
    private List<OrderListBean> orderList;

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

    public List<OrderListBean> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<OrderListBean> orderList) {
        this.orderList = orderList;
    }

    public static class OrderListBean {
        /**
         * detailList : [{"commentStatus":1,"commodityCount":3,"commodityId":32,"commodityName":"唐狮女鞋冬季女鞋休闲鞋子女士女鞋百搭帆布鞋女士休闲鞋子女款板鞋休闲女鞋帆布鞋","commodityPic":"http://mobile.bwstudent.com/images/small/commodity/nx/fbx/1/1.jpg,http://mobile.bwstudent.com/images/small/commodity/nx/fbx/1/2.jpg,http://mobile.bwstudent.com/images/small/commodity/nx/fbx/1/3.jpg,http://mobile.bwstudent.com/images/small/commodity/nx/fbx/1/4.jpg,http://mobile.bwstudent.com/images/small/commodity/nx/fbx/1/5.jpg","commodityPrice":88,"orderDetailId":12341}]
         * expressCompName : 京东快递
         * expressSn : 1001
         * orderId : 2020013110353508327911
         * orderStatus : 2
         * orderTime : 1580438135000
         * payAmount : 264
         * payMethod : 1
         * userId : 27911
         */

        private String expressCompName;
        private String expressSn;
        private String orderId;
        private int orderStatus;
        private long orderTime;
        private int payAmount;
        private int payMethod;
        private int userId;
        private List<DetailListBean> detailList;

        public String getExpressCompName() {
            return expressCompName;
        }

        public void setExpressCompName(String expressCompName) {
            this.expressCompName = expressCompName;
        }

        public String getExpressSn() {
            return expressSn;
        }

        public void setExpressSn(String expressSn) {
            this.expressSn = expressSn;
        }

        public String getOrderId() {
            return orderId;
        }

        public void setOrderId(String orderId) {
            this.orderId = orderId;
        }

        public int getOrderStatus() {
            return orderStatus;
        }

        public void setOrderStatus(int orderStatus) {
            this.orderStatus = orderStatus;
        }

        public long getOrderTime() {
            return orderTime;
        }

        public void setOrderTime(long orderTime) {
            this.orderTime = orderTime;
        }

        public int getPayAmount() {
            return payAmount;
        }

        public void setPayAmount(int payAmount) {
            this.payAmount = payAmount;
        }

        public int getPayMethod() {
            return payMethod;
        }

        public void setPayMethod(int payMethod) {
            this.payMethod = payMethod;
        }

        public int getUserId() {
            return userId;
        }

        public void setUserId(int userId) {
            this.userId = userId;
        }

        public List<DetailListBean> getDetailList() {
            return detailList;
        }

        public void setDetailList(List<DetailListBean> detailList) {
            this.detailList = detailList;
        }

        public static class DetailListBean {
            /**
             * commentStatus : 1
             * commodityCount : 3
             * commodityId : 32
             * commodityName : 唐狮女鞋冬季女鞋休闲鞋子女士女鞋百搭帆布鞋女士休闲鞋子女款板鞋休闲女鞋帆布鞋
             * commodityPic : http://mobile.bwstudent.com/images/small/commodity/nx/fbx/1/1.jpg,http://mobile.bwstudent.com/images/small/commodity/nx/fbx/1/2.jpg,http://mobile.bwstudent.com/images/small/commodity/nx/fbx/1/3.jpg,http://mobile.bwstudent.com/images/small/commodity/nx/fbx/1/4.jpg,http://mobile.bwstudent.com/images/small/commodity/nx/fbx/1/5.jpg
             * commodityPrice : 88
             * orderDetailId : 12341
             */

            private int commentStatus;
            private int commodityCount;
            private int commodityId;
            private String commodityName;
            private String commodityPic;
            private double commodityPrice;
            private int orderDetailId;

            public int getCommentStatus() {
                return commentStatus;
            }

            public void setCommentStatus(int commentStatus) {
                this.commentStatus = commentStatus;
            }

            public int getCommodityCount() {
                return commodityCount;
            }

            public void setCommodityCount(int commodityCount) {
                this.commodityCount = commodityCount;
            }

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

            public String getCommodityPic() {
                return commodityPic;
            }

            public void setCommodityPic(String commodityPic) {
                this.commodityPic = commodityPic;
            }

            public double getCommodityPrice() {
                return commodityPrice;
            }

            public void setCommodityPrice(double commodityPrice) {
                this.commodityPrice = commodityPrice;
            }

            public int getOrderDetailId() {
                return orderDetailId;
            }

            public void setOrderDetailId(int orderDetailId) {
                this.orderDetailId = orderDetailId;
            }
        }
    }
}
