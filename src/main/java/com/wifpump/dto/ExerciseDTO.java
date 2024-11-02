package com.wifpump.dto;

import com.wifpump.enums.ExerciseCategory;
import com.wifpump.enums.MuscleGroup;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class ExerciseDTO {

    @NotNull
    private Long id;
    @Size(min = 3, max = 50)
    private String name;
    @Size(min = 10, max= 50)
    private String description;
    private ExerciseCategory category;
    private MuscleGroup muscleGroup;
    private boolean equipmentNeeded;
}
