package com.mmapula.flightreservation.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mmapula.flightreservation.beans.Flight;

import java.util.Date;

public interface FlightRepository extends JpaRepository<Flight,Long> {
    Flight findFlight(String from , String to , Date date);
}
