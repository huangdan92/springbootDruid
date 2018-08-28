package pers.rfeng.mybatisboot.service;

import pers.rfeng.mybatisboot.entity.RequestBoot;
import pers.rfeng.mybatisboot.entity.ResultBoot;

/**
 * @Description :用户业务接口
 * @Author: niaonao
 * @Date: 2018/8/20 11:58
 */
public interface EOUserService {

    /**
     * 添加用户
     * @param boot
     * @return
     */
    ResultBoot addEOUser(RequestBoot boot);

    /**
     * 更新用户信息
     * @param boot
     * @return
     */
    ResultBoot updateEOUser(RequestBoot boot);

    /**
     * 删除用户
     * @param boot
     * @return
     */
    ResultBoot deleteEOUser(RequestBoot boot);

    /**
     * 获取用户信息
     * @param boot
     * @return
     */
    ResultBoot getEOUser(RequestBoot boot);

    /**
     * 获取用户列表
     * @param boot
     * @return
     */
    ResultBoot getEOUserList(RequestBoot boot);
}