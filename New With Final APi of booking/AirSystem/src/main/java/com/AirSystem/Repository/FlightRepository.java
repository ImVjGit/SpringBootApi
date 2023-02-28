package com.AirSystem.Repository;

import com.AirSystem.Entity.Flight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FlightRepository extends JpaRepository<Flight,Long> {
    public static Flight findByFlightName(String flightName) {
        return FlightRepository.findByFlightName(flightName);
    }


}
