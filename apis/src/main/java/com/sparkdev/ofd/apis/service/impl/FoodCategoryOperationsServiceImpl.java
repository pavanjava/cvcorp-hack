package com.sparkdev.ofd.apis.service.impl;

import com.sparkdev.ofd.apis.dal.FoodCategoryOperationsDao;
import com.sparkdev.ofd.apis.entities.FoodCategoryEntity;
import com.sparkdev.ofd.apis.service.FoodCategoryOperationsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoodCategoryOperationsServiceImpl implements FoodCategoryOperationsService {

    @Autowired
    private FoodCategoryOperationsDao foodCategoryOperationsDao;
    @Override
    public FoodCategoryEntity saveCategory(FoodCategoryEntity foodCategoryEntity) {
        return foodCategoryOperationsDao.saveCategory(foodCategoryEntity);
    }

    @Override
    public List<FoodCategoryEntity> fetchAllCategories() {
        return foodCategoryOperationsDao.fetchAllCategories();
    }
}
