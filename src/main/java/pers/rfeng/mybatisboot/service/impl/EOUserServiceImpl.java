package pers.rfeng.mybatisboot.service.impl;

import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pers.rfeng.mybatisboot.dao.EOUserDao;
import pers.rfeng.mybatisboot.entity.EOUser;
import pers.rfeng.mybatisboot.entity.RequestBoot;
import pers.rfeng.mybatisboot.entity.ResultBoot;
import pers.rfeng.mybatisboot.service.EOUserService;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description :用户业务类
 * @Author: niaonao
 * @Date: 2018/8/20 14:04
 */
@Service(value = "eOUserService")
public class EOUserServiceImpl implements EOUserService {

    @Autowired
    private EOUserDao eoUserDao;

    @Override
    public ResultBoot addEOUser(RequestBoot boot) {
        //解析请求数据
        EOUser eoUser = JSONObject.parseObject(boot.getTreasureData(), EOUser.class);
        String errorMsg = "添加用户信息成功！";
        Boolean success = Boolean.FALSE;

        if (eoUser == null){
            errorMsg = "用户信息未填写！";
        }else {
            String userName = eoUser.getUserName() == null ? "" : eoUser.getUserName();
            String userPassword = eoUser.getUserPassword() == null ? "" : eoUser.getUserPassword();
            if (userName.equals("") || userPassword.equals("")){
                errorMsg = "请检查帐户名及密码是否填写！";
            }else {

                //添加用户
                int row = eoUserDao.insertSelective(eoUser);
                if (row < 1){
                    errorMsg = "添加用户信息失败！";
                }else {
                    success = Boolean.TRUE;
                }
            }
        }

        //封装返回结果
        ResultBoot resultBoot = new ResultBoot(success,errorMsg,null);
        return resultBoot;
    }

    @Override
    public ResultBoot updateEOUser(RequestBoot boot) {
        //解析请求数据
        EOUser eoUser = JSONObject.parseObject(boot.getTreasureData(), EOUser.class);
        String errorMsg = "更新用户信息成功！";
        Boolean success = Boolean.FALSE;

        if (eoUser == null){
            errorMsg = "用户信息未填写！";
        }else {
            String userName = eoUser.getUserName() == null ? "" : eoUser.getUserName();
            if (userName.equals("")){
                errorMsg = "请检查帐户名是否填写！";
            }else {

                //更新用户
                int row = eoUserDao.updateByIdSelective(eoUser);
                if (row < 1){
                    errorMsg = "更新用户信息失败！";
                }else {
                    success = Boolean.TRUE;
                }
            }
        }

        //封装返回结果
        ResultBoot resultBoot = new ResultBoot(success,errorMsg,null);
        return resultBoot;
    }

    @Override
    public ResultBoot deleteEOUser(RequestBoot boot) {
        //解析请求数据
        EOUser eoUser = JSONObject.parseObject(boot.getTreasureData(), EOUser.class);
        String errorMsg = "删除用户成功！";
        Boolean success = Boolean.FALSE;

        if (eoUser == null){
            errorMsg = "用户信息未填写！";
        }else {
            String userName = eoUser.getUserName() == null ? "" : eoUser.getUserName();
            if (userName.equals("")){
                errorMsg = "请检查帐户名是否填写！";
            }else {

                int row = eoUserDao.deleteById(userName);
                if (row < 1){
                    errorMsg = "删除用户失败！";
                }else {
                    success = Boolean.TRUE;
                }
            }
        }

        //封装返回结果
        ResultBoot resultBoot = new ResultBoot(success,errorMsg,null);
        return resultBoot;
    }

    @Override
    public ResultBoot getEOUser(RequestBoot boot) {
        //解析请求数据
        EOUser eoUser = JSONObject.parseObject(boot.getTreasureData(), EOUser.class);
        String errorMsg = "获取用户信息成功！";
        Boolean success = Boolean.FALSE;
        List<EOUser> eoUserList = new ArrayList<>();

        if (eoUser == null){
            errorMsg = "用户信息未填写！";
        }else {
            String userName = eoUser.getUserName() == null ? "" : eoUser.getUserName();
            if (userName.equals("")){
                errorMsg = "请检查帐户名是否填写！";
            }else {

                List<EOUser> list = eoUserDao.getList(eoUser);
                if (list != null && list.size() < 1){
                    errorMsg = "获取用户信息失败！";
                }else {
                    eoUserList.add(list.get(0));
                    success = Boolean.TRUE;
                }
            }
        }

        //封装返回结果
        ResultBoot resultBoot = new ResultBoot(success,errorMsg,eoUserList);
        return resultBoot;
    }

    @Override
    public ResultBoot getEOUserList(RequestBoot boot) {
        //解析请求数据
        EOUser eoUser = JSONObject.parseObject(boot.getTreasureData(), EOUser.class);
        if (eoUser == null){
            eoUser = new EOUser();
        }
        String errorMsg = "获取用户列表成功！";
        Boolean success = Boolean.FALSE;
        List<EOUser> eoUserList = eoUserDao.getList(eoUser);

        if (eoUserList != null && eoUserList.size() < 1){
            errorMsg = "获取用户信息失败！";
        }else {
            success = Boolean.TRUE;
        }

        //封装返回结果
        ResultBoot resultBoot = new ResultBoot(success,errorMsg,eoUserList);
        return resultBoot;
    }
}