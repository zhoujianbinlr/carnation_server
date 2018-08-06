package com.cn.common.freemarker;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.view.freemarker.FreeMarkerView;

import com.cn.framework.config.SystemConfig;
import com.cn.framework.utils.DateUtils;
import com.cn.restful.utils.RestUtils;

/**
 * 自定义freemarker视图解析器,增加模板全局变量
 */
public class CombaFreeMarkerView extends FreeMarkerView {
	public static Logger logger = LoggerFactory.getLogger(CombaFreeMarkerView.class);
	public static String DEFAULT_VERSION_NUMBER = "1.0";

	public static final String WEB_BASE_PATH = "basePath";
	public static final String WEB_IMG_PATH = "imgPath";
	public static final String WEB_HOST_IP = "hostIP";

	@Override
	protected void exposeHelpers(Map<String, Object> model, HttpServletRequest request) throws Exception {
		String basePath = RestUtils.getTradeDomainUrl();
		if (logger.isDebugEnabled()) {
			logger.debug("CombaFreeMarkerView exposeHelpers's basePath:{}", basePath);
		}
		String imgPath = SystemConfig.getStringValue("file_virtual_path");
		if (StringUtils.isBlank(imgPath)) {
			logger.warn("file_virtual_path is not found.use default /pic");
		} else {
			imgPath = basePath.concat("/pic");
		}
		DEFAULT_VERSION_NUMBER = DateUtils.getCurrentTime();

		String hostIP = SystemConfig.Host_IP;
		// 设置项目路径为全局变量

		model.put(WEB_BASE_PATH, basePath);
		model.put(WEB_HOST_IP, hostIP);
		model.put(WEB_IMG_PATH, imgPath);
		super.exposeHelpers(model, request);
	}

}
