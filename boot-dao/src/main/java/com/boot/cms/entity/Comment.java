package com.boot.cms.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "cms_comment")
public class Comment {
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
     * 栏目内容的编号
     */
    @Column(name = "content_id")
    private String contentId;

    /**
     * 栏目内容的标题
     */
    private String title;

    /**
     * 评论内容
     */
    private String content;

    /**
     * 评论姓名
     */
    private String name;

    /**
     * 评论IP
     */
    private String ip;

    /**
     * 评论时间
     */
    @Column(name = "create_date")
    private Date createDate;

    /**
     * 审核人
     */
    @Column(name = "audit_user_id")
    private String auditUserId;

    /**
     * 审核时间
     */
    @Column(name = "audit_date")
    private Date auditDate;

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
     * 获取栏目内容的编号
     *
     * @return content_id - 栏目内容的编号
     */
    public String getContentId() {
        return contentId;
    }

    /**
     * 设置栏目内容的编号
     *
     * @param contentId 栏目内容的编号
     */
    public void setContentId(String contentId) {
        this.contentId = contentId == null ? null : contentId.trim();
    }

    /**
     * 获取栏目内容的标题
     *
     * @return title - 栏目内容的标题
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置栏目内容的标题
     *
     * @param title 栏目内容的标题
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * 获取评论内容
     *
     * @return content - 评论内容
     */
    public String getContent() {
        return content;
    }

    /**
     * 设置评论内容
     *
     * @param content 评论内容
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * 获取评论姓名
     *
     * @return name - 评论姓名
     */
    public String getName() {
        return name;
    }

    /**
     * 设置评论姓名
     *
     * @param name 评论姓名
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 获取评论IP
     *
     * @return ip - 评论IP
     */
    public String getIp() {
        return ip;
    }

    /**
     * 设置评论IP
     *
     * @param ip 评论IP
     */
    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    /**
     * 获取评论时间
     *
     * @return create_date - 评论时间
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * 设置评论时间
     *
     * @param createDate 评论时间
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 获取审核人
     *
     * @return audit_user_id - 审核人
     */
    public String getAuditUserId() {
        return auditUserId;
    }

    /**
     * 设置审核人
     *
     * @param auditUserId 审核人
     */
    public void setAuditUserId(String auditUserId) {
        this.auditUserId = auditUserId == null ? null : auditUserId.trim();
    }

    /**
     * 获取审核时间
     *
     * @return audit_date - 审核时间
     */
    public Date getAuditDate() {
        return auditDate;
    }

    /**
     * 设置审核时间
     *
     * @param auditDate 审核时间
     */
    public void setAuditDate(Date auditDate) {
        this.auditDate = auditDate;
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