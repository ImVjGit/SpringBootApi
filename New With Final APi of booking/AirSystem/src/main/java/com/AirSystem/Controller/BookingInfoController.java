package com.AirSystem.Controller;

import com.AirSystem.Entity.*;
import com.AirSystem.Service.BookingInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.AirSystem.Service.*;

import java.text.ParseException;

@RestController
public class BookingInfoController {
    @Autowired
    private BookingInfoService bookingInfoService;

    @Autowired
    private CustomerService customerService;


    @PutMapping("/Booking/{id}")
    public String SaveBooking(@PathVariable("id") Long id,
                              @RequestBody BookingInfo bookingInfo) throws ParseException {
//       long id1 = customerService.getCustomerbyId(id).getCustomerId();
//        if()
        String rs = bookingInfoService.saveBookInfo(id, bookingInfo);
        if (rs.equalsIgnoreCase("Found")) {
            return "Booking Created";
        }


        return "invalid id plz Check the id ";
    }
}
