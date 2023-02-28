package com.AirSystem.Controller;

import com.AirSystem.Entity.Flight;
import com.AirSystem.Service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FlightController {


@Autowired
    private FlightService flightService;

@PostMapping("/flight")
    public Flight saveFlight(@RequestBody Flight flight)
{
    return flightService.saveFlight(flight);
}

@GetMapping("/flight")
public List<Flight> getAllFlight()
{
    return flightService.getAllFlight();
}

@GetMapping("/flight/{id}")
    public Flight getFightbyId(@PathVariable("id") Long flightId)
{
    return flightService.getFlightById(flightId);
}

@DeleteMapping("/flight/{id}")
    public String deleteFlightById(@PathVariable("id") Long flighId)
{
    flightService.deleteFlightById(flighId);
    return "Flight Delete Of Id : "+flighId;
}

@PutMapping("/flight/{id}")
public String updateFlightById(@PathVariable("id") Long flightid,
                        @RequestBody Flight flight)
{
    flightService.updateFlightById(flightid,flight);
    return "Update Flight Of Id: "+flightid;
}


}
