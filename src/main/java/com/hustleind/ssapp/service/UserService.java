package com.hustleind.ssapp.service;

import com.hustleind.ssapp.model.User;

/**
 * Service class for {@link User )}
 *
 * @author Vasya Pupkin
 * @version 1.0
 */

public interface UserService {
    void save (User user);
    User findByUsername(String username);

}
