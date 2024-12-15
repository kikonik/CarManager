package com.webserverlanguages.carManager.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "car")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long carId;

    private String make;

    private String model;

    private LocalDate productionYear;

    private String licensePlate;

    @OneToMany(mappedBy = "garageId")
    private List<Garage> garageId;

}
