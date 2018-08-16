package com.cn.platform.fertility.dao.impl;

import com.cn.framework.mvc.mysql.dao.impl.BaseDaoImpl;
import com.cn.platform.fertility.dao.FertilityDao;
import com.cn.platform.fertility.entity.Fertility;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

@Repository
public class FertilityDaoImpl extends BaseDaoImpl<Fertility,String> implements FertilityDao {

    private static Logger logger = LoggerFactory.getLogger(FertilityDaoImpl.class);
    private final static String SQLNAME_DELETE_BY_PRIMARY_KEY = "deleteByPrimaryKey";
    private final static String SQLNAME_SELECT_BY_PRIMARY_KEY = "selectByPrimaryKey";



    @Override
    public int deleteByPrimaryKey(String id) {
        int flag = 0;
        try {
            flag = sqlSession.delete(SQLNAME_DELETE_BY_PRIMARY_KEY,id);
        } catch (Exception e) {
            logger.error(String.format("根据ID删除出错！语句：%s", getSqlName(SQLNAME_DELETE_BY_PRIMARY_KEY)), e);
        }
        return flag;
    }

    @Override
    public Fertility selectByPrimaryKey(String id) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(Fertility record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Fertility record) {
        return 0;
    }

}
