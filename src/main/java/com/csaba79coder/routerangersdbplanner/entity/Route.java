package com.csaba79coder.routerangersdbplanner.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "route")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Route extends Identifier {

    @ManyToOne
    @JoinColumn(name = "cargo_id")
    private Cargo cargo;

    @ManyToOne // Az út felvételi helye
    @JoinColumn(name = "pick_up_location_id")
    private Address pickUpLocation;

    @ManyToOne // Az út leadási helye
    @JoinColumn(name = "drop_off_location_id")
    private Address dropOffLocation;

    @ManyToOne
    @JoinColumn(name = "vehicle_id")
    private Vehicle vehicle;
}
