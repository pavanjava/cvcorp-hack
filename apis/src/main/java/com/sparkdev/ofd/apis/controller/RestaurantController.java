package com.sparkdev.ofd.apis.controller;

import com.sparkdev.ofd.apis.dto.RestaurantDTO;
import com.sparkdev.ofd.apis.entities.RestaurantEntity;
import com.sparkdev.ofd.apis.service.RestaurantService;
import com.sparkdev.ofd.apis.util.DtoToEntityMapper;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class RestaurantController extends GlobalExceptionHandler{

    @Autowired
    private RestaurantService restaurantService;

    @PostMapping("/restaurant")
    public ResponseEntity<RestaurantEntity> saveRestaurant(@RequestBody RestaurantDTO restaurantDTO){
        RestaurantEntity restaurantEntity = DtoToEntityMapper.getRestaurantEntityFromRestaurantDto(restaurantDTO);
        return ResponseEntity.ok().body(restaurantService.saveRestaurant(restaurantEntity));
    }

    @PostMapping("/restaurants")
    public ResponseEntity<List<RestaurantEntity>> saveAllRestaurants(@RequestBody List<RestaurantDTO> restaurantDTOS){
        List<RestaurantEntity> restaurantEntities = DtoToEntityMapper.getRestaurantEntityFromRestaurantDto(restaurantDTOS);
        return ResponseEntity.ok().body(restaurantService.saveAllRestaurants(restaurantEntities));
    }

    @GetMapping("/restaurants")
    public ResponseEntity<List<RestaurantEntity>> getAllRestaurants(){
        return ResponseEntity.ok().body(restaurantService.getAllRestaurants());
    }

    @GetMapping("/restaurant/{id}")
    public ResponseEntity<RestaurantEntity> getRestaurantById(@PathVariable("id") Integer id){
        return ResponseEntity.ok().body(restaurantService.getRestaurantById(id));
    }

}
