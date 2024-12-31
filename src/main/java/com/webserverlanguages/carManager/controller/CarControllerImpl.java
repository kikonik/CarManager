package com.webserverlanguages.carManager.controller;

import com.webserverlanguages.carManager.dtos.carDTOs.CreateCarDTO;
import com.webserverlanguages.carManager.dtos.carDTOs.ResponseCarDTO;
import com.webserverlanguages.carManager.dtos.carDTOs.UpdateCarDTO;
import com.webserverlanguages.carManager.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@RequestMapping("/cars")

@CrossOrigin(origins = "http://localhost:3000", methods = { RequestMethod.POST})
public class CarControllerImpl implements CarController {

    @Autowired
    private CarService carService;

    @Override
    @RequestMapping(value = "/cars", method = RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_VALUE , produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ResponseCarDTO> createCar(@RequestBody CreateCarDTO dto) {
        ResponseCarDTO responseCarDTO = carService.createCar(dto);
        return ResponseEntity.ok(responseCarDTO);
    }


    @Override
    public ResponseCarDTO updateCar(Long carId, UpdateCarDTO dto) {
        return null;
    }

    @Override
    public void deleteCar(Long carId) {

    }

    @Override
    public ResponseCarDTO getCarById(Long carId) {
        return null;
    }

    @Override
    public List<ResponseCarDTO> getAllCars(String make, Long garageId, int startYear, int endYear) {
        return List.of();
    }
}
