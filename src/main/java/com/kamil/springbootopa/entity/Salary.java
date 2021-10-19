package com.kamil.springbootopa.entity;

import javax.persistence.*;

@Entity
public class Salary {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String username;
    private double amount;
}
