package com.webserverlanguages.carManager.dtos.carDTOs;

import com.webserverlanguages.carManager.entity.Garage;

import java.time.LocalDate;
import java.util.List;

public class UpdateCarDTO {

    private String make;

    private String model;

    private LocalDate productionYear;

    private String licensePlate;

    private List<Garage> garageId;

    public UpdateCarDTO(String make, String model, LocalDate productionYear, String licensePlate, List<Garage> garageId) {
        this.make = make;
        this.model = model;
        this.productionYear = productionYear;
        this.licensePlate = licensePlate;
        this.garageId = garageId;
    }

    public UpdateCarDTO() {
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
