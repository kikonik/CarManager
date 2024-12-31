package com.webserverlanguages.carManager.repositories;

import com.webserverlanguages.carManager.entity.Garage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GarageRepository extends JpaRepository<Garage, Integer> {

    List<Garage> findByCity(String city);

}
