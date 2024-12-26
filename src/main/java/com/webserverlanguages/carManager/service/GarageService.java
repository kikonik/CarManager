package com.webserverlanguages.carManager.service;

import com.webserverlanguages.carManager.dtos.garageDTOs.CreateGarageDTO;
import com.webserverlanguages.carManager.dtos.garageDTOs.GarageDailyAvailabilityReportDTO;
import com.webserverlanguages.carManager.dtos.garageDTOs.ResponseGarageDTO;
import com.webserverlanguages.carManager.dtos.garageDTOs.UpdateGarageDTO;

import java.time.LocalDate;
import java.util.List;

public interface GarageService {

    ResponseGarageDTO createGarage(CreateGarageDTO dto);

    ResponseGarageDTO updateGarage(Long garageId, UpdateGarageDTO dto);

    void deleteGarage(Long garageId);

    ResponseGarageDTO getGarageById(Long garageId);

    List<ResponseGarageDTO> getAllGarages(String city);

    GarageDailyAvailabilityReportDTO generateAvailabilityReport(Long garageId, LocalDate date);

}
