package com.webserverlanguages.carManager.controller;

import com.webserverlanguages.carManager.dtos.requestDTOs.CreateRequestDTO;
import com.webserverlanguages.carManager.dtos.requestDTOs.MonthlyRequestReportDTO;
import com.webserverlanguages.carManager.dtos.requestDTOs.ResponseRequestDTO;
import com.webserverlanguages.carManager.dtos.requestDTOs.UpdateRequestDTO;
import org.springframework.http.ResponseEntity;

import java.time.LocalDate;
import java.util.List;

public interface SupportManagementRequestController {

    ResponseEntity<ResponseRequestDTO> createRequest(CreateRequestDTO dto);

    ResponseEntity<ResponseRequestDTO> updateRequest(Long id, UpdateRequestDTO dto);

    ResponseEntity<Long> deleteRequest(Long id);

    ResponseEntity<ResponseRequestDTO> getRequestById(Long id);

    ResponseEntity<List<ResponseRequestDTO>> getAllRequests(Long carId, Long garageId, LocalDate startDate, LocalDate endDate);

    ResponseEntity<List<MonthlyRequestReportDTO>> getMonthlyRequestReport(Long garageId, LocalDate startDate, LocalDate endDate);

}
