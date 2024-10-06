package com.csaba79coder.routerangersdbplanner.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "fuel")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Fuel extends Identifier {

    @Enumerated(EnumType.STRING)
    private FuelType fuelType;

    private String name;
    private double priceOfUnit;
    private double amount;

    @ManyToOne
    @JoinColumn(name = "vehicle_id")
    private Vehicle vehicle;
}
