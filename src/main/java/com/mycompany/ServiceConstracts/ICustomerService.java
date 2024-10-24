package com.mycompany.ServiceConstracts;

import com.mycompany.Models.Category;
import com.mycompany.Models.Customer;

import java.util.List;

public interface ICustomerService {
    List<Customer> getAll();
    Customer getCustomerById(int id);
    Boolean create(Customer customer);
    Boolean update(Customer customer);
    Boolean delete(Customer customer);
}
