package com.techsocialist.templesites.controllers.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String login(
            @RequestParam(name="userName", required=false, defaultValue="nouser")String userName,
            @RequestParam(name="password", required=false, defaultValue="nopassword")String password){
        return null;
    }
}
