package com.techsocialist.templesites.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PasswordController {

    @GetMapping("/user/change-password")
    public String changePassword(
            @RequestParam(name="newPassword", required=false, defaultValue="")String newPassword,
            @RequestParam(name="confirmPassword", required=false, defaultValue="")String confirmPassword){
        return null;
    }

    @GetMapping("/user/forgot-password")
    public String forgotPassword(
            @RequestParam(name="newPassword", required=false, defaultValue="")String newPassword){
        return null;
    }

}
