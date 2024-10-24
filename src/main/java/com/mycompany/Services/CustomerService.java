package com.mycompany.Services;

import com.mycompany.Models.Customer;
import com.mycompany.Repository.CustomerRepository;
import com.mycompany.ServiceConstracts.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CustomerService implements ICustomerService {
    @Autowired
    private CustomerRepository customerRepository;
    @Override
    public List<Customer> getAll() {
        return customerRepository.findAll();
    }

    @Override
    public Customer getCustomerById(int id) {
        return customerRepository.findById(id).get();
    }

    @Override
    public Boolean create(Customer customer) {
        try {
            this.customerRepository.save(customer);
            return null;
        }catch(Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public Boolean update(Customer customer) {
        return null;
    }

    @Override
    public Boolean delete(Customer customer) {
        return null;
    }
}
