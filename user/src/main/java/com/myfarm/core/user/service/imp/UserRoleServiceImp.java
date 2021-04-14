package com.myfarm.core.user.service.imp;

import com.myfarm.core.user.dto.UserRoleDTO;
import com.myfarm.core.user.exception.UserRoleException;
import com.myfarm.core.user.service.UserRoleService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserRoleServiceImp implements UserRoleService {
    @Override
    public List<UserRoleDTO> getAllRoles() throws UserRoleException {
        return null;
    }

    @Override
    public UserRoleDTO getUserRoleById(String roleId) throws UserRoleException {
        return null;
    }

    @Override
    public UserRoleDTO addRole(String role) throws UserRoleException {
        return null;
    }

    @Override
    public void deleteRole(String roleId) throws UserRoleException {

    }
}
