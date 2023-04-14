package com.sparkdev.ofd.apis.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "food_category")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class FoodCategoryEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int categoryId;
    @Column(name = "category_name", nullable = false, unique = true)
    private String categoryName;
    @OneToMany(mappedBy = "foodCategoryEntity")
    private List<FoodEntity> foodEntities;
}
