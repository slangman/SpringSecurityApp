package com.hustleind.ssapp.service;

/**
 * Service for Security.
 *
 * @author Vasya Pupkin
 * version 1.0
 */

public interface SecurityService {

    String findLoggedInUsername();

    void autoLogin(String username, String password);
}
