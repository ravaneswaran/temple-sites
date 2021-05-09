package com.techsocialist.templesites.daos;

import com.techsocialist.templesites.models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, String> {}
