package com.techsocialist.dao;

import com.techsocialist.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, String> {

    public User findByUuid(String uuid);

}
