package com.earblissbackend.service;


import com.earblissbackend.dto.LoginDTO;
import com.earblissbackend.dto.UserDTO;
import com.earblissbackend.entity.User;
import com.earblissbackend.responce.LoginResponse;

import java.util.List;

public interface UserService {


    List<User> getAllUsers();

    User findByUsernameAndPassword(String username, String password);

    String addUser(UserDTO userDTO);

    void LoginResponse(LoginDTO loginDTO);

    LoginResponse loginUser(LoginDTO loginDTO);
}
