package com.sparkdev.ofd.apis.controller;

import com.sparkdev.ofd.apis.dto.FoodDTO;
import com.sparkdev.ofd.apis.entities.FoodEntity;
import com.sparkdev.ofd.apis.util.DtoToEntityMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class FoodController {

    @PostMapping("/food")
    public ResponseEntity<FoodEntity> saveFood(@RequestBody FoodDTO foodDTO){
        FoodEntity foodEntity = DtoToEntityMapper.getFoodEntityFromFoodDto(foodDTO);
        return ResponseEntity.ok().body(foodEntity);
    }
}
