package com.sparkdev.ofd.apis.dal;

import com.sparkdev.ofd.apis.entities.FoodCategoryEntity;

import java.util.List;

public interface FoodCategoryOperationsDao {
    FoodCategoryEntity saveCategory(FoodCategoryEntity foodCategoryEntity);
    List<FoodCategoryEntity> fetchAllCategories();
}
