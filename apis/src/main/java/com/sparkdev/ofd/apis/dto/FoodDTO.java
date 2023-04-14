package com.sparkdev.ofd.apis.dto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class FoodDTO {
    private String foodName;
    private String description;
    private float price;
    private FoodCategoryDTO foodCategoryDTO;
    private RestaurantDTO restaurantDTO;
}
