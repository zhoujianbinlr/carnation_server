package com.cn.mobileapp.recharge.service;

import java.io.Serializable;
import java.util.List;

import com.cn.framework.mvc.mongodb.service.BaseMongoService;
import com.cn.mobileapp.recharge.entity.MerchantRecharge;

/**
 * @Project: zhoujb 
 * @Package: com.cn.mobileapp.deposit.service
 * @ClassName: DepositService
 * @Description: <p></p>
 * @JDK version used: 
 * @Author: zhoujb
 * @Create Date: 2017年10月27日
 * @modify By:
 * @modify Date:
 * @Why&What is modify:
 * @Version: 1.0
 */
public interface MerchantRechargeService extends BaseMongoService<MerchantRecharge, Serializable> {
	List<MerchantRecharge> findParams(List<String> fileds);
}
