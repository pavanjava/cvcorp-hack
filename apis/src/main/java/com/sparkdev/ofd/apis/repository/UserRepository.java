package com.sparkdev.ofd.apis.repository;

import com.sparkdev.ofd.apis.entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Integer> {
    UserEntity findByEmail(String email);
}
