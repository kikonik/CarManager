package com.webserverlanguages.carManager.controller;

import com.webserverlanguages.carManager.dtos.garageDTOs.CreateGarageDTO;
import com.webserverlanguages.carManager.dtos.garageDTOs.GarageDailyAvailabilityReportDTO;
import com.webserverlanguages.carManager.dtos.garageDTOs.ResponseGarageDTO;
import com.webserverlanguages.carManager.dtos.garageDTOs.UpdateGarageDTO;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface GarageController {
    ResponseEntity<ResponseGarageDTO> createGarage(CreateGarageDTO dto);

    ResponseEntity<ResponseGarageDTO> updateGarage(Long id, UpdateGarageDTO dto);

    ResponseEntity<Boolean> deleteGarage(Long id);

    ResponseEntity<ResponseGarageDTO> getGarageById( Long id);

    ResponseEntity<List<ResponseGarageDTO>> getAllGaragesByCity(String city);

    ResponseEntity<GarageDailyAvailabilityReportDTO> generateAvailabilityReport(Long id);

}
