package com.bawie.lianxi0409.model.bean;

/*
 *@auther:杜其林
 *@Date: 2020/4/9
 *@Time:10:51
 *@Description:${DESCRIPTION}
 * */
public class LoginBean {

    /**
     * result : {"headPic":"http://mobile.bwstudent.com/images/small/head_pic/2020-03-24/20200324193950.jpg","nickName":"gI_4671i","phone":"18930021285","sessionId":"158640067653327911","sex":1,"userId":27911}
     * message : 登录成功
     * status : 0000
     */

    private ResultBean result;
    private String message;
    private String status;

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

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

    public static class ResultBean {
        /**
         * headPic : http://mobile.bwstudent.com/images/small/head_pic/2020-03-24/20200324193950.jpg
         * nickName : gI_4671i
         * phone : 18930021285
         * sessionId : 158640067653327911
         * sex : 1
         * userId : 27911
         */

        private String headPic;
        private String nickName;
        private String phone;
        private String sessionId;
        private int sex;
        private int userId;

        public String getHeadPic() {
            return headPic;
        }

        public void setHeadPic(String headPic) {
            this.headPic = headPic;
        }

        public String getNickName() {
            return nickName;
        }

        public void setNickName(String nickName) {
            this.nickName = nickName;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public String getSessionId() {
            return sessionId;
        }

        public void setSessionId(String sessionId) {
            this.sessionId = sessionId;
        }

        public int getSex() {
            return sex;
        }

        public void setSex(int sex) {
            this.sex = sex;
        }

        public int getUserId() {
            return userId;
        }

        public void setUserId(int userId) {
            this.userId = userId;
        }
    }
}
