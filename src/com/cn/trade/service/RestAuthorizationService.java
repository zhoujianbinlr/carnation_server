package com.cn.trade.service;

import java.util.Map;

/**
 * @Project: zhoujb 
 * @Package: com.sunshine.restful.trade.service
 * @ClassName: RestAuthorizationService
 * @Description: <p></p>
 * @JDK version used: 
 * @Author: zhoujb
 * @Create Date: 2017年9月14日
 * @modify By:
 * @modify Date:
 * @Why&What is modify:
 * @Version: 1.0
 */
public interface RestAuthorizationService {

	/**
	 * 鉴权
	 * @param params
	 * @return
	 */
	Map<String, String> authorization(Map<String, String> params);

	/**
	 * 返回参数加签
	 * @param params
	 * @return
	 */
	Map<String, String> responseAuthorization(Map<String, String> params);


}
