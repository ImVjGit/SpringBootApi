package com.AirSystem.Service;

import com.AirSystem.Entity.*;
import com.AirSystem.Repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class BookingInfoImpl implements BookingInfoService{
    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private BookingInfoRepository bookingInfoRepository;
    @Override
    public String saveBookInfo(Long id, BookingInfo bookingInfo) throws ParseException {
        Customer  customer = customerRepository.findById(id).get();
        String nmm= bookingInfo.getSourceName();
        BookingInfo bb = new BookingInfo();
        if(customer.getCustomerId()==id)
        {
            bb.setCustomerId(customer.getCustomerId());
            bb.setCustomerName(customer.getCustomerName());
            bb.setCustomerEmail(customer.getCustomerEmail());
        }
        else
        {
            return "customer Not Found ";
        }
        bb.setSourceName(bookingInfo.getSourceName());
        bb.setDestinationName(bookingInfo.getDestinationName());
        bb.setFlightName(bookingInfo.getFlightName());
        bb.setPrice(bookingInfo.getPrice());

        bb.setFlightDate(bookingInfo.getFlightDate());
        bookingInfoRepository.save(bb);
        return "Found";
    }



}
