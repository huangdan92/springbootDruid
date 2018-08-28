package pers.rfeng.mybatisboot.entity;

import java.io.Serializable;
import java.util.List;

/**
 * @Description :返回结果封装实体类
 * @Author: niaonao
 * @Date: 2018/8/20 14:08
 */
public class ResultBoot implements Serializable {

    private static final long serialVersionUID = 3401781428101852075L;

    /**
     * 接口请求处理结果
     * 成功true，失败-false
     */
    private Boolean success;

    /**
     * 处理结果信息
     */
    private String errorMsg;

    /**
     * 返回用户集合
     */
    private List<EOUser> eoUserList;

    public ResultBoot(Boolean success, String errorMsg, List<EOUser> eoUserList) {
        this.success = success;
        this.errorMsg = errorMsg;
        this.eoUserList = eoUserList;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public List<EOUser> getEoUserList() {
        return eoUserList;
    }

    public void setEoUserList(List<EOUser> eoUserList) {
        this.eoUserList = eoUserList;
    }
}