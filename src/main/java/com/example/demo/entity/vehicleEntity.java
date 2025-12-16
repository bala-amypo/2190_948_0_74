package com.example.demo.entity;

import jakarta.persistence.*

@Entity
@Table(name="vehicle",uniqueConstrains={@UniqueConstraint(columnNames="vehicle_number")})

public class Vehicle{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id;

    @ManyToOne
    @JoinColumn(name="user_id",nullable=false) private User user;

    @Column(N)
}