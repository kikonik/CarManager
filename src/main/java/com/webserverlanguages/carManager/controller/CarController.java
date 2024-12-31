package com.webserverlanguages.carManager.controller;

import com.webserverlanguages.carManager.dtos.carDTOs.CreateCarDTO;
import com.webserverlanguages.carManager.dtos.carDTOs.ResponseCarDTO;
import com.webserverlanguages.carManager.dtos.carDTOs.UpdateCarDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

public interface CarController {

    ResponseEntity<ResponseCarDTO> createCar(CreateCarDTO dto);

    ResponseCarDTO updateCar(Long carId, UpdateCarDTO dto);

    void deleteCar(Long carId);

    ResponseCarDTO getCarById(Long carId);

    List<ResponseCarDTO> getAllCars(String make, Long garageId, int startYear, int endYear);

}
