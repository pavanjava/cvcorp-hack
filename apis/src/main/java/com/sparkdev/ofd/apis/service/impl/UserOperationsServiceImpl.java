package com.sparkdev.ofd.apis.service.impl;

import com.sparkdev.ofd.apis.dal.UserOperationsDao;
import com.sparkdev.ofd.apis.entities.UserEntity;
import com.sparkdev.ofd.apis.service.UserOperationsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserOperationsServiceImpl implements UserOperationsService {

    @Autowired
    private UserOperationsDao userOperationsDao;
    @Override
    public boolean registerUser(UserEntity userEntity) {
        return userOperationsDao.registerUser(userEntity);
    }
}
