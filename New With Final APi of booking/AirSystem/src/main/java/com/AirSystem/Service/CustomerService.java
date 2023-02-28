package com.AirSystem.Service;

import com.AirSystem.Entity.Buyer;
import com.AirSystem.Entity.Customer;

import java.util.List;

public interface CustomerService {
    public Customer saveCustomer(Customer customer);
    public List<Customer> getAllCustomer();
    public Customer getCustomerbyId(Long customerId);
    public void deleteCustomerinfoById(Long customerId);
    public void updateCustomerById(Long customerId,Customer customer);
}
