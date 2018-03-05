package com.hustleind.ssapp.dao;

import com.hustleind.ssapp.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleDao extends JpaRepository<Role, Long> {
}
