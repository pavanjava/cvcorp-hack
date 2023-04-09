package com.sparkdev.ofd.apis.dto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class RestaurantDTO {
    private String restaurantName;
    private String phone;
    private String address;
    private String email;
}
