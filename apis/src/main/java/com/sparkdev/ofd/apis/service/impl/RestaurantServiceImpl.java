package com.sparkdev.ofd.apis.service.impl;

import com.sparkdev.ofd.apis.dal.RestaurantDao;
import com.sparkdev.ofd.apis.entities.RestaurantEntity;
import com.sparkdev.ofd.apis.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RestaurantServiceImpl implements RestaurantService {

    @Autowired
    private RestaurantDao restaurantDao;

    @Override
    public RestaurantEntity saveRestaurant(RestaurantEntity restaurantEntity) {
        return restaurantDao.saveRestaurant(restaurantEntity);
    }

    @Override
    public List<RestaurantEntity> saveAllRestaurants(List<RestaurantEntity> restaurantEntities) {
        return restaurantDao.saveAllRestaurants(restaurantEntities);
    }

    @Override
    public List<RestaurantEntity> getAllRestaurants() {
        return restaurantDao.getAllRestaurants();
    }

    @Override
    public RestaurantEntity getRestaurantById(int restaurantId) {
        return restaurantDao.getRestaurantById(restaurantId);
    }
}
