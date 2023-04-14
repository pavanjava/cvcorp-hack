package com.sparkdev.ofd.apis.service;

import com.sparkdev.ofd.apis.entities.FoodCategoryEntity;

import java.util.List;

public interface FoodCategoryOperationsService {
    FoodCategoryEntity saveCategory(FoodCategoryEntity foodCategoryEntity);
    List<FoodCategoryEntity> saveAllCategories(List<FoodCategoryEntity> foodCategoryEntities);
    List<FoodCategoryEntity> fetchAllCategories();
}
