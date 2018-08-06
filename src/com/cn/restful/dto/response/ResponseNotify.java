/**
 



 *  <p> Created on 2017年9月27日</p>

 
 
 */
package com.cn.restful.dto.response;

import com.cn.common.GlobalConstant;
import com.cn.framework.common.PKGenerator;
import com.cn.restful.RestConstant;
import com.cn.restful.dto.TradeParams;

/**
 * @Project: zhoujb 
 * @Package: com.cn.restful.dto.response
 * @ClassName: ResponseNotify
 * @Description: <p>通用回调返回参数</p>
 * @JDK version used: 
 * @Author: zhoujb
 * @Create Date: 2017年9月27日
 * @modify By:
 * @modify Date:
 * @Why&What is modify:
 * @Version: 1.0
 */
public class ResponseNotify extends TradeParams {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4805060863228893049L;

	/**
	 * 交易状态
	 */
	private String tradeState;

	/**
	 * 支付金额、总金额
	 */
	private String totalFee;

	/**
	 * 平台支付交易订单号
	 */
	private String tradeNo;

	/**
	 * 商户订单号
	 */
	private String outOrderNo;

	/**
	 * 支付时间
	 */
	private String payTime;

	/**
	 * 附加参数，原样返回
	 */
	private String attach;

	/**
	 * 退费交易订单号
	 */
	private String refundNo;

	/**
	 * 商户退费业务订单号
	 */
	private String outRefundNo;

	/**
	 * 退费金额
	 */
	private String refundFee;

	/**
	 * 退款原因
	 */
	private String refundDesc;

	/**
	 * 第三方回调参数转JSON
	 */
	private String agtJson;

	/**
	 * 第三方平台编码
	 */
	private String platformCode;

	/**
	 * 系统跟踪号
	 */
	private String traceNo;

	/**
	 * 第三方支付平台支付交易订单号
	 */
	private String agtTradeNo;

	/**
	 * 
	 */
	public ResponseNotify() {
		super();
	}

	public String getTradeState() {
		return tradeState;
	}

	public void setTradeState(String tradeState) {
		this.tradeState = tradeState;
	}

	public String getTotalFee() {
		return totalFee;
	}

	public void setTotalFee(String totalFee) {
		this.totalFee = totalFee;
	}

	public String getTradeNo() {
		return tradeNo;
	}

	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

	public String getOutOrderNo() {
		return outOrderNo;
	}

	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}

	public String getPayTime() {
		return payTime;
	}

	public void setPayTime(String payTime) {
		this.payTime = payTime;
	}

	public String getAttach() {
		return attach;
	}

	public void setAttach(String attach) {
		this.attach = attach;
	}

	public String getRefundNo() {
		return refundNo;
	}

	public void setRefundNo(String refundNo) {
		this.refundNo = refundNo;
	}

	public String getOutRefundNo() {
		return outRefundNo;
	}

	public void setOutRefundNo(String outRefundNo) {
		this.outRefundNo = outRefundNo;
	}

	public String getRefundFee() {
		return refundFee;
	}

	public void setRefundFee(String refundFee) {
		this.refundFee = refundFee;
	}

	public String getRefundDesc() {
		return refundDesc;
	}

	public void setRefundDesc(String refundDesc) {
		this.refundDesc = refundDesc;
	}

	public String getAgtJson() {
		return agtJson;
	}

	public void setAgtJson(String agtJson) {
		this.agtJson = agtJson;
	}

	public String getPlatformCode() {
		return platformCode;
	}

	public void setPlatformCode(String platformCode) {
		this.platformCode = platformCode;
	}

	/** 
	* 获取系统跟踪号 
	* @return traceNo
	*/
	public String getTraceNo() {
		return traceNo;
	}

	/** 
	* 设置系统跟踪号 
	* @param traceNo
	*/
	public void setTraceNo(String traceNo) {
		this.traceNo = traceNo;
	}

	/** 
	* 获取第三方支付平台支付交易订单号 
	* @return agtTradeNo
	*/
	public String getAgtTradeNo() {
		return agtTradeNo;
	}

	/** 
	* 设置第三方支付平台支付交易订单号 
	* @param agtTradeNo
	*/
	public void setAgtTradeNo(String agtTradeNo) {
		this.agtTradeNo = agtTradeNo;
	}

}
