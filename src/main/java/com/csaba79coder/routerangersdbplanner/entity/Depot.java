package com.csaba79coder.routerangersdbplanner.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "depot")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Depot extends Identifier {

    private String name;
    private int maxNumberOfVehicles;

    @OneToOne
    private Address address;
}




