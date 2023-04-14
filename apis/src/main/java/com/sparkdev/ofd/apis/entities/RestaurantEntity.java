package com.sparkdev.ofd.apis.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@Entity
@Table(name = "restaurant")
public class RestaurantEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int restaurantId;
    @Column(nullable = false)
    private String restaurantName;
    @Column(nullable = false, unique = true)
    private String phone;
    @Column(nullable = false)
    private String address;
    @Column
    private String email;
    @OneToMany(mappedBy = "restaurantEntity")
    private List<FoodEntity> foodEntities;
}