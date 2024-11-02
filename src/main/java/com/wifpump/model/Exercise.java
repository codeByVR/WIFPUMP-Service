package com.wifpump.model;

import com.wifpump.enums.ExerciseCategory;
import com.wifpump.enums.MuscleGroup;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "exercises")
public class Exercise {

    @Id
    private Long exercise_id;
    private String name;
    private String description;
    @Enumerated(EnumType.STRING)
    private ExerciseCategory category;
    @Enumerated(EnumType.STRING)
    private MuscleGroup muscle_group;
    private boolean equipment_needed;
    private LocalDateTime created_at;
}
