package com.AirSystem.Service;

import com.AirSystem.Entity.Flight;

import java.util.List;

public interface FlightService {

    public Flight saveFlight(Flight flight);
    public List<Flight> getAllFlight();
    public Flight getFlightById(Long flightId);
    public void deleteFlightById(Long flighId);
    public void updateFlightById(Long flightid,Flight flight);
}
