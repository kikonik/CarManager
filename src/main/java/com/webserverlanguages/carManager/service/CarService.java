package com.webserverlanguages.carManager.service;

import com.webserverlanguages.carManager.dtos.carDTOs.CreateCarDTO;
import com.webserverlanguages.carManager.dtos.carDTOs.ResponseCarDTO;
import com.webserverlanguages.carManager.dtos.carDTOs.UpdateCarDTO;

import java.util.List;

public interface CarService {

    ResponseCarDTO createCar(CreateCarDTO dto);

    ResponseCarDTO updateCar(Long carId, UpdateCarDTO dto);

    void deleteCar(Long carId);

    ResponseCarDTO getCarById(Long carId);

    List<ResponseCarDTO> getAllCars(String make, Long garageId, int startYear, int endYear);


}
