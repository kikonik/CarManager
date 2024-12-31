package com.webserverlanguages.carManager.dtos.garageDTOs;


import java.time.LocalDateTime;

public class GarageDailyAvailabilityReportDTO {

    private LocalDateTime city;

    private Integer capacity;

    private int requestsCount;

    public GarageDailyAvailabilityReportDTO(LocalDateTime city, Integer capacity, int requestsCount) {
        this.city = city;
        this.capacity = capacity;
        this.requestsCount = requestsCount;
    }

    public GarageDailyAvailabilityReportDTO() {
    }

    public LocalDateTime getCity() {
        return city;
    }

    public void setCity(LocalDateTime city) {
        this.city = city;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public int getRequestsCount() {
        return requestsCount;
    }

    public void setRequestsCount(int requestsCount) {
        this.requestsCount = requestsCount;
    }
}
