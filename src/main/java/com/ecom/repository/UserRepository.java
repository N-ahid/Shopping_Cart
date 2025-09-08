package com.ecom.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecom.model.UserDtls;

import java.util.List;

public interface UserRepository extends JpaRepository<UserDtls, Integer> {
    public UserDtls findByEmail(String email);

    public List<UserDtls> findByRole(String role);

    public UserDtls findByResetToken(String token);

}