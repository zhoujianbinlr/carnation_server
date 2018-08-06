package com.cn.mobileapp.login.service;

import java.util.Map;

import com.cn.framework.mvc.service.BaseService;
import com.cn.mobileapp.login.entity.AppUser;

public interface AppUserService extends BaseService<AppUser, String> {

	/**
	 * 根据账号登录
	 * @param map
	 * @return
	 */
	public AppUser findByAccount(Map map);
}
