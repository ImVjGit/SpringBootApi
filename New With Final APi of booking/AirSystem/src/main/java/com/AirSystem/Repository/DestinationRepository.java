package com.AirSystem.Repository;

import com.AirSystem.Entity.Destination;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DestinationRepository extends JpaRepository<Destination,Long> {
    public static Destination findByDestinationName(String destination) {
        return DestinationRepository.findByDestinationName(destination);
    }
}
