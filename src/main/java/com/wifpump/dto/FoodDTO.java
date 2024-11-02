package com.wifpump.dto;

import com.wifpump.enums.FoodCategory;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class FoodDTO {

    private Long id;
    @Size(min = 0, max = 50)
    private String name;
    @NotNull
    private FoodCategory category;
    @Min(0)
    private int kcalPer100g;
    @Min(0)
    private int proteinPer100g;
    @Min(0)
    private int carbsPer100g;
    @Min(0)
    private int fatPer100g;
}
