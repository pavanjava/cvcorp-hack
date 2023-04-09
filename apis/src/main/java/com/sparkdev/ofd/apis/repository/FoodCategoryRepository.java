package com.sparkdev.ofd.apis.repository;

import com.sparkdev.ofd.apis.entities.FoodCategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodCategoryRepository extends JpaRepository<FoodCategoryEntity, Integer> {
}
