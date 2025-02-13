package com.telusko.SpringSecEx.repo;

import com.telusko.SpringSecEx.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<Users, Integer> {
    Users findByUsername(String username);
}
