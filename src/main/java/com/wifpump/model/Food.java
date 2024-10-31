package com.wifpump.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Table(name="food_items")
@Data
public class Food {

    @Id
    private Long food_id;
    private String name;
    private String category;
    @Column(name = "calories_per_100g")
    private Integer kcalPer100G;
    private Integer protein_per_100g;
    private Integer carbs_per_100g;
    private Integer fat_per_100g;
    private LocalDateTime created_at;

}
