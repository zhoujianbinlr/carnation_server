package com.cn.mobileapp.recharge.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.cn.common.GlobalConstant;
import com.cn.mobileapp.recharge.entity.MerchantRecharge;
import com.cn.mobileapp.recharge.service.MerchantRechargeService;

/**
 * @Project: zhoujb 
 * @Package: com.cn.mobileapp.recharge.controller
 * @ClassName: RechargeController
 * @Description: <p></p>
 * @JDK version used: 
 * @Author: zhoujb
 * @Create Date: 2017年10月27日
 * @modify By:
 * @modify Date:
 * @Why&What is modify:
 * @Version: 1.0
 */
@Controller
@RequestMapping("/recharge")
public class RechargeController {

	private Logger logger = LoggerFactory.getLogger(RechargeController.class);

	@RequestMapping(value = "/list")
	public ModelAndView list(HttpServletRequest request, ModelMap modelMap) {
		logger.info("跳转至充值首页");
		return new ModelAndView("mobileapp/recharge/list");
	}

	@RequestMapping(value = "/rechargeEdit")
	public ModelAndView rechargeEdit(HttpServletRequest request, ModelMap modelMap) {
		logger.info("跳转至充值申请页");
		return new ModelAndView("mobileapp/recharge/rechargeEdit");
	}

	@ResponseBody
	@RequestMapping(value = "/applyRecharge")
	public Object applyRecharge(HttpServletRequest request, ModelMap modelMap) {
		Map<String, Object> retMap = new HashMap<String, Object>();
		return retMap;
	}

}
