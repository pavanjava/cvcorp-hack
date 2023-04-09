package com.sparkdev.ofd.apis.dal;

import com.sparkdev.ofd.apis.entities.RestaurantEntity;

import java.util.List;

public interface RestaurantDao {
    RestaurantEntity saveRestaurant(RestaurantEntity restaurantEntity);
    List<RestaurantEntity> saveAllRestaurants(List<RestaurantEntity> restaurantEntities);
    List<RestaurantEntity> getAllRestaurants();
    RestaurantEntity getRestaurantById(int restaurantId);
}
