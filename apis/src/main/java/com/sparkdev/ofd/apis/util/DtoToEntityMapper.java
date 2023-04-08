package com.sparkdev.ofd.apis.util;

import com.sparkdev.ofd.apis.dto.FoodCategoryDTO;
import com.sparkdev.ofd.apis.dto.UserDTO;
import com.sparkdev.ofd.apis.entities.FoodCategoryEntity;
import com.sparkdev.ofd.apis.entities.UserEntity;
import org.modelmapper.ModelMapper;

public class DtoToEntityMapper {
    public static UserEntity getUserEntityFromUserDto(UserDTO userDTO){
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(userDTO, UserEntity.class);
    }

    public static FoodCategoryEntity getFoodCategoryEntityFromFoodCategoryDto(FoodCategoryDTO foodCategoryDTO){
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(foodCategoryDTO, FoodCategoryEntity.class);
    }
}
