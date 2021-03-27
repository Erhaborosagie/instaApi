package com.osagie.instaApi.dto;

import com.osagie.instaApi.entities.User;
import com.sun.istack.internal.NotNull;

import javax.persistence.Column;

/**
 * Created by OSAGIE on 3/26/2021
 */
public class UserDto {
//    @NotNull
//    private String userId;

    @NotNull
    private String userName;

    @NotNull
    private String name;

    @NotNull
    private String profileImage;

    public User toUser(){
        User user = new User();
        user.setName(name);
        user.setProfileImage(profileImage);
        user.setUserName(userName);

        return user;
    }
}
