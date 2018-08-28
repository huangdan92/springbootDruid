package pers.rfeng.mybatisboot.entity;

import java.io.Serializable;
/**
 * @Description :请求参数封装实体类
 * @Author: niaonao
 * @Date: 2018/8/20 11:59
 */
public class RequestBoot implements Serializable {

    private static final long serialVersionUID = 3401781428101852075L;

    /**
     * 请求响应数据
     */
    private String treasureData;

    public String getTreasureData() {
        return treasureData;
    }

    public void setTreasureData(String treasureData) {
        this.treasureData = treasureData;
    }


}