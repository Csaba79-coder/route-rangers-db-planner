package com.csaba79coder.routerangersdbplanner.entity;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "van")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Van extends Vehicle {

    private boolean refrigerated;
    private double maxLoadVolume;
}
