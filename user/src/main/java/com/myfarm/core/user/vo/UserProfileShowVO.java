package com.myfarm.core.user.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel
public class UserProfileShowVO {
    @ApiModelProperty(value = "用户ID。符合UUID格式。参考：http://www.uuid.online", example = "d9a4d5d5-0c9a-4508-952c-091851285a54")
    private String userId;

    @ApiModelProperty(value = "用户名称。用户名规则：4到16位（字母，数字，下划线，减号）。正则表达式：^[a-zA-Z0-9_-]{4,16}$", example = "John_9527-test")
    private String name;

    @ApiModelProperty(value = "密码。密码规则：最少6位，包括至少1个大写字母，1个小写字母，1个数字，1个特殊字符。正则表达式：^.*(?=.{6,})(?=.*\\d)(?=.*[A-Z])(?=.*[a-z])(?=.*[!@#$%^&*? ]).*$", example = "NiC$4603")
    private String psw;


    @ApiModelProperty(value = "电话。支持电信、移动、联通等运营商，详情见：https://blog.csdn.net/gxzhaha/article/details/108115777。正则表达式：^1([358][0-9]|4[579]|66|7[0135678]|9[89])[0-9]{8}$", example = "15824657732")
    private String telPhone;

    @ApiModelProperty(value = "头像", example = "www.baidu.com/John_9527-test.jpg")
    private String profile;

    @ApiModelProperty(value = "角色ID", example = "68f9cca6-642c-4a2c-a37f-ab16124b81df")
    private String roleId;

    @ApiModelProperty(value = "角色。角色规则：3-10位大小写字母组成符合。正则表达式：^[a-zA-Z]{3,10}$", example = "admin")
    private String roleName;

    @ApiModelProperty(value = "工号。0-2147483647", example = "8")
    private Integer employeeId;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPsw() {
        return psw;
    }

    public void setPsw(String psw) {
        this.psw = psw;
    }

    public String getTelPhone() {
        return telPhone;
    }

    public void setTelPhone(String telPhone) {
        this.telPhone = telPhone;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }
}
