package com.webserverlanguages.carManager.entity;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
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

    public Car(Long carId, String make, String model, LocalDate productionYear, String licensePlate, List<Garage> garageId) {
        this.carId = carId;
        this.make = make;
        this.model = model;
        this.productionYear = productionYear;
        this.licensePlate = licensePlate;
        this.garageId = garageId;
    }

    public Car() {
    }

    public Long getCarId() {
        return carId;
    }

    public void setCarId(Long carId) {
        this.carId = carId;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public LocalDate getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(LocalDate productionYear) {
        this.productionYear = productionYear;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public List<Garage> getGarageId() {
        return garageId;
    }

    public void setGarageId(List<Garage> garageId) {
        this.garageId = garageId;
    }
}

