package com.finaldatabasewebapp.shoppingapp.controller.User;

import com.finaldatabasewebapp.shoppingapp.model.User.User;
import com.finaldatabasewebapp.shoppingapp.service.User.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user")
@CrossOrigin
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/add")
    public String add(@RequestBody User user){
        userService.addUser(user);
        return "User added";
    }

    @GetMapping("/getAll")
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }

    @PostMapping("/get")
    public Optional<User> getUser(int id){
        return userService.getUser(id);
    }
}
