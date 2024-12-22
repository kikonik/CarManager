package com.webserverlanguages.carManager.dtos.requestDTOs;

import com.webserverlanguages.carManager.entity.Car;
import com.webserverlanguages.carManager.entity.Garage;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MonthlyRequestReportDTO {

    private LocalDateTime scheduleDate;

    private int requestCount;

}
