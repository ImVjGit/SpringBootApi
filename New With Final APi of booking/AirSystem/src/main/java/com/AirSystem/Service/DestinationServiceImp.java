package com.AirSystem.Service;

import com.AirSystem.Entity.Destination;
import com.AirSystem.Repository.DestinationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class DestinationServiceImp implements DestinationService{
    @Autowired
    private DestinationRepository destinationRepository;
    @Override
    public Destination saveDestination(Destination destination) {
        return destinationRepository.save(destination);
    }

    @Override
    public List<Destination> getAllDestination() {
        return destinationRepository.findAll();
    }

    @Override
    public Destination getDestinationById(Long destinationId) {
        return destinationRepository.findById(destinationId).get();
    }

    @Override
    public void updateDestinationById(Long destinationId, Destination destination) {
        Destination d = destinationRepository.findById(destinationId).get();
        if(Objects.nonNull(destination.getDestinationName())&&!"".equalsIgnoreCase(destination.getDestinationName()))
        {
            d.setDestinationName(destination.getDestinationName());
        }
        destinationRepository.save(d);
    }

    @Override
    public void deleteDestinationById(Long destinationId) {
            destinationRepository.deleteById(destinationId);
    }
}
