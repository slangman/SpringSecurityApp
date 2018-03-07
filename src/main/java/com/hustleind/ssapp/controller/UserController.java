package com.hustleind.ssapp.controller;

import com.hustleind.ssapp.model.User;
import com.hustleind.ssapp.service.SecurityService;
import com.hustleind.ssapp.service.UserService;
import com.hustleind.ssapp.validator.UserValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Controller for {@link User}'s pages.
 *
 * @author Vasya Pupkin
 * @version 1.0
 */

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private SecurityService securityService;

    @Autowired
    private UserValidator userValidator;

    @RequestMapping(value = "/registration", method = RequestMethod.GET)
    public String registration (Model model) {
        model.addAttribute("userForm", new User());
        return "registration";
    }

    /*
    @RequestMapping(value = "/registration", method = RequestMethod.GET)
    public String registration(@ModelAttribute("userForm") User userForm, BindingResult bindingResult, Model model) {
        userValidator.validate(userForm, bindingResult);

        if (bindingResult.hasErrors()) {
            return "registration";
        }

        userService.save(userForm);
        securityService.autoLogin(userForm.getUsername(), userForm.getConfirmPassword());
        return "redirect:/welcome.jsp";
    }
    */


    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    public String login(Model model, String error, String logout) {

        if (error != null) {
            model.addAttribute("error", "Username or password incorrect");
        }

        if (logout !=null) {
            model.addAttribute("message", "Logged out");
        }

        return "login";
    }

    @RequestMapping(value = {"/", "/welcome"}, method = RequestMethod.GET)
    public String welcome (Model model) {
        return "welcome";
    }

    @RequestMapping(value = "/admin", method = RequestMethod.GET)
    public String admin(Model admin) {
        return "admin";
    }

}

