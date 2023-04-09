package com.sparkdev.ofd.apis.dal.impl;

import com.sparkdev.ofd.apis.dal.RestaurantDao;
import com.sparkdev.ofd.apis.entities.RestaurantEntity;
import com.sparkdev.ofd.apis.repository.RestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class RestaurantDaoImpl implements RestaurantDao {

    @Autowired
    private RestaurantRepository restaurantRepository;
    @Override
    public RestaurantEntity saveRestaurant(RestaurantEntity restaurantEntity) {
        return restaurantRepository.save(restaurantEntity);
    }

    @Override
    public List<RestaurantEntity> saveAllRestaurants(List<RestaurantEntity> restaurantEntities) {
        return restaurantRepository.saveAll(restaurantEntities);
    }

    @Override
    public List<RestaurantEntity> getAllRestaurants() {
        return restaurantRepository.findAll();
    }

    @Override
    public RestaurantEntity getRestaurantById(int restaurantId) {
        return restaurantRepository.findById(restaurantId).orElse(new RestaurantEntity());
    }
}
