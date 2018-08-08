package com.cn.mobileapp.recharge.service.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cn.framework.mvc.mongodb.dao.BaseMongoDao;
import com.cn.framework.mvc.mongodb.service.impl.BaseMongoServiceImpl;
import com.cn.mobileapp.recharge.dao.MerchantRechargeDao;
import com.cn.mobileapp.recharge.entity.MerchantRecharge;
import com.cn.mobileapp.recharge.service.MerchantRechargeService;

/**
 * @Project: zhoujb 
 * @Package: com.cn.mobileapp.deposit.service.impl
 * @ClassName: DepositServiceImpl
 * @Description: <p></p>
 * @JDK version used: 
 * @Author: zhoujb
 * @Create Date: 2017年10月27日
 * @modify By:
 * @modify Date:
 * @Why&What is modify:
 * @Version: 1.0
 */
//@Service
public class MerchantRechargeServiceImpl extends BaseMongoServiceImpl<MerchantRecharge, Serializable> implements MerchantRechargeService {

	@Autowired
	private MerchantRechargeDao depositDao;

	@Override
	protected BaseMongoDao<MerchantRecharge, Serializable> getDao() {
		return depositDao;
	}

	@Override
	public List<MerchantRecharge> findParams(List<String> fileds) {
		return depositDao.findAll(fileds);
	}

}
