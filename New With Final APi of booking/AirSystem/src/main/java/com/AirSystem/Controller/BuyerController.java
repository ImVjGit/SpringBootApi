package com.AirSystem.Controller;

import com.AirSystem.Entity.Buyer;
import com.AirSystem.Service.BuyerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BuyerController {

    @Autowired
    private BuyerService buyerService ;

    //-------------------------------Create Buyer---------------------------------------------
    @PostMapping("/buyer")
    public Buyer saveBuyer(@RequestBody Buyer buyer)
    {
        return buyerService.saveBuyer(buyer);
    }

    //------------------------------Get All Buyer --------------------------------------------
    @GetMapping("/buyer")
    public List<Buyer> getallBuyer()
    {
        return buyerService.getAllBuyer();
    }

    //----------------------------Get Buyer Info by One Id -----------------------------------
    @GetMapping("/buyer/{id}")
    public Buyer getBuyerbybuyerId(@PathVariable("id") Long buyerId)
    {
        return buyerService.getBuyerbybuyerId(buyerId);
    }

    //----------------------------Delete Buyer info By Id -------------------------------------

    @DeleteMapping("/buyer/{id}")
    public String deleteBuyerinfoById(@PathVariable("id")Long buyerId)
    {
        buyerService.deleteBuyerinfoById(buyerId);
        return "Deleted Buyer Info of id :"+ buyerId;
    }


    //----------------------------Update Buyer info By Id

    @PutMapping("/buyer/{id}")
    public String UpdateBuyerinfoById(@PathVariable("id")Long buyerId,
                                      @RequestBody Buyer buyer)
    {
        buyerService.UpdateBuyerinfoById(buyerId,buyer);
        return "User Updated of id : "+buyerId;
    }


}
