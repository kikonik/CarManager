package com.webserverlanguages.carManager.controller;

import com.webserverlanguages.carManager.dtos.carDTOs.CreateCarDTO;
import com.webserverlanguages.carManager.dtos.carDTOs.ResponseCarDTO;
import com.webserverlanguages.carManager.dtos.carDTOs.UpdateCarDTO;
import com.webserverlanguages.carManager.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
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
    @RequestMapping (value = "/cars/{id}", method = RequestMethod.PUT,consumes = MediaType.APPLICATION_JSON_VALUE , produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ResponseCarDTO> updateCar(@PathVariable Long id, UpdateCarDTO dto) {
        ResponseCarDTO updatedCar = carService.updateCar(id, dto);
        return ResponseEntity.ok(updatedCar);
    }

    @Override
    @RequestMapping (value = "/cars/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Boolean> deleteCar(@PathVariable Long id) {
        carService.deleteCar(id);
        return ResponseEntity.ok(true);
    }

    @Override
    @RequestMapping (value = "/cars/{id}", method = RequestMethod.GET)
    public ResponseEntity<ResponseCarDTO> getCarById(@PathVariable Long id) {
        ResponseCarDTO car = carService.getCarById(id);
        return ResponseEntity.ok(car);
    }

    @Override
    @RequestMapping (value = "/cars", method = RequestMethod.GET)
    public ResponseEntity<List<ResponseCarDTO>> getAllCars(
            @RequestParam(required = false) String make,
            @RequestParam(required = false) Long garageId,
            @RequestParam(required = false) LocalDate startYear,
            @RequestParam(required = false) LocalDate endYear) {

        List<ResponseCarDTO> cars = carService.getAllCars(make, garageId, startYear, endYear);
        return ResponseEntity.ok(cars);
    }
}
