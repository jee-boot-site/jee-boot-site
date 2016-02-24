package com.boot.sys.model;

import javax.persistence.*;

@Table(name = "sys_role_office")
public class SysRoleOffice {
    /**
     * 角色编号
     */
    @Id
    @Column(name = "role_id")
    private String roleId;

    /**
     * 机构编号
     */
    @Id
    @Column(name = "office_id")
    private String officeId;

    /**
     * 获取角色编号
     *
     * @return role_id - 角色编号
     */
    public String getRoleId() {
        return roleId;
    }

    /**
     * 设置角色编号
     *
     * @param roleId 角色编号
     */
    public void setRoleId(String roleId) {
        this.roleId = roleId == null ? null : roleId.trim();
    }

    /**
     * 获取机构编号
     *
     * @return office_id - 机构编号
     */
    public String getOfficeId() {
        return officeId;
    }

    /**
     * 设置机构编号
     *
     * @param officeId 机构编号
     */
    public void setOfficeId(String officeId) {
        this.officeId = officeId == null ? null : officeId.trim();
    }
}