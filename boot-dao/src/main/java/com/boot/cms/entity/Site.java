package com.boot.cms.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "cms_site")
public class Site {
    /**
     * 编号
     */
    @Id
    private String id;

    /**
     * 站点名称
     */
    private String name;

    /**
     * 站点标题
     */
    private String title;

    /**
     * 站点Logo
     */
    private String logo;

    /**
     * 站点域名
     */
    private String domain;

    /**
     * 描述
     */
    private String description;

    /**
     * 关键字
     */
    private String keywords;

    /**
     * 主题
     */
    private String theme;

    /**
     * 自定义站点首页视图
     */
    @Column(name = "custom_index_view")
    private String customIndexView;

    /**
     * 创建者
     */
    @Column(name = "create_by")
    private String createBy;

    /**
     * 创建时间
     */
    @Column(name = "create_date")
    private Date createDate;

    /**
     * 更新者
     */
    @Column(name = "update_by")
    private String updateBy;

    /**
     * 更新时间
     */
    @Column(name = "update_date")
    private Date updateDate;

    /**
     * 备注信息
     */
    private String remarks;

    /**
     * 删除标记
     */
    @Column(name = "del_flag")
    private String delFlag;

    /**
     * 版权信息
     */
    private String copyright;

    /**
     * 获取编号
     *
     * @return id - 编号
     */
    public String getId() {
        return id;
    }

    /**
     * 设置编号
     *
     * @param id 编号
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * 获取站点名称
     *
     * @return name - 站点名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置站点名称
     *
     * @param name 站点名称
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 获取站点标题
     *
     * @return title - 站点标题
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置站点标题
     *
     * @param title 站点标题
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * 获取站点Logo
     *
     * @return logo - 站点Logo
     */
    public String getLogo() {
        return logo;
    }

    /**
     * 设置站点Logo
     *
     * @param logo 站点Logo
     */
    public void setLogo(String logo) {
        this.logo = logo == null ? null : logo.trim();
    }

    /**
     * 获取站点域名
     *
     * @return domain - 站点域名
     */
    public String getDomain() {
        return domain;
    }

    /**
     * 设置站点域名
     *
     * @param domain 站点域名
     */
    public void setDomain(String domain) {
        this.domain = domain == null ? null : domain.trim();
    }

    /**
     * 获取描述
     *
     * @return description - 描述
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置描述
     *
     * @param description 描述
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * 获取关键字
     *
     * @return keywords - 关键字
     */
    public String getKeywords() {
        return keywords;
    }

    /**
     * 设置关键字
     *
     * @param keywords 关键字
     */
    public void setKeywords(String keywords) {
        this.keywords = keywords == null ? null : keywords.trim();
    }

    /**
     * 获取主题
     *
     * @return theme - 主题
     */
    public String getTheme() {
        return theme;
    }

    /**
     * 设置主题
     *
     * @param theme 主题
     */
    public void setTheme(String theme) {
        this.theme = theme == null ? null : theme.trim();
    }

    /**
     * 获取自定义站点首页视图
     *
     * @return custom_index_view - 自定义站点首页视图
     */
    public String getCustomIndexView() {
        return customIndexView;
    }

    /**
     * 设置自定义站点首页视图
     *
     * @param customIndexView 自定义站点首页视图
     */
    public void setCustomIndexView(String customIndexView) {
        this.customIndexView = customIndexView == null ? null : customIndexView.trim();
    }

    /**
     * 获取创建者
     *
     * @return create_by - 创建者
     */
    public String getCreateBy() {
        return createBy;
    }

    /**
     * 设置创建者
     *
     * @param createBy 创建者
     */
    public void setCreateBy(String createBy) {
        this.createBy = createBy == null ? null : createBy.trim();
    }

    /**
     * 获取创建时间
     *
     * @return create_date - 创建时间
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * 设置创建时间
     *
     * @param createDate 创建时间
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 获取更新者
     *
     * @return update_by - 更新者
     */
    public String getUpdateBy() {
        return updateBy;
    }

    /**
     * 设置更新者
     *
     * @param updateBy 更新者
     */
    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy == null ? null : updateBy.trim();
    }

    /**
     * 获取更新时间
     *
     * @return update_date - 更新时间
     */
    public Date getUpdateDate() {
        return updateDate;
    }

    /**
     * 设置更新时间
     *
     * @param updateDate 更新时间
     */
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * 获取备注信息
     *
     * @return remarks - 备注信息
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * 设置备注信息
     *
     * @param remarks 备注信息
     */
    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    /**
     * 获取删除标记
     *
     * @return del_flag - 删除标记
     */
    public String getDelFlag() {
        return delFlag;
    }

    /**
     * 设置删除标记
     *
     * @param delFlag 删除标记
     */
    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag == null ? null : delFlag.trim();
    }

    /**
     * 获取版权信息
     *
     * @return copyright - 版权信息
     */
    public String getCopyright() {
        return copyright;
    }

    /**
     * 设置版权信息
     *
     * @param copyright 版权信息
     */
    public void setCopyright(String copyright) {
        this.copyright = copyright == null ? null : copyright.trim();
    }
}