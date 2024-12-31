package com.webserverlanguages.carManager.service;

import com.webserverlanguages.carManager.dtos.garageDTOs.CreateGarageDTO;
import com.webserverlanguages.carManager.dtos.garageDTOs.GarageDailyAvailabilityReportDTO;
import com.webserverlanguages.carManager.dtos.garageDTOs.ResponseGarageDTO;
import com.webserverlanguages.carManager.dtos.garageDTOs.UpdateGarageDTO;
import com.webserverlanguages.carManager.entity.Garage;
import com.webserverlanguages.carManager.repositories.GarageRepository;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class GarageServiceImpl implements GarageService {

    @Autowired
    private GarageRepository garageRepository;

    @Autowired
    private ModelMapper modelMapper;


    @Override
    @Transactional
    public ResponseGarageDTO createGarage(CreateGarageDTO dto) {
        Garage garage = modelMapper.map(dto, Garage.class);

        Garage savedGarage = garageRepository.save(garage);

        return modelMapper.map(savedGarage, ResponseGarageDTO.class);
    }

    @Override
    @Transactional
    public ResponseGarageDTO updateGarage(Long garageId, UpdateGarageDTO dto) {
        Garage existingGarage = garageRepository.findById(garageId.intValue())
                .orElseThrow(() -> new RuntimeException("Garage not found"));

        modelMapper.map(dto, existingGarage);

        Garage updatedGarage = garageRepository.save(existingGarage);

        return modelMapper.map(updatedGarage, ResponseGarageDTO.class);
    }

    @Override
    @Transactional
    public void deleteGarage(Long garageId) {
        if (!garageRepository.existsById(garageId.intValue())) {
            throw new RuntimeException("Garage not found");
        }
        garageRepository.deleteById(garageId.intValue());
    }


    @Override
    public ResponseGarageDTO getGarageById(Long garageId) {
        Garage garage = garageRepository.findById(garageId.intValue())
                .orElseThrow(() -> new RuntimeException("Garage not found"));

        return modelMapper.map(garage, ResponseGarageDTO.class);
    }

    @Override
    public List<ResponseGarageDTO> getAllGaragesByCity(String city) {
        List<Garage> garages = garageRepository.findByCity(city); // Modify with city filter logic if required

        return garages.stream()
                .map(garage -> modelMapper.map(garage, ResponseGarageDTO.class))
                .collect(Collectors.toList());
    }

    @Override
    public GarageDailyAvailabilityReportDTO generateAvailabilityReport(Long garageId, LocalDate date) {
        Garage garage = garageRepository.findById(garageId.intValue())
                .orElseThrow(() -> new RuntimeException("Garage not found"));

        return modelMapper.map(garage, GarageDailyAvailabilityReportDTO.class);
    }
}
