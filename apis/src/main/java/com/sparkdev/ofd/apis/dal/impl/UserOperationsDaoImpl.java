package com.sparkdev.ofd.apis.dal.impl;

import com.sparkdev.ofd.apis.dal.UserOperationsDao;
import com.sparkdev.ofd.apis.entities.UserEntity;
import com.sparkdev.ofd.apis.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserOperationsDaoImpl implements UserOperationsDao {

    @Autowired
    private UserRepository userRepository;
    @Override
    public UserEntity registerUser(UserEntity userEntity) {
        return userRepository.save(userEntity);
    }

    @Override
    public List<UserEntity> fetchAllUsers() {
        List<UserEntity> userEntities = new ArrayList<>();
        userRepository.findAll().iterator().forEachRemaining(userEntities::add);
        return userEntities;
    }

    @Override
    public UserEntity findUserByEmail(String email) {
        return userRepository.findByEmail(email);
    }
}
