package com.boot.cms.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "cms_link")
public class Link {
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
     * 链接名称
     */
    private String title;

    /**
     * 标题颜色
     */
    private String color;

    /**
     * 链接图片
     */
    private String image;

    /**
     * 链接地址
     */
    private String href;

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
     * 获取链接名称
     *
     * @return title - 链接名称
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置链接名称
     *
     * @param title 链接名称
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
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
     * 获取链接图片
     *
     * @return image - 链接图片
     */
    public String getImage() {
        return image;
    }

    /**
     * 设置链接图片
     *
     * @param image 链接图片
     */
    public void setImage(String image) {
        this.image = image == null ? null : image.trim();
    }

    /**
     * 获取链接地址
     *
     * @return href - 链接地址
     */
    public String getHref() {
        return href;
    }

    /**
     * 设置链接地址
     *
     * @param href 链接地址
     */
    public void setHref(String href) {
        this.href = href == null ? null : href.trim();
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
}