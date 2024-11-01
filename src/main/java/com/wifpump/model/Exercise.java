package com.wifpump.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
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
    private String category;
    private String muscle_group;
    private boolean equipment_needed;
    private LocalDateTime created_at;
}
