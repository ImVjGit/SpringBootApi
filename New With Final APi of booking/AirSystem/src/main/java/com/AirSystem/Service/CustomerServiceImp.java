package com.AirSystem.Service;

import com.AirSystem.Entity.Customer;
import com.AirSystem.Repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class CustomerServiceImp implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;
    @Override
    public Customer saveCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public List<Customer> getAllCustomer() {

        List<Customer> data = customerRepository.findAll();
    return data;
    }

    @Override
    public Customer getCustomerbyId(Long customerId) {
        return customerRepository.findById(customerId).get();
    }

    @Override
    public void deleteCustomerinfoById(Long customerId) {
        customerRepository.deleteById(customerId);
    }

    @Override
    public void updateCustomerById(Long customerId, Customer customer) {
        Customer c = customerRepository.findById(customerId).get();
        if(Objects.nonNull(customer.getCustomerName())&& !"".equalsIgnoreCase(customer.getCustomerName()))
        {
            c.setCustomerName(customer.getCustomerName());
        }
        if(Objects.nonNull(customer.getCustomerPassword())&& !"".equalsIgnoreCase(customer.getCustomerPassword()))
        {
            c.setCustomerPassword(customer.getCustomerPassword());
        }
        if(Objects.nonNull(customer.getCustomerEmail())&& !"".equalsIgnoreCase(customer.getCustomerEmail()))
        {
            c.setCustomerEmail(customer.getCustomerEmail());
        }
        customerRepository.save(c);

    }
}
