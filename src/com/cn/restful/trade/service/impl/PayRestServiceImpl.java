package com.cn.restful.trade.service.impl;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.alibaba.dubbo.rpc.protocol.rest.support.ContentType;
import com.alibaba.fastjson.JSON;
import com.cn.restful.RestConstant;
import com.cn.restful.RestResponse;
import com.cn.restful.dto.request.RequestPay;
import com.cn.restful.dto.request.RequestRefund;
import com.cn.restful.trade.service.PayRestService;

/**
 * @Project: zhoujb_desk
 * @Package: com.cn.restful.trade.service.impl
 * @ClassName: PayServiceImpl
 * @Description:
 *               <p>RESTFULL请求处理类</p>
 * @JDK version used:
 * @Author: zhoujb
 * @Create Date: 2017年9月8日
 * @modify By:
 * @modify Date:
 * @Why&What is modify:
 * @Version: 1.0
 */
@Path("v1/trade")
@Consumes({ MediaType.APPLICATION_JSON, MediaType.TEXT_XML })
@Produces({ ContentType.APPLICATION_JSON_UTF_8, ContentType.TEXT_XML_UTF_8 })
public class PayRestServiceImpl implements PayRestService {

	private static Logger logger = LoggerFactory.getLogger(PayRestServiceImpl.class);



	@POST
	@Path("pay")
	@Override
	public RestResponse pay(RequestPay vo) {
		logger.info("订单支付请求参数:{}", JSON.toJSONString(vo));
		RestResponse restResponse = null;
		try {
			restResponse = new RestResponse(RestConstant.RETURN_SUCCESS[0], RestConstant.RETURN_SUCCESS[1]);
		} catch (Exception e) {
			restResponse = new RestResponse(RestConstant.RETURN_SYSTEMERROR[0], RestConstant.RETURN_SYSTEMERROR[1]);
			e.printStackTrace();
		}
		return restResponse;
	}

	@POST
	@Path("refund")
	@Override
	public RestResponse refund(RequestRefund refundParamsVo) {
		logger.info("订单退费请求参数:{}", JSON.toJSONString(refundParamsVo));
		RestResponse restResponse = null;
		try {
			restResponse = new RestResponse(RestConstant.RETURN_SUCCESS[0], RestConstant.RETURN_SUCCESS[1]);
		} catch (Exception e) {
			restResponse = new RestResponse(RestConstant.RETURN_SYSTEMERROR[0], RestConstant.RETURN_SYSTEMERROR[1]);
			e.printStackTrace();
			logger.error("订单退费请求参数校验不通过！");
		}
		return restResponse;
	}

	
}
