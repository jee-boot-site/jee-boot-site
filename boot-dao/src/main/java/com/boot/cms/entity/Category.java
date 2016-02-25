package com.boot.cms.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "cms_category")
public class Category {
    /**
     * 编号
     */
    @Id
    private String id;

    /**
     * 父级编号
     */
    @Column(name = "parent_id")
    private String parentId;

    /**
     * 所有父级编号
     */
    @Column(name = "parent_ids")
    private String parentIds;

    /**
     * 站点编号
     */
    @Column(name = "site_id")
    private String siteId;

    /**
     * 归属机构
     */
    @Column(name = "office_id")
    private String officeId;

    /**
     * 栏目模块
     */
    private String module;

    /**
     * 栏目名称
     */
    private String name;

    /**
     * 栏目图片
     */
    private String image;

    /**
     * 链接
     */
    private String href;

    /**
     * 目标
     */
    private String target;

    /**
     * 描述
     */
    private String description;

    /**
     * 关键字
     */
    private String keywords;

    /**
     * 排序（升序）
     */
    private Integer sort;

    /**
     * 是否在导航中显示
     */
    @Column(name = "in_menu")
    private String inMenu;

    /**
     * 是否在分类页中显示列表
     */
    @Column(name = "in_list")
    private String inList;

    /**
     * 展现方式
     */
    @Column(name = "show_modes")
    private String showModes;

    /**
     * 是否允许评论
     */
    @Column(name = "allow_comment")
    private String allowComment;

    /**
     * 是否需要审核
     */
    @Column(name = "is_audit")
    private String isAudit;

    /**
     * 自定义列表视图
     */
    @Column(name = "custom_list_view")
    private String customListView;

    /**
     * 自定义内容视图
     */
    @Column(name = "custom_content_view")
    private String customContentView;

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
     * 视图配置
     */
    @Column(name = "view_config")
    private String viewConfig;

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
     * 获取父级编号
     *
     * @return parent_id - 父级编号
     */
    public String getParentId() {
        return parentId;
    }

    /**
     * 设置父级编号
     *
     * @param parentId 父级编号
     */
    public void setParentId(String parentId) {
        this.parentId = parentId == null ? null : parentId.trim();
    }

    /**
     * 获取所有父级编号
     *
     * @return parent_ids - 所有父级编号
     */
    public String getParentIds() {
        return parentIds;
    }

    /**
     * 设置所有父级编号
     *
     * @param parentIds 所有父级编号
     */
    public void setParentIds(String parentIds) {
        this.parentIds = parentIds == null ? null : parentIds.trim();
    }

    /**
     * 获取站点编号
     *
     * @return site_id - 站点编号
     */
    public String getSiteId() {
        return siteId;
    }

    /**
     * 设置站点编号
     *
     * @param siteId 站点编号
     */
    public void setSiteId(String siteId) {
        this.siteId = siteId == null ? null : siteId.trim();
    }

    /**
     * 获取归属机构
     *
     * @return office_id - 归属机构
     */
    public String getOfficeId() {
        return officeId;
    }

    /**
     * 设置归属机构
     *
     * @param officeId 归属机构
     */
    public void setOfficeId(String officeId) {
        this.officeId = officeId == null ? null : officeId.trim();
    }

    /**
     * 获取栏目模块
     *
     * @return module - 栏目模块
     */
    public String getModule() {
        return module;
    }

    /**
     * 设置栏目模块
     *
     * @param module 栏目模块
     */
    public void setModule(String module) {
        this.module = module == null ? null : module.trim();
    }

    /**
     * 获取栏目名称
     *
     * @return name - 栏目名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置栏目名称
     *
     * @param name 栏目名称
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 获取栏目图片
     *
     * @return image - 栏目图片
     */
    public String getImage() {
        return image;
    }

    /**
     * 设置栏目图片
     *
     * @param image 栏目图片
     */
    public void setImage(String image) {
        this.image = image == null ? null : image.trim();
    }

    /**
     * 获取链接
     *
     * @return href - 链接
     */
    public String getHref() {
        return href;
    }

    /**
     * 设置链接
     *
     * @param href 链接
     */
    public void setHref(String href) {
        this.href = href == null ? null : href.trim();
    }

    /**
     * 获取目标
     *
     * @return target - 目标
     */
    public String getTarget() {
        return target;
    }

    /**
     * 设置目标
     *
     * @param target 目标
     */
    public void setTarget(String target) {
        this.target = target == null ? null : target.trim();
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
     * 获取排序（升序）
     *
     * @return sort - 排序（升序）
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * 设置排序（升序）
     *
     * @param sort 排序（升序）
     */
    public void setSort(Integer sort) {
        this.sort = sort;
    }

    /**
     * 获取是否在导航中显示
     *
     * @return in_menu - 是否在导航中显示
     */
    public String getInMenu() {
        return inMenu;
    }

    /**
     * 设置是否在导航中显示
     *
     * @param inMenu 是否在导航中显示
     */
    public void setInMenu(String inMenu) {
        this.inMenu = inMenu == null ? null : inMenu.trim();
    }

    /**
     * 获取是否在分类页中显示列表
     *
     * @return in_list - 是否在分类页中显示列表
     */
    public String getInList() {
        return inList;
    }

    /**
     * 设置是否在分类页中显示列表
     *
     * @param inList 是否在分类页中显示列表
     */
    public void setInList(String inList) {
        this.inList = inList == null ? null : inList.trim();
    }

    /**
     * 获取展现方式
     *
     * @return show_modes - 展现方式
     */
    public String getShowModes() {
        return showModes;
    }

    /**
     * 设置展现方式
     *
     * @param showModes 展现方式
     */
    public void setShowModes(String showModes) {
        this.showModes = showModes == null ? null : showModes.trim();
    }

    /**
     * 获取是否允许评论
     *
     * @return allow_comment - 是否允许评论
     */
    public String getAllowComment() {
        return allowComment;
    }

    /**
     * 设置是否允许评论
     *
     * @param allowComment 是否允许评论
     */
    public void setAllowComment(String allowComment) {
        this.allowComment = allowComment == null ? null : allowComment.trim();
    }

    /**
     * 获取是否需要审核
     *
     * @return is_audit - 是否需要审核
     */
    public String getIsAudit() {
        return isAudit;
    }

    /**
     * 设置是否需要审核
     *
     * @param isAudit 是否需要审核
     */
    public void setIsAudit(String isAudit) {
        this.isAudit = isAudit == null ? null : isAudit.trim();
    }

    /**
     * 获取自定义列表视图
     *
     * @return custom_list_view - 自定义列表视图
     */
    public String getCustomListView() {
        return customListView;
    }

    /**
     * 设置自定义列表视图
     *
     * @param customListView 自定义列表视图
     */
    public void setCustomListView(String customListView) {
        this.customListView = customListView == null ? null : customListView.trim();
    }

    /**
     * 获取自定义内容视图
     *
     * @return custom_content_view - 自定义内容视图
     */
    public String getCustomContentView() {
        return customContentView;
    }

    /**
     * 设置自定义内容视图
     *
     * @param customContentView 自定义内容视图
     */
    public void setCustomContentView(String customContentView) {
        this.customContentView = customContentView == null ? null : customContentView.trim();
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
     * 获取视图配置
     *
     * @return view_config - 视图配置
     */
    public String getViewConfig() {
        return viewConfig;
    }

    /**
     * 设置视图配置
     *
     * @param viewConfig 视图配置
     */
    public void setViewConfig(String viewConfig) {
        this.viewConfig = viewConfig == null ? null : viewConfig.trim();
    }
}