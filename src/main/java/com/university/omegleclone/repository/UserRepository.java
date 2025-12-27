package com.university.omegleclone.repository;


import com.university.omegleclone.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

// This gives us ready-made methods like save(), findAll(), delete()
public interface UserRepository extends JpaRepository<User, Long> {

    // We define this custom method to find a user by their email
    Optional<User> findByEmail(String email);
}