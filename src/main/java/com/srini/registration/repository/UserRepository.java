package com.srini.registration.repository;

import com.srini.registration.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
     // User findByID(int id);

       User findUserByEmail(String email);
}
