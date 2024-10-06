package com.csaba79coder.routerangersdbplanner.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "cargo")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Cargo extends Identifier {

    private double weight;
    private double volume;
    private boolean perishableProduct;
    private String description;
}

