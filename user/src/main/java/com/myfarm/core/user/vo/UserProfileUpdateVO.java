package com.myfarm.core.user.vo;

import com.farm.common.validation.UUIDValueValidator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@ApiModel
public class UserProfileUpdateVO {
    @ApiModelProperty(value = "用户ID。符合UUID格式。参考：http://www.uuid.online", required = true, example = "d9a4d5d5-0c9a-4508-952c-091851285a54")
    @NotNull(message = "userId不能为null")
    @NotEmpty(message = "userId不能为空值")
    @UUIDValueValidator(message = "不是有效的UUID格式。参考：http://www.uuid.online/")
    private String userId;

    @ApiModelProperty(value = "用户名称。用户名规则：4到16位（字母，数字，下划线，减号）。正则表达式：^[a-zA-Z0-9_-]{4,16}$", required = true, example = "John_9527-test")
    @NotNull(message = "用户名称不能为null")
    @NotEmpty(message = "用户名称不能为空值")
    @Pattern(regexp = "^[a-zA-Z0-9_-]{4,16}$", message = "用户名只能包含字母，数字，下划线，减号，且长度在4-16之间")
    private String name;

    @ApiModelProperty(value = "密码。密码规则：最少6位，包括至少1个大写字母，1个小写字母，1个数字，1个特殊字符。正则表达式：^.*(?=.{6,})(?=.*\\d)(?=.*[A-Z])(?=.*[a-z])(?=.*[!@#$%^&*? ]).*$", required = true, example = "NiC$4603")
    @NotNull(message = "密码不能为null")
    @NotEmpty(message = "密码不能为空值")
    @Pattern(regexp = "^.*(?=.{6,})(?=.*\\d)(?=.*[A-Z])(?=.*[a-z])(?=.*[!@#$%^&*? ]).*$", message = "密码含有无效字符")
    private String psw;


    @ApiModelProperty(value = "电话。支持电信、移动、联通等运营商，详情见：https://blog.csdn.net/gxzhaha/article/details/108115777。正则表达式：^1([358][0-9]|4[579]|66|7[0135678]|9[89])[0-9]{8}$", required = true, example = "15824657732")
    @NotNull(message = "电话不能为null")
    @NotEmpty(message = "电话不能为空值")
    @Pattern(regexp = "^1([358][0-9]|4[579]|66|7[0135678]|9[89])[0-9]{8}$", message = "电话号码格式不正确")
    private String telPhone;

    @ApiModelProperty(value = "头像", example = "www.baidu.com/John_9527-test.jpg")
    private String profile;

    @ApiModelProperty(value = "角色ID", required = true, example = "68f9cca6-642c-4a2c-a37f-ab16124b81df")
    @NotNull(message = "roleId不能为null")
    @NotEmpty(message = "roleId不能为空值")
    @UUIDValueValidator(message = "不是有效的UUID格式。参考：http://www.uuid.online/")
    private String roleId;

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
}
