package com.webserverlanguages.carManager.dtos.requestDTOs;

import com.webserverlanguages.carManager.entity.Car;
import com.webserverlanguages.carManager.entity.Garage;


import java.time.LocalDateTime;

public class ResponseRequestDTO {

    private Long requestId;

    private Car carId;

    private Car carMake;

    private Garage garageId;

    private Garage garageName;

    private String serviceType;

    private LocalDateTime scheduleDate;

    public ResponseRequestDTO(Long requestId, Car carId, Car carMake, Garage garageId, Garage garageName, String serviceType, LocalDateTime scheduleDate) {
        this.requestId = requestId;
        this.carId = carId;
        this.carMake = carMake;
        this.garageId = garageId;
        this.garageName = garageName;
        this.serviceType = serviceType;
        this.scheduleDate = scheduleDate;
    }

    public ResponseRequestDTO() {
    }

    public Long getRequestId() {
        return requestId;
    }

    public void setRequestId(Long requestId) {
        this.requestId = requestId;
    }

    public Car getCarId() {
        return carId;
    }

    public void setCarId(Car carId) {
        this.carId = carId;
    }

    public Car getCarMake() {
        return carMake;
    }

    public void setCarMake(Car carMake) {
        this.carMake = carMake;
    }

    public Garage getGarageId() {
        return garageId;
    }

    public void setGarageId(Garage garageId) {
        this.garageId = garageId;
    }

    public Garage getGarageName() {
        return garageName;
    }

    public void setGarageName(Garage garageName) {
        this.garageName = garageName;
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
