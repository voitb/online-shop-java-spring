package com.finaldatabasewebapp.shoppingapp.repository.User;

import com.finaldatabasewebapp.shoppingapp.model.User.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}
