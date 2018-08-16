package com.cn.platform.fertility.service;

import com.cn.framework.mvc.service.BaseService;
import com.cn.platform.fertility.entity.Fertility;

import java.util.List;

public interface FertilityService extends BaseService<Fertility,String> {
    /**
     * 根据ID删除
     * @param id
     * @return
     */
    boolean deleteByPrimaryKey(String id);



    /**
     * 根据主键ID查询
     * @param id
     * @return
     */
    Fertility selectByPrimaryKey(String id);

    /**
     * 选择性更新
     * @param record
     * @return
     */
    boolean updateByPrimaryKeySelective(Fertility record);

    /**
     * 根据主键更新
     * @param record
     * @return
     */
    boolean updateByPrimaryKey(Fertility record);

    /**
     *  查询所有
     * @return
     */
    List<Fertility> findAll();
}
