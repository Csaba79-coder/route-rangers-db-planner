package com.csaba79coder.routerangersdbplanner.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "driver")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Driver extends Identifier {

    @OneToOne
    @JoinColumn(name = "name_id")
    private Name name;

    private String numberOfDrivingLicence;
    private Boolean availability;
    private double hoursWorked;
    private double maxWorkingHoursPerDay;

    @OneToMany(mappedBy = "driver")
    private List<TimeSlot> timeSlots;

    @OneToMany(mappedBy = "driver")
    private List<DriverSchedule> driverSchedules;

    @ManyToOne
    @JoinColumn(name = "fleet_id")
    private Fleet fleet;
}


