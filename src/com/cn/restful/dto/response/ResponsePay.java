/**
 



 *  <p> Created on 2017年9月20日</p>

 
 
 */
package com.cn.restful.dto.response;

import com.cn.restful.dto.TradeParams;

/**
 * @Project: zhoujb 
 * @Package: com.cn.restful.dto.response
 * @ClassName: ResponsePay
 * @Description: <p>支付交易返回参数</p>
 * @JDK version used: 
 * @Author: zhoujb
 * @Create Date: 2017年9月20日
 * @modify By:
 * @modify Date:
 * @Why&What is modify:
 * @Version: 1.0
 */
public class ResponsePay extends TradeParams {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4717862058266728073L;

	/**
	 * 支付请求地址
	 */
	private String zhoujbUrl;

	/**
	 * 支付请求Id
	 */
	private String zhoujbId;

	/**
	 * 
	 */
	public ResponsePay() {
		super();
	}

	public String getzhoujbUrl() {
		return zhoujbUrl;
	}

	public void setzhoujbUrl(String zhoujbUrl) {
		this.zhoujbUrl = zhoujbUrl;
	}

	public String getzhoujbId() {
		return zhoujbId;
	}

	public void setzhoujbId(String zhoujbId) {
		this.zhoujbId = zhoujbId;
	}

}
