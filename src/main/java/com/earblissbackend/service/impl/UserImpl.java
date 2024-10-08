package com.earblissbackend.service.impl;


import com.earblissbackend.dto.LoginDTO;
import com.earblissbackend.dto.UserDTO;
import com.earblissbackend.entity.User;
import com.earblissbackend.repository.UserRepository;
import com.earblissbackend.responce.LoginResponse;
import com.earblissbackend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import static jdk.internal.org.jline.utils.InfoCmp.Capability.user1;


@Service
public  class UserImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;


    @Override
    public List<User> getAllUsers() {
        return List.of();
    }

    @Override
    public User findByUsernameAndPassword(String username, String password) {
        return null;
    }

    @Override
    public String addUser(UserDTO userDTO) {

        User user = new User(
                userDTO.getUserid(),
                userDTO.getUsername(),
                userDTO.getEmail(),


                this.passwordEncoder.encode(userDTO.getPassword())

        );
        userRepository.save(user);


        return user.getUsername();
    }

    @Override
    public void LoginResponse(LoginDTO loginDTO) {

    }

    @Override
    public LoginResponse loginUser(LoginDTO loginDTO) {
        User user = userRepository.findByUsername(loginDTO.getUsername());
        if (user != null) {
            String password = loginDTO.getPassword();
            String encodedPassword = user.getPassword();
            boolean isPwdRight = passwordEncoder.matches(password, encodedPassword);
            if (isPwdRight) {
                // Assuming you want to return a token or user information
                return new LoginResponse("Login Success", true); // You might want to include a token here
            }
        }
        return new LoginResponse("Login Failed", false);
    }

}









