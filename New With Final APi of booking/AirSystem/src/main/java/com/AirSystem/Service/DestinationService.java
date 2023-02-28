package com.AirSystem.Service;

import com.AirSystem.Entity.Destination;

import java.util.List;

public interface DestinationService {
    public  Destination saveDestination(Destination destination);

    public List<Destination> getAllDestination();
    public Destination getDestinationById(Long destinationId);
    public void updateDestinationById( Long destinationId, Destination destination);
    public  void deleteDestinationById(Long destinationId);

}
