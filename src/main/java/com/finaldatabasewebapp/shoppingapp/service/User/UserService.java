package com.finaldatabasewebapp.shoppingapp.service.User;

import com.finaldatabasewebapp.shoppingapp.model.User.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    public User addUser(User user);
    public List<User> getAllUsers();
    public Optional<User> getUser(int id);
}
