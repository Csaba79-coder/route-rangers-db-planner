package com.csaba79coder.routerangersdbplanner.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name = "driver_schedule")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DriverSchedule extends Identifier {

    private LocalDate date;
    private double hoursWorked;

    @ManyToOne
    @JoinColumn(name = "driver_id")
    private Driver driver;
}