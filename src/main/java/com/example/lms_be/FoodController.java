package com.example.lms_be;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/food")
@CrossOrigin("*")
public class FoodController {
    
    @Autowired
    public FoodRepo repo;

    @GetMapping("/list")
    public List<Food> getFoodList(){
        return repo.findAll();
    }

    @PostMapping("/add")
    public String addTheFood( @RequestBody Food food){
        repo.save(food);
        return "Food has been added.";
    }

}
