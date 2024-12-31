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

    List<Car> findByMakeAndProductionYearBetween(String make,LocalDate startYear,LocalDate endYear);

    // Find cars by make
    List<Car> findByMake(String make);
@Query("SELECT c FROM Car c JOIN c.garage g WHERE c.make = :make AND g.garageId = :garageId AND c.productionYear BETWEEN :startYear AND :endYear")
    List<Car> findByMakeAndGarageIdAndProductionYearBetween(String make,Long garageId,LocalDate startYear,LocalDate endYear);

}
