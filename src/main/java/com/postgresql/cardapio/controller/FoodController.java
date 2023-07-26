package com.postgresql.cardapio.controller;

import com.postgresql.cardapio.food.Food;
import com.postgresql.cardapio.food.FoodRepository;
import com.postgresql.cardapio.food.FoodReponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("food")
public class FoodController {

    @Autowired
    private FoodRepository repository;

    @GetMapping
    public void saveFood(@RequestBody FoodRequestDTO data) {

    }

    @GetMapping
    public List<FoodResponseDTO> getAll() {

        List<FoodResponseDTO> foodList = repository.findAll().stream().map(FoodReponseDTO::new);
        return foodList;
    }
}
