package com.csaba79coder.routerangersdbplanner.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "time_slot")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class TimeSlot extends Identifier {

    private LocalTime startTime;
    private LocalTime endTime;
    private LocalDate dateOfTimeSlot;

    @ManyToOne
    @JoinColumn(name = "driver_id")
    private Driver driver;

    @ManyToOne
    @JoinColumn(name = "vehicle_id") // Kapcsolat a Vehicle entitással
    private Vehicle vehicle;
}
