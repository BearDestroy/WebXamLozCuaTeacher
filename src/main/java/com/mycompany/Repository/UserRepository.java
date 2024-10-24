package com.mycompany.Repository;

import com.mycompany.Models.Category;
import com.mycompany.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,String> {
}
