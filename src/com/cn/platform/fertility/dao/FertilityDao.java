package com.cn.platform.fertility.dao;

import com.cn.framework.mvc.mysql.dao.BaseDao;
import com.cn.platform.fertility.entity.Fertility;

public interface FertilityDao extends BaseDao<Fertility, String> {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table biz_fertility
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String id);



    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table biz_fertility
     *
     * @mbg.generated
     */
    Fertility selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table biz_fertility
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(Fertility record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table biz_fertility
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Fertility record);

}