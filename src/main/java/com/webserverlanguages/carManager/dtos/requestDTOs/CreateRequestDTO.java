package com.webserverlanguages.carManager.dtos.requestDTOs;

import com.webserverlanguages.carManager.dtos.carDTOs.ResponseCarDTO;
import com.webserverlanguages.carManager.dtos.garageDTOs.ResponseGarageDTO;
import com.webserverlanguages.carManager.entity.Car;
import com.webserverlanguages.carManager.entity.Garage;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CreateRequestDTO {

    private Long requestId;

    private ResponseCarDTO carId;

    private ResponseGarageDTO garageId;

    private String serviceType;

    private LocalDateTime scheduleDate;

}
