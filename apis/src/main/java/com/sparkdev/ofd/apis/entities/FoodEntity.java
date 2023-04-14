package com.sparkdev.ofd.apis.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "food")
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@EqualsAndHashCode
public class FoodEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String foodName;
    private String description;
    private float price;
    @ManyToOne
    @JoinColumn(name = "categoryId")
    private FoodCategoryEntity foodCategoryEntity;
    @ManyToOne
    @JoinColumn(name = "restaurantId")
    private RestaurantEntity restaurantEntity;
}
