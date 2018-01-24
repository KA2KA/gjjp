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
 * 菜单表：用来添加菜单
 * </p>
 *
 * @author wuwanggao@163.com123
 * @since 2018-01-24
 */
@TableName("sys_menu")
public class SysMenu extends Model<SysMenu> {

    private static final long serialVersionUID = 1L;

    /**
     * 菜单ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 菜单名称
     */
    private String name;
    /**
     * WildcardPermission
     */
    private String perm;
    /**
     * 菜单url
     */
    private String url;
    /**
     * 菜单url
     */
    private String action;
    /**
     * 菜单图标
     */
    private String iconcls;
    /**
     * 级别
     */
    private Integer grade;
    /**
     * 菜单状态
     */
    private Integer state;
    /**
     * 叶子节点
     */
    private Integer isleaf;
    /**
     * 父菜单ID
     */
    private Integer parentid;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPerm() {
        return perm;
    }

    public void setPerm(String perm) {
        this.perm = perm;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getIconcls() {
        return iconcls;
    }

    public void setIconcls(String iconcls) {
        this.iconcls = iconcls;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getIsleaf() {
        return isleaf;
    }

    public void setIsleaf(Integer isleaf) {
        this.isleaf = isleaf;
    }

    public Integer getParentid() {
        return parentid;
    }

    public void setParentid(Integer parentid) {
        this.parentid = parentid;
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
        return "SysMenu{" +
        ", id=" + id +
        ", name=" + name +
        ", perm=" + perm +
        ", url=" + url +
        ", action=" + action +
        ", iconcls=" + iconcls +
        ", grade=" + grade +
        ", state=" + state +
        ", isleaf=" + isleaf +
        ", parentid=" + parentid +
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
