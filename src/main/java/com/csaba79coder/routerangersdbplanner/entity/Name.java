package com.csaba79coder.routerangersdbplanner.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "name")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Name extends Identifier{

    private String firstName;
    private String midName;
    private String lastName;
}
