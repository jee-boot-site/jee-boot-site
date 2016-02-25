package com.boot.sys.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "sys_role")
public class SysRole {
    /**
     * 编号
     */
    @Id
    private String id;

    /**
     * 归属机构
     */
    @Column(name = "office_id")
    private String officeId;

    /**
     * 角色名称
     */
    private String name;

    /**
     * 英文名称
     */
    private String enname;

    /**
     * 角色类型
     */
    @Column(name = "role_type")
    private String roleType;

    /**
     * 数据范围
     */
    @Column(name = "data_scope")
    private String dataScope;

    /**
     * 是否系统数据
     */
    @Column(name = "is_sys")
    private String isSys;

    /**
     * 是否可用
     */
    private String useable;

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
     * 获取角色名称
     *
     * @return name - 角色名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置角色名称
     *
     * @param name 角色名称
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 获取英文名称
     *
     * @return enname - 英文名称
     */
    public String getEnname() {
        return enname;
    }

    /**
     * 设置英文名称
     *
     * @param enname 英文名称
     */
    public void setEnname(String enname) {
        this.enname = enname == null ? null : enname.trim();
    }

    /**
     * 获取角色类型
     *
     * @return role_type - 角色类型
     */
    public String getRoleType() {
        return roleType;
    }

    /**
     * 设置角色类型
     *
     * @param roleType 角色类型
     */
    public void setRoleType(String roleType) {
        this.roleType = roleType == null ? null : roleType.trim();
    }

    /**
     * 获取数据范围
     *
     * @return data_scope - 数据范围
     */
    public String getDataScope() {
        return dataScope;
    }

    /**
     * 设置数据范围
     *
     * @param dataScope 数据范围
     */
    public void setDataScope(String dataScope) {
        this.dataScope = dataScope == null ? null : dataScope.trim();
    }

    /**
     * 获取是否系统数据
     *
     * @return is_sys - 是否系统数据
     */
    public String getIsSys() {
        return isSys;
    }

    /**
     * 设置是否系统数据
     *
     * @param isSys 是否系统数据
     */
    public void setIsSys(String isSys) {
        this.isSys = isSys == null ? null : isSys.trim();
    }

    /**
     * 获取是否可用
     *
     * @return useable - 是否可用
     */
    public String getUseable() {
        return useable;
    }

    /**
     * 设置是否可用
     *
     * @param useable 是否可用
     */
    public void setUseable(String useable) {
        this.useable = useable == null ? null : useable.trim();
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