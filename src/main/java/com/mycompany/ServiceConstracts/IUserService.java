package com.mycompany.ServiceConstracts;

import com.mycompany.Models.Customer;
import com.mycompany.Models.User;

import java.util.List;

public interface IUserService {
    List<User> getAll();
    User getCustomerByEmail(String email);
    Boolean create(User user);
    Boolean update(User user);
    Boolean delete(User user);
}
