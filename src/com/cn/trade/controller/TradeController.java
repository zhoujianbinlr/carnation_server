/**
 






 
 */
package com.cn.trade.controller;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @Project: zhoujb 
 * @Package: com.sunshine.trade.service.controller
 * @ClassName: TradeController
 * @Description: <p></p>
 * @JDK version used: 
 * @Author: zhoujb
 * @Create Date: 2017年9月18日
 * @modify By:
 * @modify Date:
 * @Why&What is modify:
 * @Version: 1.0
 */
@Controller
@RequestMapping("/trade")
public class TradeController {
	private Logger logger = LoggerFactory.getLogger(TradeController.class);


	@RequestMapping(value = "/test")
	public ModelAndView test(HttpServletRequest request, ModelMap modelMap) {
		return new ModelAndView("trade/test");
	}
}
