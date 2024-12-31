package com.webserverlanguages.carManager.controller;

import com.webserverlanguages.carManager.dtos.carDTOs.CreateCarDTO;
import com.webserverlanguages.carManager.dtos.carDTOs.ResponseCarDTO;
import com.webserverlanguages.carManager.dtos.carDTOs.UpdateCarDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

public interface CarController {

    ResponseEntity<ResponseCarDTO> createCar(CreateCarDTO dto);

    ResponseEntity<ResponseCarDTO> updateCar(Long carId, UpdateCarDTO dto);

    ResponseEntity<Boolean> deleteCar(Long carId);

    ResponseEntity<ResponseCarDTO> getCarById(Long carId);

    ResponseEntity<List<ResponseCarDTO>> getAllCars(String make, Long garageId, LocalDate startYear, LocalDate endYear);
}
