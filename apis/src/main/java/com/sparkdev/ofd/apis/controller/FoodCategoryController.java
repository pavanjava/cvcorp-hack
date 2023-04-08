package com.sparkdev.ofd.apis.controller;

import com.sparkdev.ofd.apis.dto.FoodCategoryDTO;
import com.sparkdev.ofd.apis.entities.FoodCategoryEntity;
import com.sparkdev.ofd.apis.service.FoodCategoryOperationsService;
import com.sparkdev.ofd.apis.util.DtoToEntityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class FoodCategoryController extends GlobalExceptionHandler{

    @Autowired
    private FoodCategoryOperationsService foodCategoryOperationsService;

    @PostMapping("/food-category")
    public ResponseEntity<FoodCategoryEntity> saveFoodCategory(@RequestBody FoodCategoryDTO foodCategoryDTO) {

        FoodCategoryEntity foodCategoryEntity = foodCategoryOperationsService.saveCategory(
                DtoToEntityMapper.getFoodCategoryEntityFromFoodCategoryDto(foodCategoryDTO));

        return ResponseEntity.ok().body(foodCategoryEntity);
    }

    @GetMapping("/food-category")
    public ResponseEntity<List<FoodCategoryEntity>> fetchAllFoodCategories(){
        return ResponseEntity.ok().body(foodCategoryOperationsService.fetchAllCategories());
    }
}
