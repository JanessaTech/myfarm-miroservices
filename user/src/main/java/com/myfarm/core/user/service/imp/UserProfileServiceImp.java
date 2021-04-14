package com.myfarm.core.user.service.imp;

import com.github.pagehelper.PageInfo;
import com.myfarm.core.user.dto.UserProfileDTO;
import com.myfarm.core.user.exception.UserProfileException;
import com.myfarm.core.user.service.UserProfileService;
import com.myfarm.core.user.vo.query.UserProfileSpec;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserProfileServiceImp implements UserProfileService {
    @Override
    public PageInfo<UserProfileDTO> getUserProfilesBySpec(UserProfileSpec userProfileSpec, int page, int pageSize) throws UserProfileException {
        return null;
    }

    @Override
    public UserProfileDTO getUserProfileById(String userId) throws UserProfileException {
        return null;
    }

    @Override
    public UserProfileDTO getUserProfileByTelPhone(String telPhone) throws UserProfileException {
        return null;
    }

    @Override
    public void addUserProfile(UserProfileDTO userProfileDto) throws UserProfileException {

    }

    @Override
    public void updateUserProfile(UserProfileDTO userProfileDto) throws UserProfileException {

    }

    @Override
    public void deleteUserProfileByIds(List<String> userIds) throws UserProfileException {

    }

    @Override
    public void setSite(String userId, String siteId) throws UserProfileException {

    }

    @Override
    public void getVerificationCode(String telPhone) throws UserProfileException {

    }
}
