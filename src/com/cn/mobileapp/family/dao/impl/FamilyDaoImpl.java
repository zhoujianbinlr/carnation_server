package com.cn.mobileapp.family.dao.impl;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import org.springframework.util.Assert;

import com.cn.framework.exception.SystemException;
import com.cn.framework.mvc.mysql.dao.impl.BaseDaoImpl;
import com.cn.mobileapp.family.dao.FamilyDao;
import com.cn.mobileapp.family.entity.Family;

/**
 * 
 * @Project: Prescription_PlatForm
 * @Package: com.cn.mobileapp.family.dao.impl
 * @ClassName: FamilyDaoImpl
 * @Description:
 *               <p>
 *               </p>
 * @JDK version used:
 * @Author: 
 * @Create Date: 2017年9月7日
 * @modify By:
 * @modify Date:
 * @Why&What is modify:
 * @Version: 1.0
 */
@Repository
public class FamilyDaoImpl extends BaseDaoImpl<Family, String> implements FamilyDao {

	private static Logger logger = LoggerFactory.getLogger(FamilyDaoImpl.class);
	private final static String SQLNAME_FIND_BY_MOBILE_AND_NAME = "findByMobileAndName";

	@Override
	public Family findByMobileAndName(Map map) {
		try {
			Assert.notNull(map);
			return sqlSession.selectOne(getSqlName(SQLNAME_FIND_BY_MOBILE_AND_NAME), map);
		} catch (Exception e) {
			logger.error(String.format("通过姓名和号码判断是否已关联了家人出错！语句：%s", getSqlName(SQLNAME_FIND_BY_MOBILE_AND_NAME)), e);
			throw new SystemException(String.format("通过姓名和号码判断是否已关联了家人出错！语句：%s", getSqlName(SQLNAME_FIND_BY_MOBILE_AND_NAME)), e);
		}
	}

}
