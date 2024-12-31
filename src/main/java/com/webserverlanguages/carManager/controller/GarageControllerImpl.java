package com.webserverlanguages.carManager.controller;

import com.webserverlanguages.carManager.dtos.carDTOs.CreateCarDTO;
import com.webserverlanguages.carManager.dtos.garageDTOs.CreateGarageDTO;
import com.webserverlanguages.carManager.dtos.garageDTOs.GarageDailyAvailabilityReportDTO;
import com.webserverlanguages.carManager.dtos.garageDTOs.ResponseGarageDTO;
import com.webserverlanguages.carManager.dtos.garageDTOs.UpdateGarageDTO;
import com.webserverlanguages.carManager.entity.Garage;
import com.webserverlanguages.carManager.service.GarageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class GarageControllerImpl implements GarageController {
    @Autowired
    private GarageService garageService;

    @Override
    @RequestMapping(value = "/garages", method = RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_VALUE , produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ResponseGarageDTO> createGarage(@RequestBody CreateGarageDTO dto) {

        ResponseGarageDTO responseGarageDTO = garageService.createGarage(dto);

        return ResponseEntity.ok(responseGarageDTO);
    }

    @Override
    @RequestMapping(value = "/garages/{id}", method = RequestMethod.PUT,consumes = MediaType.APPLICATION_JSON_VALUE , produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ResponseGarageDTO> updateGarage(@PathVariable Long id, UpdateGarageDTO dto) {
        ResponseGarageDTO updateGarage = garageService.updateGarage(id, dto);

        return ResponseEntity.ok(updateGarage);
    }


    @Override
    @RequestMapping(value = "/garages/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Boolean> deleteGarage(@PathVariable Long id) {

        garageService.deleteGarage(id);

        return ResponseEntity.ok(true);
    }

    @Override
    @RequestMapping(value = "/garages/{id}", method = RequestMethod.GET)
    public ResponseEntity<ResponseGarageDTO> getGarageById(@PathVariable Long id) {
       ResponseGarageDTO g = garageService.getGarageById(id);
      return ResponseEntity.ok(g);

    }

    @Override
    @RequestMapping(value = "/garages", method = RequestMethod.GET)
    public ResponseEntity<List<ResponseGarageDTO>> getAllGaragesByCity(@RequestParam String city) {
        List<ResponseGarageDTO> g = garageService.getAllGaragesByCity(city);

        return ResponseEntity.ok(g);

    }

    @Override
    public ResponseEntity<GarageDailyAvailabilityReportDTO> generateAvailabilityReport(Long garageId) {
    return null;
    }
}
