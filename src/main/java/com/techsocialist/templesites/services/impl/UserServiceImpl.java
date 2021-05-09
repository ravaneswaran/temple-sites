package com.techsocialist.templesites.services.impl;

import com.techsocialist.templesites.daos.UserRepository;
import com.techsocialist.templesites.models.User;
import com.techsocialist.templesites.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User saveUser(
            String site,
            String firstName,
            String lastName,
            String emailId,
            String password,
            String mobileNo,
            String uniqueId,
            String role) {

        User user = new User();

        user.setFirstName(firstName);
        user.setLastName(lastName);
        user.setEmailId(emailId);
        user.setPassword(password);
        user.setMobileNo(mobileNo);
        user.setUniqueId(uniqueId);
        Date newDate = new Date();
        user.setModifiedDate(newDate);
        user.setCreatedDate(newDate);

        this.userRepository.save(user);

        return user;
    }
}
