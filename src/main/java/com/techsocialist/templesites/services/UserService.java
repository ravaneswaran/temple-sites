package com.techsocialist.templesites.services;

import com.techsocialist.templesites.models.User;
import org.springframework.stereotype.Component;

@Component
public interface UserService {

    public User saveUser(
            String site,
            String firstName,
            String lastName,
            String emailId,
            String password,
            String mobileNo,
            String uniqueId,
            String role);

}
