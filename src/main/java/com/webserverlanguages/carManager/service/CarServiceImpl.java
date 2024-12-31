package com.webserverlanguages.carManager.service;

import com.webserverlanguages.carManager.dtos.carDTOs.CreateCarDTO;
import com.webserverlanguages.carManager.dtos.carDTOs.ResponseCarDTO;
import com.webserverlanguages.carManager.dtos.carDTOs.UpdateCarDTO;
import com.webserverlanguages.carManager.entity.Car;
import com.webserverlanguages.carManager.entity.Garage;
import com.webserverlanguages.carManager.repositories.CarRepository;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

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
    @Transactional
    public ResponseCarDTO updateCar(Long carId, UpdateCarDTO dto) {
        Car car = carRepository.findById(carId.intValue())
                .orElseThrow(() -> new RuntimeException("Car not found"));

        car.setMake(dto.getMake());
        car.setModel(dto.getModel());
        car.setProductionYear(dto.getProductionYear());
        car.setLicensePlate(dto.getLicensePlate());
        car.setGarage(dto.getGarageId());

        Car updatedCar = carRepository.save(car);
        return modelMapper.map(updatedCar, ResponseCarDTO.class);
    }

    @Override
    @Transactional
    public void deleteCar(Long carId) {
        if (!carRepository.existsById(carId.intValue())) {
            throw new RuntimeException("Car not found");
        }
        carRepository.deleteById(carId.intValue());
    }

    @Override
    public ResponseCarDTO getCarById(Long carId) {
        Car car = carRepository.findById(carId.intValue())
                .orElseThrow(() -> new RuntimeException("Car not found"));

        return modelMapper.map(car, ResponseCarDTO.class);
    }

    @Override
    public List<ResponseCarDTO> getAllCars(String make, Long garageId, LocalDate startYear, LocalDate endYear) {
        List<Car> cars = carRepository.findByMakeAndGarageIdAndProductionYearBetween(make, garageId, startYear, endYear);

        return cars.stream()
                .map(car -> modelMapper.map(car, ResponseCarDTO.class))
                .collect(Collectors.toList());
    }
}
