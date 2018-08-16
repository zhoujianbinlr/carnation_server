package com.cn.platform.fertility.entity;

import com.cn.framework.mvc.mysql.entity.BaseSQLEntity;

import java.util.Date;

/**
* @Package com.cn.platform.fertility.entity
* @ClassName com.cn.platform.fertility.entity.Fertility
* @TableName biz_fertility
* @Description生殖中心
* @JDK version used 1.8.0_181-b13
* @Author zhoujb
* @Create Date 2018年8月16日
* @modify By 
* @modify Date 
* @Why&What is modify 
* @Version 1.0
*/
public class Fertility extends BaseSQLEntity {
    /**
     * 主键ID
     */
    private String id;

    /**
     * 生殖中心名称
     */
    private String name;

    /**
     * 生殖中心简称
     */
    private String shortName;

    /**
     * 生殖中心编码
     */
    private String code;

    /**
     * 生殖中心类型
     */
    private String type;

    /**
     * 生殖中心等级
     */
    private String level;

    /**
     * 所属市省份编码
     */
    private String provinceCode;

    /**
     * 所属市编码
     */
    private String cityCode;

    /**
     * 所属区编码
     */
    private String districtCode;

    /**
     * 地址
     */
    private String address;

    /**
     * 上线状态 1:上线 0:停用 默认为0
     */
    private Integer status;

    /**
     * log路径
     */
    private String logoPath;

    /**
     * 简介
     */
    private String introduction;

    /**
     * 联系人
     */
    private String linkMan;

    /**
     * 联系电话
     */
    private String linkPhone;

    /**
     * 备注
     */
    private String remark;

    /**
     * 创建人id
     */
    private String cp;

    /**
     * 创建人名称
     */
    private String cpName;

    /**
     * 创建时间
     */
    private Date ct;

    /**
     * 修改人id
     */
    private String ep;

    /**
     * 修改人名称
     */
    private String epName;

    /**
     * 修改时间
     */
    private Date et;

    /**
    * @return 主键ID
    */
    public String getId() {
        return id;
    }

    /**
     * @param id  主键ID
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
    * @return 生殖中心名称
    */
    public String getName() {
        return name;
    }

    /**
     * @param name  生殖中心名称
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
    * @return 生殖中心简称
    */
    public String getShortName() {
        return shortName;
    }

    /**
     * @param shortName  生殖中心简称
     */
    public void setShortName(String shortName) {
        this.shortName = shortName == null ? null : shortName.trim();
    }

    /**
    * @return 生殖中心编码
    */
    public String getCode() {
        return code;
    }

    /**
     * @param code  生殖中心编码
     */
    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    /**
    * @return 生殖中心类型
    */
    public String getType() {
        return type;
    }

    /**
     * @param type  生殖中心类型
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    /**
    * @return 生殖中心等级
    */
    public String getLevel() {
        return level;
    }

    /**
     * @param level  生殖中心等级
     */
    public void setLevel(String level) {
        this.level = level == null ? null : level.trim();
    }

    /**
    * @return 所属市省份编码
    */
    public String getProvinceCode() {
        return provinceCode;
    }

    /**
     * @param provinceCode  所属市省份编码
     */
    public void setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode == null ? null : provinceCode.trim();
    }

    /**
    * @return 所属市编码
    */
    public String getCityCode() {
        return cityCode;
    }

    /**
     * @param cityCode  所属市编码
     */
    public void setCityCode(String cityCode) {
        this.cityCode = cityCode == null ? null : cityCode.trim();
    }

    /**
    * @return 所属区编码
    */
    public String getDistrictCode() {
        return districtCode;
    }

    /**
     * @param districtCode  所属区编码
     */
    public void setDistrictCode(String districtCode) {
        this.districtCode = districtCode == null ? null : districtCode.trim();
    }

    /**
    * @return 地址
    */
    public String getAddress() {
        return address;
    }

    /**
     * @param address  地址
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
    * @return 上线状态 1:上线 0:停用 默认为0
    */
    public Integer getStatus() {
        return status;
    }

    /**
     * @param status  上线状态 1:上线 0:停用 默认为0
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
    * @return log路径
    */
    public String getLogoPath() {
        return logoPath;
    }

    /**
     * @param logoPath  log路径
     */
    public void setLogoPath(String logoPath) {
        this.logoPath = logoPath == null ? null : logoPath.trim();
    }

    /**
    * @return 简介
    */
    public String getIntroduction() {
        return introduction;
    }

    /**
     * @param introduction  简介
     */
    public void setIntroduction(String introduction) {
        this.introduction = introduction == null ? null : introduction.trim();
    }

    /**
    * @return 联系人
    */
    public String getLinkMan() {
        return linkMan;
    }

    /**
     * @param linkMan  联系人
     */
    public void setLinkMan(String linkMan) {
        this.linkMan = linkMan == null ? null : linkMan.trim();
    }

    /**
    * @return 联系电话
    */
    public String getLinkPhone() {
        return linkPhone;
    }

    /**
     * @param linkPhone  联系电话
     */
    public void setLinkPhone(String linkPhone) {
        this.linkPhone = linkPhone == null ? null : linkPhone.trim();
    }

    /**
    * @return 备注
    */
    public String getRemark() {
        return remark;
    }

    /**
     * @param remark  备注
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
    * @return 创建人id
    */
    public String getCp() {
        return cp;
    }

    /**
     * @param cp  创建人id
     */
    public void setCp(String cp) {
        this.cp = cp == null ? null : cp.trim();
    }

    /**
    * @return 创建人名称
    */
    public String getCpName() {
        return cpName;
    }

    /**
     * @param cpName  创建人名称
     */
    public void setCpName(String cpName) {
        this.cpName = cpName == null ? null : cpName.trim();
    }

    /**
    * @return 创建时间
    */
    public Date getCt() {
        return ct;
    }

    /**
     * @param ct  创建时间
     */
    public void setCt(Date ct) {
        this.ct = ct;
    }

    /**
    * @return 修改人id
    */
    public String getEp() {
        return ep;
    }

    /**
     * @param ep  修改人id
     */
    public void setEp(String ep) {
        this.ep = ep == null ? null : ep.trim();
    }

    /**
    * @return 修改人名称
    */
    public String getEpName() {
        return epName;
    }

    /**
     * @param epName  修改人名称
     */
    public void setEpName(String epName) {
        this.epName = epName == null ? null : epName.trim();
    }

    /**
    * @return 修改时间
    */
    public Date getEt() {
        return et;
    }

    /**
     * @param et  修改时间
     */
    public void setEt(Date et) {
        this.et = et;
    }
}