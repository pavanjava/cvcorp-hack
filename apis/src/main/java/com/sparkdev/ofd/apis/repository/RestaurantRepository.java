package com.sparkdev.ofd.apis.repository;

import com.sparkdev.ofd.apis.entities.RestaurantEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RestaurantRepository extends JpaRepository<RestaurantEntity, Integer> {
}
