package com.AirSystem.Controller;

import com.AirSystem.Entity.Buyer;
import com.AirSystem.Entity.Source;
import com.AirSystem.Service.SourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SourceController {


    @Autowired
    private SourceService sourceService;

@PostMapping("/source")
    public Source saveSource(@RequestBody Source source)
{
   return sourceService.saveSource(source);
}


@GetMapping("/source")
public List<Source> getAllSource()
{
    return sourceService.getAllSource();
}

@GetMapping("/source/{id}")
    public Source getSourceById(@PathVariable("id")Long sourceId)
{
    return sourceService.getSourceById(sourceId);
}


   @DeleteMapping("/source/{id}")
    public String deleteSourceById(@PathVariable("id")Long sourceId)
{
     sourceService.deleteSourceById(sourceId);
    return "Deleted Source of id : "+sourceId;
}

@PutMapping("/source/{id}")
    public String updateSourceById(@PathVariable("id")Long sourceId,
                                   @RequestBody Source source)
{
    sourceService.updateSourceById(sourceId,source);
    return "source Is Updated of Id : "+sourceId;
}



}
