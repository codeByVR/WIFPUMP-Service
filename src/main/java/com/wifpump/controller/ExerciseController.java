package com.wifpump.controller;

import com.wifpump.model.Exercise;
import com.wifpump.model.Food;
import com.wifpump.repository.ExerciseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLOutput;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/exercise")
public class ExerciseController {

    @Autowired
    private ExerciseRepository exerciseRepository;

    @GetMapping
    public List<Exercise> getAllExercise() {
        return exerciseRepository.findAll();
    }


    @GetMapping("/{id}")
    public Optional<Exercise> getExercisebyId(@PathVariable Long id) {
        return exerciseRepository.findById((id));
    }

}