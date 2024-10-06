package com.csaba79coder.routerangersdbplanner.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import lombok.Getter;
import lombok.Setter;
import org.antlr.v4.runtime.misc.NotNull;

import java.util.List;

@Entity
@Table(name = "vehicle")
@Inheritance(strategy = InheritanceType.JOINED)
@Getter
@Setter
public abstract class Vehicle extends Identifier {

    @NotNull
    private String licensePlate;

    /**
     * pom.xml-ben a következő dependency-t kell hozzáadni:
     *  <dependency>
     *             <groupId>jakarta.validation</groupId>
     *             <artifactId>jakarta.validation-api</artifactId>
     *             <version>3.0.2</version>
     *         </dependency>
     */
    @Min(1)
    private int numberOfAxles;
    private double maxLoadHeight;
    private double maxLoadWeight;

    @OneToMany(mappedBy = "vehicle")
    private List<Maintenance> maintenances;

    @ManyToOne
    @JoinColumn(name = "fleet_id")
    private Fleet fleet;
}
