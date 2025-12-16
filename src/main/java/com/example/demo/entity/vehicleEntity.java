package com.example.demo.entity;

import jakarta.persistence.*

@Entity
@Table(name="vehicle",uniqueConstrains={@UniqueConstraint(columnNames="vehicle_number")})

public class Vehicle{
    @Id
    @GeneratedValue(strategy=)
}