package com.AirSystem.Controller;

import com.AirSystem.Entity.Destination;
import com.AirSystem.Service.DestinationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DestinationController {

@Autowired
    private DestinationService destinationService;

@PostMapping("/destination")
    public Destination saveDestination(@RequestBody Destination destination)
{
    return destinationService.saveDestination(destination);
}

@GetMapping("/destination")
public List<Destination> getallDestination()
{
    return destinationService.getAllDestination();
}


@GetMapping("/destination/{id}")
public Destination getDestinationById(@PathVariable("id")Long destinationId)
    {
        return destinationService.getDestinationById(destinationId);
    }

@PutMapping("/destination/{id}")
public String updateDestinationbyId(@PathVariable("id") Long destinationId,
                                    @RequestBody Destination destination)
{
    destinationService.updateDestinationById(destinationId,destination);
    return "Destination is Update of Id : "+ destinationId;
}



@DeleteMapping("/destination/{id}")
public String deleteDestinationById(@PathVariable("id") Long destinationId)
{
    destinationService.deleteDestinationById(destinationId);
    return "Destination is Deleted of id : "+destinationId;
}



}
