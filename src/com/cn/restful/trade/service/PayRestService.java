/**
 



 *  <p> Created on 2017年9月8日</p>

 
 
 */
package com.cn.restful.trade.service;

import com.cn.restful.RestResponse;
import com.cn.restful.dto.request.RequestPay;
import com.cn.restful.dto.request.RequestQuery;
import com.cn.restful.dto.request.RequestRefund;

/**
 * @Project: zhoujb_desk
 * @Package: com.cn.restful.pay.service
 * @ClassName: PayService
 * @Description:
 *               <p>
 *               </p>
 * @JDK version used:
 * @Author: zhoujb
 * @Create Date: 2017年9月8日
 * @modify By:
 * @modify Date:
 * @Why&What is modify:
 * @Version: 1.0
 */
public interface PayRestService {

	/**
	 * 订单支付
	 * 
	 * @param payParamsVo
	 * @return
	 */
	RestResponse pay(RequestPay payParamsVo);

	/**
	 * 订单退费
	 * 
	 * @param payParamsVo
	 * @return
	 */
	RestResponse refund(RequestRefund refundParamsVo);

	
}
