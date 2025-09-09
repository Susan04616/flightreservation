package com.mmapula.flightreservation.repositories;

import com.mmapula.flightreservation.beans.Flight;
import com.mmapula.flightreservation.beans.Passenger;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PassengerRepository extends JpaRepository<Passenger,Long> {
}
