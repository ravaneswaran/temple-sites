package com.techsocialist.templesites.dao;

import com.techsocialist.templesites.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, String> {

    public User findByUuid(String uuid);

    /*public User findByUserName(String userName, String password);

    public User findByUniqueId(String uniqueId, String password);

    public User findByMobileNo(String mobileNo, String password);

    public User findByEmailId(String emailId, String password);*/

}
