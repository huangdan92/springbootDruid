package pers.rfeng.mybatisboot.entity;

/**
 * @Description :EOUser实体类
 * @Author: niaonao
 * @Date: 2018/8/20 11:30
 */
public class EOUser {

    /**
     * 用户名
     */
    private String userName;

    /**
     * 用户昵称
     */
    private String userNickName;

    /**
     * 用户密码
     */
    private String userPassword;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserNickName() {
        return userNickName;
    }

    public void setUserNickName(String userNickName) {
        this.userNickName = userNickName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }
}