package com.webserverlanguages.carManager.dtos.requestDTOs;

import com.webserverlanguages.carManager.entity.Car;
import com.webserverlanguages.carManager.entity.Garage;


import java.time.LocalDateTime;

public class ResponseRequestDTO {

  //  private Long requestId;

    private Long carId;

//    private String carMake;

    private Long garageId;

//    private String garageName;

    private String serviceType;

    private LocalDateTime scheduleDate;

    public ResponseRequestDTO(Long carId, Long garageId, String serviceType, LocalDateTime scheduleDate) {
        this.carId = carId;
        this.garageId = garageId;
        this.serviceType = serviceType;
        this.scheduleDate = scheduleDate;
    }

    public ResponseRequestDTO() {
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
