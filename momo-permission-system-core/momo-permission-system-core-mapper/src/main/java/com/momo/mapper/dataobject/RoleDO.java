package com.momo.mapper.dataobject;

import java.util.Date;

/**
 * The table 角色
 */
public class RoleDO{

    /**
     * id 角色id.
     */
    private Long id;
    /**
     * groupId 第三方组 kagome-momo-open-source默认为1.
     */
    private Long groupId;
    /**
     * uuid 唯一，32位字符串，查询用.
     */
    private String uuid;
    /**
     * remark 备注.
     */
    private String remark;
    /**
     * createBy 创建人.
     */
    private String createBy;
    /**
     * updateBy update_by.
     */
    private String updateBy;
    /**
     * sysRoleName 角色名称.
     */
    private String sysRoleName;
    /**
     * flag 是否被禁用  0否 1禁用.
     */
    private Integer flag;
    /**
     * delFlag 删除状态(0-正常，1-删除).
     */
    private Integer delFlag;
    /**
     * sysRoleType 角色的类型，0：管理员(老板)，1：管理员(员工) 2其他.
     */
    private Integer sysRoleType;
    /**
     * createTime 创建时间.
     */
    private Date createTime;
    /**
     * updateTime 修改时间.
     */
    private Date updateTime;

    /**
     * Set id 角色id.
     */
    public void setId(Long id){
        this.id = id;
    }

    /**
     * Get id 角色id.
     *
     * @return the string
     */
    public Long getId(){
        return id;
    }

    /**
     * Set groupId 第三方组 kagome-momo-open-source默认为1.
     */
    public void setGroupId(Long groupId){
        this.groupId = groupId;
    }

    /**
     * Get groupId 第三方组 kagome-momo-open-source默认为1.
     *
     * @return the string
     */
    public Long getGroupId(){
        return groupId;
    }

    /**
     * Set uuid 唯一，32位字符串，查询用.
     */
    public void setUuid(String uuid){
        this.uuid = uuid;
    }

    /**
     * Get uuid 唯一，32位字符串，查询用.
     *
     * @return the string
     */
    public String getUuid(){
        return uuid;
    }

    /**
     * Set remark 备注.
     */
    public void setRemark(String remark){
        this.remark = remark;
    }

    /**
     * Get remark 备注.
     *
     * @return the string
     */
    public String getRemark(){
        return remark;
    }

    /**
     * Set createBy 创建人.
     */
    public void setCreateBy(String createBy){
        this.createBy = createBy;
    }

    /**
     * Get createBy 创建人.
     *
     * @return the string
     */
    public String getCreateBy(){
        return createBy;
    }

    /**
     * Set updateBy update_by.
     */
    public void setUpdateBy(String updateBy){
        this.updateBy = updateBy;
    }

    /**
     * Get updateBy update_by.
     *
     * @return the string
     */
    public String getUpdateBy(){
        return updateBy;
    }

    /**
     * Set sysRoleName 角色名称.
     */
    public void setSysRoleName(String sysRoleName){
        this.sysRoleName = sysRoleName;
    }

    /**
     * Get sysRoleName 角色名称.
     *
     * @return the string
     */
    public String getSysRoleName(){
        return sysRoleName;
    }

    /**
     * Set flag 是否被禁用  0否 1禁用.
     */
    public void setFlag(Integer flag){
        this.flag = flag;
    }

    /**
     * Get flag 是否被禁用  0否 1禁用.
     *
     * @return the string
     */
    public Integer getFlag(){
        return flag;
    }

    /**
     * Set delFlag 删除状态(0-正常，1-删除).
     */
    public void setDelFlag(Integer delFlag){
        this.delFlag = delFlag;
    }

    /**
     * Get delFlag 删除状态(0-正常，1-删除).
     *
     * @return the string
     */
    public Integer getDelFlag(){
        return delFlag;
    }

    /**
     * Set sysRoleType 角色的类型，0：管理员(老板)，1：管理员(员工) 2其他.
     */
    public void setSysRoleType(Integer sysRoleType){
        this.sysRoleType = sysRoleType;
    }

    /**
     * Get sysRoleType 角色的类型，0：管理员(老板)，1：管理员(员工) 2其他.
     *
     * @return the string
     */
    public Integer getSysRoleType(){
        return sysRoleType;
    }

    /**
     * Set createTime 创建时间.
     */
    public void setCreateTime(Date createTime){
        this.createTime = createTime;
    }

    /**
     * Get createTime 创建时间.
     *
     * @return the string
     */
    public Date getCreateTime(){
        return createTime;
    }

    /**
     * Set updateTime 修改时间.
     */
    public void setUpdateTime(Date updateTime){
        this.updateTime = updateTime;
    }

    /**
     * Get updateTime 修改时间.
     *
     * @return the string
     */
    public Date getUpdateTime(){
        return updateTime;
    }
}
