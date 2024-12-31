package com.webserverlanguages.carManager.service;

import com.webserverlanguages.carManager.dtos.requestDTOs.CreateRequestDTO;
import com.webserverlanguages.carManager.dtos.requestDTOs.MonthlyRequestReportDTO;
import com.webserverlanguages.carManager.dtos.requestDTOs.ResponseRequestDTO;
import com.webserverlanguages.carManager.dtos.requestDTOs.UpdateRequestDTO;
import com.webserverlanguages.carManager.entity.SupportManagementRequest;
import com.webserverlanguages.carManager.repositories.SupportManagementRequestRepository;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class SupportManagementRequestServiceImpl implements SupportManagementRequestService {
    @Autowired
    private SupportManagementRequestRepository supportManagementRequestRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    @Transactional
    public ResponseRequestDTO createRequest(CreateRequestDTO dto) {
        SupportManagementRequest supportManagementRequest = modelMapper.map(dto, SupportManagementRequest.class);

        SupportManagementRequest savedRequest = supportManagementRequestRepository.save(supportManagementRequest);

        return modelMapper.map(savedRequest, ResponseRequestDTO.class);

    }

    @Override
    @Transactional
    public ResponseRequestDTO updateRequest(Long requestId, UpdateRequestDTO dto) {
        SupportManagementRequest existingRequest = supportManagementRequestRepository.findById(requestId.intValue())
                .orElseThrow(() -> new RuntimeException("Request not found"));

        modelMapper.map(dto, requestId);

        SupportManagementRequest updatedRequest = supportManagementRequestRepository.save(existingRequest);

        return modelMapper.map(updatedRequest, ResponseRequestDTO.class);
    }

    @Override
    @Transactional
    public void deleteRequest(Long requestId) {
        if (!supportManagementRequestRepository.existsById(requestId.intValue())) {
            throw new RuntimeException("Garage not found");
        }
        supportManagementRequestRepository.deleteById(requestId.intValue());
    }

    @Override
    public ResponseRequestDTO getRequestById(Long requestId) {
        SupportManagementRequest request = supportManagementRequestRepository.findById(requestId.intValue())
                .orElseThrow(() -> new RuntimeException("Request not found"));

        return modelMapper.map(request, ResponseRequestDTO.class);
    }

    @Override
    public List<ResponseRequestDTO> getAllRequests(Long carId, Long garageId, LocalDate startDate, LocalDate endDate) {
        return List.of();
    }

    @Override
    public List<MonthlyRequestReportDTO> getMonthlyRequestReport(Long garageId, LocalDate startDate, LocalDate endDate) {
        return List.of();
    }
}
