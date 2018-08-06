package com.cn.mobileapp.login.dao;

import java.util.Map;

import com.cn.framework.mvc.mysql.dao.BaseDao;
import com.cn.mobileapp.login.entity.AppUser;

/**
 * 
 * @Project: Prescription_PlatForm 
 * @Package: com.cn.mobileapp.login.dao
 * @ClassName: AppUserDao
 * @Description: <p>	用户账号dao	</p>
 * @JDK version used: 
 * @Author: 
 * @Create Date: 2017年9月6日
 * @modify By:
 * @modify Date:
 * @Why&What is modify:
 * @Version: 1.0
 */
public interface AppUserDao extends BaseDao<AppUser, String> {
	
	/**
	 * 根据账号登录
	 * @param map
	 * @return
	 */
	public AppUser findByAccount(Map map);
	
}