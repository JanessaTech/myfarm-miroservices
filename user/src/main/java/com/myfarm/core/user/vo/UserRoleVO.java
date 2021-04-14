package com.myfarm.core.user.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel
public class UserRoleVO {
    @ApiModelProperty(value = "角色ID. 符合UUID格式。参考：http://www.uuid.online", example = "17802761-c475-46c4-98dc-210b1994c7cd")
    private String roleId;

    @ApiModelProperty(value = "角色。角色规则：3-10位大小写字母组成符合。正则表达式：^[a-zA-Z]{3,10}$", example = "admin")
    private String roleName;

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
}
