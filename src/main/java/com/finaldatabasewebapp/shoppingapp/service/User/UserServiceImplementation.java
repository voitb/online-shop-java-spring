package com.finaldatabasewebapp.shoppingapp.service.User;

import com.finaldatabasewebapp.shoppingapp.model.User.User;
import com.finaldatabasewebapp.shoppingapp.repository.User.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImplementation implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public User addUser(User user){
        return userRepository.save(user);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public Optional<User> getUser(int id) {
        Optional<User> returnedUser = userRepository.findById(id);
        return userRepository.findById(id);
    }
}
