package com.example.airlinemanagementsystem.repository;

import com.example.airlinemanagementsystem.model.Flight;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlightRepository extends JpaRepository<Flight, Long> {
}