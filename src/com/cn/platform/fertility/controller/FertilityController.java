package com.cn.platform.fertility.controller;

import com.cn.common.controller.BasePlatformController;
import com.cn.framework.mvc.controller.RespBody;
import com.cn.framework.mvc.mysql.service.BaseSQLService;
import com.cn.platform.fertility.entity.Fertility;
import com.cn.platform.fertility.service.FertilityService;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * 生殖管理中心控制类
 */
@Controller
@RequestMapping(value = "/platform/fertility")
public class FertilityController extends BasePlatformController<Fertility, String> {
    private static Logger logger = LoggerFactory.getLogger(FertilityController.class);

    @Autowired
    private FertilityService fertilityService;


    @Override
    protected BaseSQLService<Fertility, String> getService() {
        return fertilityService;
    }

    /**
     * 生殖中心管理列表页
     * @return
     */
    @RequestMapping(value = "/list")
    public ModelAndView list() {
        return new ModelAndView("/platform/fertility/fertilityList");
    }

    /**
     * 生殖中心管理编辑
     * @return
     */
    @RequestMapping(value = "/toEdit")
    public ModelAndView toEdit(HttpServletRequest request) {
        String id = request.getParameter("id");
        Fertility fertility = new Fertility();
        if(!StringUtils.isEmpty(id)){
            fertility = fertilityService.selectByPrimaryKey(id);
        }
        ModelAndView view = new ModelAndView("/platform/fertility/editFertility");
        view.addObject("fertility", fertility);
        return view;
    }

    /**
     * 保存生殖中心信息
     *
     * @param fertility
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/saveOrUpdate", method = RequestMethod.POST)
    public RespBody saveOrUpdate(Fertility fertility) {

        Map<String, Object> resMap = new HashMap<>();


        return new RespBody(RespBody.StatusEnum.OK, resMap);
    }
}
