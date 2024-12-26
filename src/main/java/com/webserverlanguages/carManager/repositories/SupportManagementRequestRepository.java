package com.webserverlanguages.carManager.repositories;

import com.webserverlanguages.carManager.entity.Car;
import com.webserverlanguages.carManager.entity.Garage;
import com.webserverlanguages.carManager.entity.SupportManagementRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface SupportManagementRequestRepository extends JpaRepository<SupportManagementRequest, Integer> {

    // Count requests by garage and specific date
    @Query("SELECT COUNT(r) FROM SupportManagementRequest r WHERE r.garageId.garageId = :garageId AND CAST(r.scheduleDate AS LocalDate) = :date")
    int countRequestsByGarageIdAndDate(@Param("garageId") Long garageId, @Param("date") LocalDate date);

    // Count requests per month within a date range
    @Query("SELECT FUNCTION('MONTH', r.scheduleDate), COUNT(r) " +
            "FROM SupportManagementRequest r " +
            "WHERE r.garageId.garageId = :garageId " +
            "AND r.scheduleDate BETWEEN :startDate AND :endDate " +
            "GROUP BY FUNCTION('MONTH', r.scheduleDate)")
    List<Object[]> countRequestsByMonthAndGarage(@Param("garageId") Long garageId,
                                                 @Param("startDate") LocalDate startDate,
                                                 @Param("endDate") LocalDate endDate);

    // Find requests by car
    List<SupportManagementRequest> findByCarId(Car carId);

    // Find requests by garage
    List<SupportManagementRequest> findByGarageId(Garage garageId);

}
