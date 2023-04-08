package com.sparkdev.ofd.apis.repository;

import com.sparkdev.ofd.apis.entities.FoodCategoryEntity;
import org.springframework.data.repository.CrudRepository;

public interface FoodCategoryRepository extends CrudRepository<FoodCategoryEntity, Integer> {
}
