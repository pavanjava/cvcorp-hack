package com.sparkdev.ofd.apis.service;

import com.sparkdev.ofd.apis.entities.RestaurantEntity;

import java.util.List;

public interface RestaurantService {
    RestaurantEntity saveRestaurant(RestaurantEntity restaurantEntity);
    List<RestaurantEntity> saveAllRestaurants(List<RestaurantEntity> restaurantEntities);
    List<RestaurantEntity> getAllRestaurants();
    RestaurantEntity getRestaurantById(int restaurantId);
}
