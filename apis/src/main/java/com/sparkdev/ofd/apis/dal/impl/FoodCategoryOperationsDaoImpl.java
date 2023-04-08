package com.sparkdev.ofd.apis.dal.impl;

import com.sparkdev.ofd.apis.dal.FoodCategoryOperationsDao;
import com.sparkdev.ofd.apis.entities.FoodCategoryEntity;
import com.sparkdev.ofd.apis.repository.FoodCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class FoodCategoryOperationsDaoImpl implements FoodCategoryOperationsDao {

    @Autowired
    private FoodCategoryRepository foodCategoryRepository;
    @Override
    public FoodCategoryEntity saveCategory(FoodCategoryEntity foodCategoryEntity) {
        return foodCategoryRepository.save(foodCategoryEntity);
    }

    @Override
    public List<FoodCategoryEntity> fetchAllCategories() {
        List<FoodCategoryEntity> foodCategoryEntityList = new ArrayList<>();
        foodCategoryRepository.findAll().iterator().forEachRemaining(foodCategoryEntityList::add);
        return foodCategoryEntityList;
    }
}
