package com.sparkdev.ofd.apis.repository;

import com.sparkdev.ofd.apis.entities.UserEntity;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserEntity, Integer> {
    UserEntity findByEmail(String email);
}
