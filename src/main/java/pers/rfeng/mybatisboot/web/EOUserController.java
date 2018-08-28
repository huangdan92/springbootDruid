package pers.rfeng.mybatisboot.web;

import org.springframework.web.bind.annotation.*;
import pers.rfeng.mybatisboot.entity.RequestBoot;
import pers.rfeng.mybatisboot.entity.ResultBoot;
import pers.rfeng.mybatisboot.service.EOUserService;

import javax.annotation.Resource;

/**
 * @Description :用户的控制类
 * @Author: niaonao
 * @Date: 2018/8/20 11:57
 */
@RestController
@RequestMapping("/manage/eouser")
public class EOUserController {


    @Resource
    private EOUserService eoUserService;

    /**
     * 添加用户
     * @param boot
     * @return
     */
    @ResponseBody
    @PostMapping(value = "/addEOUser")
    public ResultBoot addEOUser(@RequestBody RequestBoot boot){
        return eoUserService.addEOUser(boot);
    }

    /**
     * 删除用户
     * @param boot
     * @return
     */
    @ResponseBody
    @PostMapping(value = "/deleteEOUser")
    public ResultBoot deleteEOUser(@RequestBody RequestBoot boot){
        return eoUserService.deleteEOUser(boot);
    }

    /**
     * 更新用户
     * @param boot
     * @return
     */
    @ResponseBody
    @PostMapping(value = "/updateEOUser")
    public ResultBoot updateEOUser(@RequestBody RequestBoot boot){
        return eoUserService.updateEOUser(boot);
    }

    /**
     * 获取用户
     * @param boot
     * @return
     */
    @ResponseBody
    @PostMapping(value = "/getEOUser")
    public ResultBoot getEOUser(@RequestBody RequestBoot boot){
        return eoUserService.getEOUser(boot);
    }

    /**
     * 获取用户列表
     * @param boot
     * @return
     */
    @ResponseBody
    @PostMapping(value = "/getEOUserList")
    public ResultBoot getEOUserList(@RequestBody RequestBoot boot){
        return eoUserService.getEOUserList(boot);
    }

}