package com.AirSystem.Service;

import com.AirSystem.Entity.Flight;
import com.AirSystem.Repository.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class FlightServiceImp implements FlightService{


    @Autowired
    FlightRepository flightRepository;

    @Override
    public Flight saveFlight(Flight flight) {
        return flightRepository.save(flight);
    }

    @Override
    public List<Flight> getAllFlight() {
        return flightRepository.findAll();
    }

    @Override
    public Flight getFlightById(Long flightId) {
        return flightRepository.findById(flightId).get();
    }

    @Override
    public void deleteFlightById(Long flighId) {
        flightRepository.deleteById(flighId);
    }

    @Override
    public void updateFlightById(Long flightid, Flight flight) {
        Flight f = flightRepository.findById(flightid).get();
        if(Objects.nonNull(flight.getFlightName())&&!"".equalsIgnoreCase(flight.getFlightName()))
        {
            f.setFlightName(flight.getFlightName());
        }
        flightRepository.save(f);

    }
}
