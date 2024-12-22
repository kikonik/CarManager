package com.webserverlanguages.carManager.dtos.garageDTOs;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class GarageDailyAvailabilityReportDTO {

    private LocalDateTime city;

    private Integer capacity;

    private int requestsCount;

}
