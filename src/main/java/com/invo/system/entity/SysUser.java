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
 * 用户表
 * </p>
 *
 * @author wuwanggao@163.com123
 * @since 2018-01-23
 */
@TableName("sys_user")
public class SysUser extends Model<SysUser> {

    private static final long serialVersionUID = 1L;

    /**
     * 用户ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 用户名
     */
    private String username;
    /**
     * 用户类型
     */
    private Integer usertype;
    /**
     * 用户密码
     */
    private String password;
    /**
     * 昵称
     */
    private String nickname;
    /**
     * 性别
     */
    private Integer sex;
    /**
     * 手机号
     */
    private Integer phone;
    /**
     * 邮箱
     */
    private String email;
    /**
     * 用户头像
     */
    private String alias;
    /**
     * 最近登陆地址
     */
    @TableField("login_address")
    private String loginAddress;
    /**
     * 最近登陆时间
     */
    @TableField("login_date")
    private Date loginDate;
    /**
     * 登陆IP
     */
    private String ip;
    /**
     * 用户状态
     */
    private Integer state;
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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getUsertype() {
        return usertype;
    }

    public void setUsertype(Integer usertype) {
        this.usertype = usertype;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getLoginAddress() {
        return loginAddress;
    }

    public void setLoginAddress(String loginAddress) {
        this.loginAddress = loginAddress;
    }

    public Date getLoginDate() {
        return loginDate;
    }

    public void setLoginDate(Date loginDate) {
        this.loginDate = loginDate;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
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
        return "SysUser{" +
        ", id=" + id +
        ", username=" + username +
        ", usertype=" + usertype +
        ", password=" + password +
        ", nickname=" + nickname +
        ", sex=" + sex +
        ", phone=" + phone +
        ", email=" + email +
        ", alias=" + alias +
        ", loginAddress=" + loginAddress +
        ", loginDate=" + loginDate +
        ", ip=" + ip +
        ", state=" + state +
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
