package com.webserverlanguages.carManager.dtos.requestDTOs;

import com.webserverlanguages.carManager.entity.Car;
import com.webserverlanguages.carManager.entity.Garage;

import java.time.LocalDateTime;

public class UpdateRequestDTO {

    private Car carId;

    private Garage garageId;

    private String serviceType;

    private LocalDateTime scheduleDate;

    public UpdateRequestDTO(Car carId, Garage garageId, String serviceType, LocalDateTime scheduleDate) {
        this.carId = carId;
        this.garageId = garageId;
        this.serviceType = serviceType;
        this.scheduleDate = scheduleDate;
    }

    public UpdateRequestDTO() {
    }

    public Car getCarId() {
        return carId;
    }

    public void setCarId(Car carId) {
        this.carId = carId;
    }

    public Garage getGarageId() {
        return garageId;
    }

    public void setGarageId(Garage garageId) {
        this.garageId = garageId;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public LocalDateTime getScheduleDate() {
        return scheduleDate;
    }

    public void setScheduleDate(LocalDateTime scheduleDate) {
        this.scheduleDate = scheduleDate;
    }
}
