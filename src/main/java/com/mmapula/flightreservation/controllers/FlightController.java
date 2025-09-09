package com.mmapula.flightreservation.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.mmapula.flightreservation.repositories.FlightRepository;

import java.util.Date;

@Controller
public class FlightController {
    @Autowired
    private FlightRepository flightRepository;

    @PostMapping
    public String findFlight(@RequestParam("departureCity") String from, @RequestParam("arrivalCity")
            String to, @RequestParam("departureDate") @DateTimeFormat(pattern = "MM-dd-yyyy") Date departureDate) {



        return "displayFlights";
    }
}
