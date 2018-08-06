/**
 



 *  <p> Created on 2017年9月14日</p>

 
 
 */
package com.cn.trade.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.cn.trade.service.RestAuthorizationService;

/**
 * @Project: zhoujb 
 * @Package: com.sunshine.restful.trade.service.impl
 * @ClassName: RestAuthorizationServiceImpl
 * @Description: <p>rest请求签名处理的请求集中函数</p>
 * @JDK version used: 
 * @Author: zhoujb
 * @Create Date: 2017年9月14日
 * @modify By:
 * @modify Date:
 * @Why&What is modify:
 * @Version: 1.0
 */
@Service
public class RestAuthorizationServiceImpl implements RestAuthorizationService {

	private static Logger logger = LoggerFactory.getLogger(RestAuthorizationServiceImpl.class);

	@Override
	public Map<String, String> authorization(Map<String, String> params) {
		Map<String, String> retMap = new HashMap<String, String>();
		return retMap;
	}

	@Override
	public Map<String, String> responseAuthorization(Map<String, String> retMap) {
		logger.info("加签Map:{}", JSON.toJSONString(retMap));
		return retMap;
	}


}
