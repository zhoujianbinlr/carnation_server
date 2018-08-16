package com.cn.platform.fertility.service.impl;

import com.cn.framework.mvc.mysql.dao.BaseDao;
import com.cn.framework.mvc.mysql.service.impl.BaseServiceImpl;
import com.cn.platform.fertility.dao.FertilityDao;
import com.cn.platform.fertility.entity.Fertility;
import com.cn.platform.fertility.service.FertilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class FertilityServiceImpl extends BaseServiceImpl<Fertility,String> implements FertilityService {

    @Autowired
    private FertilityDao fertilityDao;

    @Override
    protected BaseDao<Fertility, String> getDao() {
        return fertilityDao;
    }

    @Override
    public boolean deleteByPrimaryKey(String id) {
        return fertilityDao.deleteByPrimaryKey(id) > 0 ? Boolean.TRUE : Boolean.FALSE;
    }

    @Override
    public Fertility selectByPrimaryKey(String id) {
        return fertilityDao.selectByPrimaryKey(id);
    }

    @Override
    public boolean updateByPrimaryKeySelective(Fertility record) {
        return fertilityDao.updateByPrimaryKeySelective(record) > 0 ? Boolean.TRUE : Boolean.FALSE;
    }

    @Override
    public boolean updateByPrimaryKey(Fertility record) {
        return fertilityDao.updateByPrimaryKey(record) > 0 ? Boolean.TRUE : Boolean.FALSE;
    }

    @Override
    public List<Fertility> findAll() {
        return fertilityDao.findAll();
    }
}
