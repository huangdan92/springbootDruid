package pers.rfeng.mybatisboot.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description :项目测试欢迎信息
 * @Author: niaonao
 * @Date: 2018/8/20 11:19
 */
@RestController
public class MyBatisBootController {

    @RequestMapping(value = "/")
    public String welcome(){
        return "MyBatis Spring Boot Project";
    }
}