package com.webserverlanguages.carManager.dtos.carDTOs;

import com.webserverlanguages.carManager.entity.Garage;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UpdateCarDTO {

    private String make;

    private String model;

    private LocalDate productionYear;

    private String licensePlate;

    private List<Garage> garageId;
}
