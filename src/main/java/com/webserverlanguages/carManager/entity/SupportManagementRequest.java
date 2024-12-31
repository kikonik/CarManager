package com.webserverlanguages.carManager.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "support_management_request")
public class SupportManagementRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long requestId;

    @OneToOne
    @JoinColumn(name = "car_id")
    private Car carId;

    @OneToOne
    @JoinColumn(name = "garage_id")
    private Garage garageId;

    private String serviceType;

    private LocalDateTime scheduleDate;

    public SupportManagementRequest() {
    }

    public SupportManagementRequest(Long requestId, Car carId, Garage garageId, String serviceType, LocalDateTime scheduleDate) {
        this.requestId = requestId;
        this.carId = carId;
        this.garageId = garageId;
        this.serviceType = serviceType;
        this.scheduleDate = scheduleDate;
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


