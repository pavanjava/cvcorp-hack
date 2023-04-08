package com.sparkdev.ofd.apis.dal;

import com.sparkdev.ofd.apis.entities.UserEntity;

import java.util.List;

public interface UserOperationsDao {
    UserEntity registerUser(UserEntity userEntity);
    List<UserEntity> fetchAllUsers();
    UserEntity findUserByEmail(String email);
}
