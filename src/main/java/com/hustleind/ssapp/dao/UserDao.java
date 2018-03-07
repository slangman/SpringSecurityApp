package com.hustleind.ssapp.dao;

import com.hustleind.ssapp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User, Long> {
    User findByUsername (String username);
}
