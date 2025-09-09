package com.mmapula.flightreservation.repositories;

import com.mmapula.flightreservation.beans.Flight;
import com.mmapula.flightreservation.beans.Reservation;

import org.springframework.data.jpa.repository.JpaRepository;
public interface ReservationRepository extends JpaRepository<Reservation,Long> {
}
