package com.sparkdev.ofd.apis.service;

import com.sparkdev.ofd.apis.dto.LoginDTO;
import com.sparkdev.ofd.apis.entities.UserEntity;

import java.util.List;

public interface UserOperationsService {
    UserEntity registerUser(UserEntity userEntity);
    List<UserEntity> fetchAllUsers();
    boolean login(LoginDTO loginDTO);
}
