package com.AirSystem.Service;

import com.AirSystem.Entity.*;

import java.text.ParseException;

public interface BookingInfoService {
   // String saveBookInfo(Long id, BookingInfo bookingInfo);

    String saveBookInfo(Long id,BookingInfo bookingInfo) throws ParseException;

  //  String saveBookInfo(Long id, Customer customer, BookingInfo bookingInfo, Source source, Destination destination, Flight flight);
}
