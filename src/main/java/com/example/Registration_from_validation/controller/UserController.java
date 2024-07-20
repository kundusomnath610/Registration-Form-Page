package com.example.Registration_from_validation.controller;

import com.example.Registration_from_validation.model.User;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

    @GetMapping("/registration")
    public String getRegPage(@ModelAttribute("user") User user) {
        return "register";
    }

    @PostMapping("/registration")
    public String saveUser(@Valid User user, Errors errors) {
        if(errors.hasErrors()) {
            return "register";
        }

        return "success";
    }

}
