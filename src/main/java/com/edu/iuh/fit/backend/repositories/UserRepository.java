package com.edu.iuh.fit.backend.repositories;

import com.edu.iuh.fit.backend.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    List<User> findByEmailAndPasswordHash(String email, String passwordHash);
}