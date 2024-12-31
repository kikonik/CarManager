package com.webserverlanguages.carManager.controller;

import com.webserverlanguages.carManager.dtos.requestDTOs.CreateRequestDTO;
import com.webserverlanguages.carManager.dtos.requestDTOs.MonthlyRequestReportDTO;
import com.webserverlanguages.carManager.dtos.requestDTOs.ResponseRequestDTO;
import com.webserverlanguages.carManager.dtos.requestDTOs.UpdateRequestDTO;
import com.webserverlanguages.carManager.service.SupportManagementRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
public class SupportManagementRequestControllerImpl implements SupportManagementRequestController {
    @Autowired
    SupportManagementRequestService requestService;

    @Override
    @RequestMapping(value = "/maintenance", method = RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_VALUE , produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ResponseRequestDTO> createRequest(@RequestBody CreateRequestDTO dto) {
        ResponseRequestDTO responseRequestDTO = requestService.createRequest(dto);

        return ResponseEntity.ok(responseRequestDTO);
    }

    @Override
    @RequestMapping(value = "/maintenance/{id}", method = RequestMethod.PUT,consumes = MediaType.APPLICATION_JSON_VALUE , produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ResponseRequestDTO> updateRequest(@PathVariable Long id, UpdateRequestDTO dto) {
        ResponseRequestDTO responseRequestDTO = requestService.updateRequest(id, dto);
        return ResponseEntity.ok(responseRequestDTO);
    }

    @Override
    @RequestMapping(value = "/maintenance/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Long> deleteRequest(@PathVariable Long id) {
        requestService.deleteRequest(id);
        return ResponseEntity.ok(id);
    }

    @Override
    @RequestMapping(value = "/maintenance/{id}", method = RequestMethod.GET)
    public ResponseEntity<ResponseRequestDTO> getRequestById(@PathVariable Long id) {
        ResponseRequestDTO responseRequestDTO = requestService.getRequestById(id);
        return ResponseEntity.ok(responseRequestDTO);
    }

    @Override
    @RequestMapping(value = "/maintenance", method = RequestMethod.GET)
    public ResponseEntity<List<ResponseRequestDTO>> getAllRequests(Long carId, Long garageId, LocalDate startDate, LocalDate endDate) {
        return null;
    }

    @Override
    public ResponseEntity<List<MonthlyRequestReportDTO>> getMonthlyRequestReport(Long garageId, LocalDate startDate, LocalDate endDate) {
        return null;
    }
}
