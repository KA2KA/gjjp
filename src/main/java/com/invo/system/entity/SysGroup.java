package com.invo.system.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.enums.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 用户角色表：用户表和角色表的中间表
 * </p>
 * @author wuwanggao@163.com123
 */
@TableName("sys_group")
public class SysGroup extends Model<SysGroup> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 角色ID
     */
    private Long roleid;
    /**
     * 用户ID
     */
    private Long userid;
    /**
     * 备注
     */
    private String remark;
    /**
     * 创建数据用户
     */
    @TableField("create_by")
    private String createBy;
    /**
     * 更新数据用户
     */
    @TableField("update_by")
    private String updateBy;
    /**
     * 创建数据时间
     */
    @TableField("create_date")
    private Date createDate;
    /**
     * 更新数据时间
     */
    @TableField("update_date")
    private Date updateDate;
    /**
     * 删除标记：0正常 1不正常
     */
    @TableField("del_flag")
    private Integer delFlag;
    /**
     * 数据版本
     */
    private Integer version;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getRoleid() {
        return roleid;
    }

    public void setRoleid(Long roleid) {
        this.roleid = roleid;
    }

    public Long getUserid() {
        return userid;
    }

    public void setUserid(Long userid) {
        this.userid = userid;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public Integer getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(Integer delFlag) {
        this.delFlag = delFlag;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "SysGroup{" +
        ", id=" + id +
        ", roleid=" + roleid +
        ", userid=" + userid +
        ", remark=" + remark +
        ", createBy=" + createBy +
        ", updateBy=" + updateBy +
        ", createDate=" + createDate +
        ", updateDate=" + updateDate +
        ", delFlag=" + delFlag +
        ", version=" + version +
        "}";
    }
}
