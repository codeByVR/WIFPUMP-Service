package com.wifpump.model;


import com.wifpump.enums.FoodCategory;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Table(name="food_items")
@Data
public class Food {

    @Id
    private Long food_id;
    private String name;
    @Enumerated(EnumType.STRING)
    private FoodCategory category;
    @Column(name = "calories_per_100g")
    private Integer kcalPer100G;
    private Integer protein_per_100g;
    private Integer carbs_per_100g;
    private Integer fat_per_100g;
    private LocalDateTime created_at;

}
