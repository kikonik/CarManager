package com.webserverlanguages.carManager.repositories;

import com.webserverlanguages.carManager.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface CarRepository extends JpaRepository<Car, Integer> {

    // Find cars by make
    List<Car> findByMake(String make);

    // Find cars by garage
    @Query("SELECT c FROM Car c JOIN c.garageId g WHERE g.garageId = :garageId")
    List<Car> findByGarageId(@Param("garageId") Long garageId);

    // Find cars within a production year range
    @Query("SELECT c FROM Car c WHERE c.productionYear BETWEEN :startYear AND :endYear")
    List<Car> findByProductionYearBetween(@Param("startYear") LocalDate startYear, @Param("endYear") LocalDate endYear);

}
