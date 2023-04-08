package com.sparkdev.ofd.apis.service;

import com.sparkdev.ofd.apis.entities.UserEntity;

public interface UserOperationsService {
    boolean registerUser(UserEntity userEntity);
}
