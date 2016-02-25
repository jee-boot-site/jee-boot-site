package com.boot.cms.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "cms_article")
public class Article {
    /**
     * 编号
     */
    @Id
    private String id;

    /**
     * 栏目编号
     */
    @Column(name = "category_id")
    private String categoryId;

    /**
     * 标题
     */
    private String title;

    /**
     * 文章链接
     */
    private String link;

    /**
     * 标题颜色
     */
    private String color;

    /**
     * 文章图片
     */
    private String image;

    /**
     * 关键字
     */
    private String keywords;

    /**
     * 描述、摘要
     */
    private String description;

    /**
     * 权重，越大越靠前
     */
    private Integer weight;

    /**
     * 权重期限
     */
    @Column(name = "weight_date")
    private Date weightDate;

    /**
     * 点击数
     */
    private Integer hits;

    /**
     * 推荐位，多选
     */
    private String posid;

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
     * 获取栏目编号
     *
     * @return category_id - 栏目编号
     */
    public String getCategoryId() {
        return categoryId;
    }

    /**
     * 设置栏目编号
     *
     * @param categoryId 栏目编号
     */
    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId == null ? null : categoryId.trim();
    }

    /**
     * 获取标题
     *
     * @return title - 标题
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置标题
     *
     * @param title 标题
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * 获取文章链接
     *
     * @return link - 文章链接
     */
    public String getLink() {
        return link;
    }

    /**
     * 设置文章链接
     *
     * @param link 文章链接
     */
    public void setLink(String link) {
        this.link = link == null ? null : link.trim();
    }

    /**
     * 获取标题颜色
     *
     * @return color - 标题颜色
     */
    public String getColor() {
        return color;
    }

    /**
     * 设置标题颜色
     *
     * @param color 标题颜色
     */
    public void setColor(String color) {
        this.color = color == null ? null : color.trim();
    }

    /**
     * 获取文章图片
     *
     * @return image - 文章图片
     */
    public String getImage() {
        return image;
    }

    /**
     * 设置文章图片
     *
     * @param image 文章图片
     */
    public void setImage(String image) {
        this.image = image == null ? null : image.trim();
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
     * 获取描述、摘要
     *
     * @return description - 描述、摘要
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置描述、摘要
     *
     * @param description 描述、摘要
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * 获取权重，越大越靠前
     *
     * @return weight - 权重，越大越靠前
     */
    public Integer getWeight() {
        return weight;
    }

    /**
     * 设置权重，越大越靠前
     *
     * @param weight 权重，越大越靠前
     */
    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    /**
     * 获取权重期限
     *
     * @return weight_date - 权重期限
     */
    public Date getWeightDate() {
        return weightDate;
    }

    /**
     * 设置权重期限
     *
     * @param weightDate 权重期限
     */
    public void setWeightDate(Date weightDate) {
        this.weightDate = weightDate;
    }

    /**
     * 获取点击数
     *
     * @return hits - 点击数
     */
    public Integer getHits() {
        return hits;
    }

    /**
     * 设置点击数
     *
     * @param hits 点击数
     */
    public void setHits(Integer hits) {
        this.hits = hits;
    }

    /**
     * 获取推荐位，多选
     *
     * @return posid - 推荐位，多选
     */
    public String getPosid() {
        return posid;
    }

    /**
     * 设置推荐位，多选
     *
     * @param posid 推荐位，多选
     */
    public void setPosid(String posid) {
        this.posid = posid == null ? null : posid.trim();
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