package com.techsocialist.templesites.controllers.mvc;

import com.techsocialist.templesites.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.Date;

@Controller
public class RegistrationController {

    @Autowired
    private UserService userService;

    @PostMapping("/registration/site")
    public String registerSite(
            @RequestParam(name="siteName", required=false, defaultValue="")String siteName,
            @RequestParam(name="status", required=false, defaultValue="")String status,
            @RequestParam(name="createdDate", required=false, defaultValue="")Date createdDate,
            @RequestParam(name="modifiedDate", required=false, defaultValue="")Date modifiedDate){
        return null;
    }

    @PostMapping("/registration/site-admin")
    public String registerSiteAdmin(
            @RequestParam(name="site", required=false, defaultValue="")String site,
            @RequestParam(name="firstName", required=false, defaultValue="")String firstName,
            @RequestParam(name="lastName", required=false, defaultValue="")String lastName,
            @RequestParam(name="emailId", required=false, defaultValue="")String emailId,
            @RequestParam(name="password", required=false, defaultValue="")String password,
            @RequestParam(name="confirmPassword", required=false, defaultValue="")String confirmPassword,
            @RequestParam(name="mobileNo", required=false, defaultValue="")String mobileNo,
            @RequestParam(name="uniqueId", required=false, defaultValue="")String uniqueId,
            @RequestParam(name="role", required=false, defaultValue="Site-Admin")String role){

        System.out.println("----------------------->>>>>> "+site);
        System.out.println("----------------------->>>>>> "+firstName);
        System.out.println("----------------------->>>>>> "+lastName);
        System.out.println("----------------------->>>>>> "+emailId);
        System.out.println("----------------------->>>>>> "+password);
        System.out.println("----------------------->>>>>> "+confirmPassword);
        System.out.println("----------------------->>>>>> "+mobileNo);
        System.out.println("----------------------->>>>>> "+uniqueId);
        System.out.println("----------------------->>>>>> "+mobileNo);
        System.out.println("----------------------->>>>>> "+role);

        Object returnVal = this.userService.saveUser(firstName, lastName, emailId, password, mobileNo, uniqueId, mobileNo, role);
        if(null != returnVal){
            return "registration";
        } else {
            return "test";
        }
    }
}
