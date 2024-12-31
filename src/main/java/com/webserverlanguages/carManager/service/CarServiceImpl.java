package com.webserverlanguages.carManager.service;

import com.webserverlanguages.carManager.dtos.carDTOs.CreateCarDTO;
import com.webserverlanguages.carManager.dtos.carDTOs.ResponseCarDTO;
import com.webserverlanguages.carManager.dtos.carDTOs.UpdateCarDTO;
import com.webserverlanguages.carManager.entity.Car;
import com.webserverlanguages.carManager.repositories.CarRepository;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    @Autowired
    private CarRepository carRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    @Transactional
    public ResponseCarDTO createCar(CreateCarDTO dto) {

        Car car = modelMapper.map(dto, Car.class);

        Car savedCar = carRepository.save(car);

       return modelMapper.map(savedCar, ResponseCarDTO.class);

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
