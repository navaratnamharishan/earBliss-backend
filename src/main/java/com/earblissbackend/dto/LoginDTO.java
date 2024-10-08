package com.earblissbackend.dto;

public class LoginDTO {

        private String username;
        private String password;

    public LoginDTO() {
    }

    public LoginDTO(String password, String username) {
        this.password = password;
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "LoginDTO{" +
                "password='" + password + '\'' +
                ", username='" + username + '\'' +
                '}';
    }
}
