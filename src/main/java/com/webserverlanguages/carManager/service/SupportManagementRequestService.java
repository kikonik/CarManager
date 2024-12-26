package com.webserverlanguages.carManager.service;

import com.webserverlanguages.carManager.dtos.requestDTOs.CreateRequestDTO;
import com.webserverlanguages.carManager.dtos.requestDTOs.MonthlyRequestReportDTO;
import com.webserverlanguages.carManager.dtos.requestDTOs.ResponseRequestDTO;
import com.webserverlanguages.carManager.dtos.requestDTOs.UpdateRequestDTO;

import java.time.LocalDate;
import java.util.List;

public interface SupportManagementRequestService {

    CreateRequestDTO createRequest(CreateRequestDTO dto);

    ResponseRequestDTO updateRequest(Long requestId, UpdateRequestDTO dto);

    void deleteRequest(Long requestId);

    ResponseRequestDTO getRequestById(Long requestId);

    List<ResponseRequestDTO> getAllRequests(Long carId, Long garageId, LocalDate startDate, LocalDate endDate);

    List<MonthlyRequestReportDTO> getMonthlyRequestReport(Long garageId, LocalDate startDate, LocalDate endDate);

}
