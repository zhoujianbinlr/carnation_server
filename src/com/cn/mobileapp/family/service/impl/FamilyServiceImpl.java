package com.cn.mobileapp.family.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cn.framework.mvc.mysql.dao.BaseDao;
import com.cn.framework.mvc.mysql.service.impl.BaseServiceImpl;
import com.cn.mobileapp.family.dao.FamilyDao;
import com.cn.mobileapp.family.entity.Family;
import com.cn.mobileapp.family.service.FamilyService;

/**
 * 
 * @Project: Prescription_PlatForm 
 * @Package: com.cn.mobileapp.family.service
 * @ClassName: FamilyServiceImpl
 * @Description: <p>	家人管理	</p>
 * @JDK version used: 
 * @Author: 
 * @Create Date: 2017年9月7日
 * @modify By:
 * @modify Date:
 * @Why&What is modify:
 * @Version: 1.0
 */
@Service
public class FamilyServiceImpl extends BaseServiceImpl<Family, String> implements FamilyService {

	@Autowired
	private FamilyDao FamilyDao;
	
	@Override
	protected BaseDao<Family, String> getDao() {
		return FamilyDao;
	}

	@Override
	public boolean findByMobileAndName(Family family) {
		Map map=new HashMap<>();
		map.put("idCard", family.getIdCard());
		Family entity=FamilyDao.findByMobileAndName(map);
		if(entity == null){
			return true;
		}else{
			if(entity.getId().equals(family.getId())){
				return true;
			}else{
				return false;
			}
		}
	}

}
