/**
 



 *  <p> Created on 2017年9月20日</p>

 
 
 */
package com.cn.restful.dto.response;

import com.cn.restful.dto.TradeParams;

/**
 * 
 * @Project: zhoujb 
 * @Package: com.cn.restful.dto.response
 * @ClassName: ResponsePayQRCode
 * @Description: <p>支付二维码返回参数 </p>
 * @JDK version used: 
 * @Author: zhoujb
 * @Create Date: 2017年12月8日
 * @modify By:
 * @modify Date:
 * @Why&What is modify:
 * @Version: 1.0
 */
public class ResponsePayQRCode extends TradeParams {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4717862058266728073L;

	/**
	 * 二维码支付地址。用于生成二维码后提供给用户微信/支付宝APP扫码支付
	 */
	private String zhoujbUrl;

	/**
	 * 支付订单Id
	 */
	private String zhoujbId;

	/**
	 * 
	 */
	public ResponsePayQRCode() {
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
