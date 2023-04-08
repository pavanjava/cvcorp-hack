package com.sparkdev.ofd.apis.dal.impl;

import com.sparkdev.ofd.apis.dal.UserOperationsDao;
import com.sparkdev.ofd.apis.entities.UserEntity;
import com.sparkdev.ofd.apis.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserOperationsDaoImpl implements UserOperationsDao {

    @Autowired
    private UserRepository userRepository;
    @Override
    public boolean registerUser(UserEntity userEntity) {
        UserEntity entity = userRepository.save(userEntity);
        return entity.getUserId() != 0;
    }
}
