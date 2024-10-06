package com.csaba79coder.routerangersdbplanner.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "fleet")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Fleet extends Identifier {

    private String companyName;
    private int totalVehicles;
    private String description;

    @ManyToOne
    @JoinColumn(name = "depot_id")
    private Depot depot;

    @OneToMany(mappedBy = "fleet")
    private List<Vehicle> vehicles;

    @OneToMany(mappedBy = "fleet")
    private List<Driver> drivers;

}
