package com.sparkdev.ofd.apis.service.impl;

import com.sparkdev.ofd.apis.dal.UserOperationsDao;
import com.sparkdev.ofd.apis.dto.LoginDTO;
import com.sparkdev.ofd.apis.entities.UserEntity;
import com.sparkdev.ofd.apis.service.UserOperationsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserOperationsServiceImpl implements UserOperationsService {

    @Autowired
    private UserOperationsDao userOperationsDao;
    @Override
    public UserEntity registerUser(UserEntity userEntity) {
        return userOperationsDao.registerUser(userEntity);
    }

    @Override
    public List<UserEntity> fetchAllUsers() {
        return userOperationsDao.fetchAllUsers();
    }

    @Override
    public boolean login(LoginDTO loginDTO) {
        return userOperationsDao.findUserByEmail(loginDTO.getEmail()).getPassword().equals(loginDTO.getPassword());
    }
}
