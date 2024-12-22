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
public class UpdateGarageDTO {

    private String name;

    private String location;

    private LocalDateTime city;

    private Integer capacity;

}
