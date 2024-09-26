package com.earblissbackend.controller;



import com.earblissbackend.dto.LoginDTO;
import com.earblissbackend.dto.UserDTO;
import com.earblissbackend.entity.User;
import com.earblissbackend.responce.LoginResponse;
import com.earblissbackend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/api")


public class UserController {

@Autowired
private UserService userService;

@PostMapping("/register")
    public String saveUser(@RequestBody UserDTO userDTO)
{
    return userService.addUser(userDTO);
}



    @PostMapping("/login")
    public ResponseEntity<LoginResponse> login(@RequestBody LoginDTO loginDTO) {
        LoginResponse response = userService.loginUser(loginDTO);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
    //Registration end point

    /*














































    @PostMapping("/register/{username}")
    public String registerUser(@RequestBody User user) {
        User foundUser=userRepository.findByUsernameAndPassword(user.getUsername(), user.getPassword());
    return foundUser !=null ? foundUser.getUsername():null;
    }*/
}
