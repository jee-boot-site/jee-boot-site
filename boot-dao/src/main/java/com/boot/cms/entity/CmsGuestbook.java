package com.boot.cms.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "cms_guestbook")
public class CmsGuestbook {
    /**
     * 编号
     */
    @Id
    private String id;

    /**
     * 留言分类
     */
    private String type;

    /**
     * 留言内容
     */
    private String content;

    /**
     * 姓名
     */
    private String name;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 电话
     */
    private String phone;

    /**
     * 单位
     */
    private String workunit;

    /**
     * IP
     */
    private String ip;

    /**
     * 留言时间
     */
    @Column(name = "create_date")
    private Date createDate;

    /**
     * 回复人
     */
    @Column(name = "re_user_id")
    private String reUserId;

    /**
     * 回复时间
     */
    @Column(name = "re_date")
    private Date reDate;

    /**
     * 回复内容
     */
    @Column(name = "re_content")
    private String reContent;

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
     * 获取留言分类
     *
     * @return type - 留言分类
     */
    public String getType() {
        return type;
    }

    /**
     * 设置留言分类
     *
     * @param type 留言分类
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    /**
     * 获取留言内容
     *
     * @return content - 留言内容
     */
    public String getContent() {
        return content;
    }

    /**
     * 设置留言内容
     *
     * @param content 留言内容
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * 获取姓名
     *
     * @return name - 姓名
     */
    public String getName() {
        return name;
    }

    /**
     * 设置姓名
     *
     * @param name 姓名
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 获取邮箱
     *
     * @return email - 邮箱
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置邮箱
     *
     * @param email 邮箱
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * 获取电话
     *
     * @return phone - 电话
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置电话
     *
     * @param phone 电话
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * 获取单位
     *
     * @return workunit - 单位
     */
    public String getWorkunit() {
        return workunit;
    }

    /**
     * 设置单位
     *
     * @param workunit 单位
     */
    public void setWorkunit(String workunit) {
        this.workunit = workunit == null ? null : workunit.trim();
    }

    /**
     * 获取IP
     *
     * @return ip - IP
     */
    public String getIp() {
        return ip;
    }

    /**
     * 设置IP
     *
     * @param ip IP
     */
    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    /**
     * 获取留言时间
     *
     * @return create_date - 留言时间
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * 设置留言时间
     *
     * @param createDate 留言时间
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 获取回复人
     *
     * @return re_user_id - 回复人
     */
    public String getReUserId() {
        return reUserId;
    }

    /**
     * 设置回复人
     *
     * @param reUserId 回复人
     */
    public void setReUserId(String reUserId) {
        this.reUserId = reUserId == null ? null : reUserId.trim();
    }

    /**
     * 获取回复时间
     *
     * @return re_date - 回复时间
     */
    public Date getReDate() {
        return reDate;
    }

    /**
     * 设置回复时间
     *
     * @param reDate 回复时间
     */
    public void setReDate(Date reDate) {
        this.reDate = reDate;
    }

    /**
     * 获取回复内容
     *
     * @return re_content - 回复内容
     */
    public String getReContent() {
        return reContent;
    }

    /**
     * 设置回复内容
     *
     * @param reContent 回复内容
     */
    public void setReContent(String reContent) {
        this.reContent = reContent == null ? null : reContent.trim();
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