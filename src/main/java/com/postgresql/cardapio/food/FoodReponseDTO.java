package com.postgresql.cardapio.food;

public record FoodReponseDTO(Long id, String title, String image, Integer price) {

    public FoodReponseDTO(Food food){
        this(food.id)
    }
}
