package com.postgresql.cardapio.food;

import jakarta.persistence.*;


@Table(name="foods")
@Entity(name="foods")
public class Food {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long title;

    private Long image;

    private Long price;
}
