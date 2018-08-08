
package com.cn.common.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cn.common.dao.CommonDao;
import com.cn.common.service.CommonService;
import com.cn.common.vo.TreeNodeVo;
import com.cn.framework.common.spring.ext.SpringContextHolder;

/**
 * @Project
 * @Package com.cn.common.service.impl
 * @ClassName CommonServiceImpl.java
 * @Description
 * @JDK version used 1.8
 * @Author zhoujb
 * @Create Date 2017年7月10日
 * @modify By
 * @modify Date
 * @Why&What is modify
 * @Version 1.0
 */
@Service
public class CommonServiceImpl implements CommonService {
	private CommonDao commonDao = SpringContextHolder.getBean(CommonDao.class);

	@Override
	public List<TreeNodeVo> findResourceByRoleIdAndParentId(String roleId, String parentId) {
		// TODO Auto-generated method stub
		return commonDao.findResourceTreeByRoleIdAndParentId(parentId, roleId);
	}

	@Override
	public List<TreeNodeVo> findResourceTreeVoByRoleId(String roleId) {
		// TODO Auto-generated method stub
		return commonDao.findResourceTreeByRoleId(roleId);
	}

	@Override
	public List<TreeNodeVo> findDeptTreeByUserIdAndParentId(String userId, String parentId) {
		// TODO Auto-generated method stub
		return commonDao.findDeptTreeByUserIdAndParentId(userId, parentId);
	}

	@Override
	public List<TreeNodeVo> findDeptTreeByUserId(String userId) {
		// TODO Auto-generated method stub
		return commonDao.findDeptTreeByUserId(userId);
	}

    @Override
    public List<TreeNodeVo> findMenuResourceTreeByResourceId(String resourceId) {
	    // TODO Auto-generated method stub
	   return commonDao.findMenuResourceTreeByResourceId(resourceId);
    }



}
