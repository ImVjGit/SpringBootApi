package com.AirSystem.Repository;

import com.AirSystem.Entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Long> {
    static Customer findByEmail(String email)
        {

            return CustomerRepository.findByEmail(email);
    }


}
