package com.AirSystem.Entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BookingInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long bookingId;

//    @OneToOne
//            (fetch = FetchType.EAGER)
//    @JoinColumn(name = "Cust_id",nullable = false,foreignKey = @ForeignKey(name = "FK_Cust_key"))
//    private Customer customer;
    private Long customerId;


    private String customerName;
    private String customerEmail;

    private String sourceName ;
    private String destinationName;
 //  private long flightid;
    private String flightName;

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone="India/Kolkata" )
    private Date flightDate;


    private double price;



}
