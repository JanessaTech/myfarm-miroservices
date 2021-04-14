package com.myfarm.core.user.service;

import com.github.pagehelper.PageInfo;
import com.myfarm.core.user.dto.UserProfileDTO;
import com.myfarm.core.user.exception.UserProfileException;
import com.myfarm.core.user.vo.query.UserProfileSpec;

import java.util.List;

public interface UserProfileService {
    PageInfo<UserProfileDTO> getUserProfilesBySpec(UserProfileSpec userProfileSpec, int page, int pageSize) throws UserProfileException;
    UserProfileDTO getUserProfileById(String userId) throws UserProfileException;
    /** Used by login. this method is only used internally **/
    UserProfileDTO getUserProfileByTelPhone(String telPhone) throws UserProfileException;
    void addUserProfile(UserProfileDTO userProfileDto) throws UserProfileException;
    void updateUserProfile(UserProfileDTO userProfileDto) throws UserProfileException;
    void deleteUserProfileByIds(List<String> userIds)  throws UserProfileException;
    void setSite(String userId, String siteId) throws UserProfileException;
    void getVerificationCode(String telPhone) throws UserProfileException;
}
