package com.webserverlanguages.carManager.dtos.requestDTOs;



import java.time.LocalDateTime;

public class MonthlyRequestReportDTO {

    private LocalDateTime scheduleDate;

    private int requestCount;

    public MonthlyRequestReportDTO(LocalDateTime scheduleDate, int requestCount) {
        this.scheduleDate = scheduleDate;
        this.requestCount = requestCount;
    }

    public MonthlyRequestReportDTO() {
    }

    public LocalDateTime getScheduleDate() {
        return scheduleDate;
    }

    public void setScheduleDate(LocalDateTime scheduleDate) {
        this.scheduleDate = scheduleDate;
    }

    public int getRequestCount() {
        return requestCount;
    }

    public void setRequestCount(int requestCount) {
        this.requestCount = requestCount;
    }
}
