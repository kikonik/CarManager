package com.webserverlanguages.carManager.dtos.garageDTOs;


import java.time.LocalDate;
import java.time.LocalDateTime;

public class GarageDailyAvailabilityReportDTO {

    private LocalDate date;

    private Integer capacity;

    private int requestsCount;

    public GarageDailyAvailabilityReportDTO(LocalDate date, Integer capacity, int requestsCount) {
        this.date = date;
        this.capacity = capacity;
        this.requestsCount = requestsCount;
    }

    public GarageDailyAvailabilityReportDTO() {
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
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
