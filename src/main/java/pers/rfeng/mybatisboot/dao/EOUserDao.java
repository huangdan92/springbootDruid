package pers.rfeng.mybatisboot.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import pers.rfeng.mybatisboot.entity.EOUser;

import java.util.List;

/**
 * @Description :用户dao
 * @Author: niaonao
 * @Date: 2018/8/20 11:34
 */
@Repository
@Mapper
public interface EOUserDao {

    /**
     * 根据实体查找列表
     * @param eoUser
     * @return
     */
    List<EOUser> getList(EOUser eoUser);

    /**
     * 根据userName删除信息
     * @param userName
     * @return
     */
    int deleteById(String userName);

    /**
     * 插入信息
     * @param eoUser
     * @return
     */
    int insert(EOUser eoUser);

    /**
     * 插入信息(如果字段不为空插入)
     * @param eoUser
     * @return
     */
    int insertSelective(EOUser eoUser);

    /**
     * 根据userName查询实体信息
     * @param userName
     * @return
     */
    EOUser selectById(String userName);

    /**
     * 更新信息(如果字段不为空更新)
     * @param eoUser
     * @return
     */
    int updateByIdSelective(EOUser eoUser);

    /**
     * 更新信息
     * @param eoUser
     * @return
     */
    int updateById(EOUser eoUser);
}