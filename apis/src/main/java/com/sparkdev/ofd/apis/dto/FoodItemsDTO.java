package com.sparkdev.ofd.apis.dto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class FoodItemsDTO {
    private String foodName;
    private String description;
    private float price;
    private int categoryId;
    private int restaurantId;
}
