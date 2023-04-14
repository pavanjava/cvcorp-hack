package com.sparkdev.ofd.apis.util;

import com.sparkdev.ofd.apis.dto.FoodCategoryDTO;
import com.sparkdev.ofd.apis.dto.FoodDTO;
import com.sparkdev.ofd.apis.dto.RestaurantDTO;
import com.sparkdev.ofd.apis.dto.UserDTO;
import com.sparkdev.ofd.apis.entities.FoodCategoryEntity;
import com.sparkdev.ofd.apis.entities.FoodEntity;
import com.sparkdev.ofd.apis.entities.RestaurantEntity;
import com.sparkdev.ofd.apis.entities.UserEntity;
import org.modelmapper.ModelMapper;
import org.modelmapper.PropertyMap;
import org.modelmapper.TypeMap;

import java.util.List;

public class DtoToEntityMapper {
    public static UserEntity getUserEntityFromUserDto(UserDTO userDTO) {
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(userDTO, UserEntity.class);
    }

    public static FoodCategoryEntity getFoodCategoryEntityFromFoodCategoryDto(FoodCategoryDTO foodCategoryDTO) {
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(foodCategoryDTO, FoodCategoryEntity.class);
    }

    public static List<FoodCategoryEntity> getFoodCategoryEntityFromFoodCategoryDto(List<FoodCategoryDTO> foodCategoryDTOS) {
        ModelMapper modelMapper = new ModelMapper();
        return foodCategoryDTOS.stream().map(foodCategoryDTO -> modelMapper.map(foodCategoryDTO, FoodCategoryEntity.class)).toList();
    }

    public static RestaurantEntity getRestaurantEntityFromRestaurantDto(RestaurantDTO restaurantDTO) {
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(restaurantDTO, RestaurantEntity.class);
    }

    public static List<RestaurantEntity> getRestaurantEntityFromRestaurantDto(List<RestaurantDTO> restaurantDTO) {
        ModelMapper modelMapper = new ModelMapper();
        return restaurantDTO.stream().map(restaurant -> modelMapper.map(restaurant, RestaurantEntity.class)).toList();
    }

    public static FoodEntity getFoodEntityFromFoodDto(FoodDTO foodDTO) {
        ModelMapper modelMapper = new ModelMapper();
        // FoodCategoryEntity foodCategoryEntity = getFoodCategoryEntityFromFoodCategoryDto(foodDTO.getFoodCategoryDTO());
        // RestaurantEntity restaurantEntity = getRestaurantEntityFromRestaurantDto(foodDTO.getRestaurantDTO());
        // foodEntity.setFoodCategoryEntity(foodCategoryEntity);
        // foodEntity.setRestaurantEntity(restaurantEntity);
        return modelMapper.map(foodDTO, FoodEntity.class);
    }
}
