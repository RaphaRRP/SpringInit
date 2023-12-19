package com.eapi.parking.repositories;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eapi.parking.models.ParkingSpotModel;


@Repository
public interface ParkingSpotRepository extends JpaRepository<ParkingSpotModel, UUID>{
    
}
