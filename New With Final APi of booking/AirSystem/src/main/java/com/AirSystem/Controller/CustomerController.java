package com.AirSystem.Controller;

import com.AirSystem.Entity.Customer;
import com.AirSystem.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @PostMapping("/customer")
    public Customer saveCustomer(@RequestBody  Customer customer){
      return   customerService.saveCustomer(customer);
    }

    @GetMapping("/customer")
    public List<Customer> getCustomer()
    {
        return   customerService.getAllCustomer();
    }

    @GetMapping("/customer/{id}")
    public Customer getCustomerById(@PathVariable("id") Long customerId)
    {
        return customerService.getCustomerbyId(customerId);
    }

    @DeleteMapping("/customer/{id}")
    public String deleteCustomerById(@PathVariable("id") Long customerId)
    {
        customerService.deleteCustomerinfoById(customerId);
        return "Customer Deleted of Id : "+customerId;
    }

    @PutMapping("/customer/{id}")
    public String UpdateCustomerById(@PathVariable("id") Long customerId,
                                       @RequestBody Customer customer)
    {
        customerService.updateCustomerById(customerId,customer);
        return "Customer Info Updated of id : " +customerId;
    }







}
