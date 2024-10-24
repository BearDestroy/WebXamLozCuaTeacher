package com.mycompany.Services;

import com.mycompany.Models.User;
import com.mycompany.Repository.UserRepository;
import com.mycompany.ServiceConstracts.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserService implements IUserService {
    private UserRepository userRepository;
    @Override
    public List<User> getAll() {
        return userRepository.findAll();
    }

    @Override
    public User getCustomerByEmail(String email) {
        return userRepository.findById(email).get();
    }

    @Override
    public Boolean create(User user) {
        try {
            this.userRepository.save(user);
            return null;
        }catch(Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public Boolean update(User user) {
        return null;
    }

    @Override
    public Boolean delete(User user) {
        return null;
    }
}
