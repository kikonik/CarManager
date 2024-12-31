package com.webserverlanguages.carManager.dtos.requestDTOs;

import com.webserverlanguages.carManager.dtos.carDTOs.ResponseCarDTO;
import com.webserverlanguages.carManager.dtos.garageDTOs.ResponseGarageDTO;
import com.webserverlanguages.carManager.entity.Car;
import com.webserverlanguages.carManager.entity.Garage;
import jakarta.persistence.*;


import java.time.LocalDate;
import java.time.LocalDateTime;

public class CreateRequestDTO {

    private Long requestId;

    private Long carId;

    private Long garageId;

    private String serviceType;

    private LocalDateTime scheduleDate;

    public CreateRequestDTO(Long requestId, Long carId, Long garageId, String serviceType, LocalDateTime scheduleDate) {
        this.requestId = requestId;
        this.carId = carId;
        this.garageId = garageId;
        this.serviceType = serviceType;
        this.scheduleDate = scheduleDate;
    }

    public CreateRequestDTO() {
    }

    public Long getRequestId() {
        return requestId;
    }

    public void setRequestId(Long requestId) {
        this.requestId = requestId;
    }

    public Long getCarId() {
        return carId;
    }

    public void setCarId(Long carId) {
        this.carId = carId;
    }

    public Long getGarageId() {
        return garageId;
    }

    public void setGarageId(Long garageId) {
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
