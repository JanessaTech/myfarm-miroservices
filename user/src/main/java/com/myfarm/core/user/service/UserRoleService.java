package com.myfarm.core.user.service;

import com.myfarm.core.user.dto.UserRoleDTO;
import com.myfarm.core.user.exception.UserRoleException;

import java.util.List;

public interface UserRoleService {
    /**
     * return all user roles
     * by default, sort result by role_id in ascending order
     * @return
     */
    List<UserRoleDTO> getAllRoles() throws UserRoleException;
    UserRoleDTO getUserRoleById(String roleId) throws UserRoleException;
    UserRoleDTO addRole(String role) throws UserRoleException;
    void deleteRole(String roleId) throws UserRoleException;
}
