package com.sparkdev.ofd.apis.dal;

import com.sparkdev.ofd.apis.entities.UserEntity;

public interface UserOperationsDao {
    boolean registerUser(UserEntity userEntity);
}
