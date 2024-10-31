package com.wifpump.controller;

import com.wifpump.model.Food;
import com.wifpump.model.User;
import com.wifpump.repository.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/food")
public class FoodController {

    @Autowired
    private FoodRepository foodRepository;

    @GetMapping
    public List<Food> getAllFood(){
        return foodRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Food> getFoodbyId(@PathVariable Long id){
        return foodRepository.findById((id));
    }

}
