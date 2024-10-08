package com.earblissbackend.entity;

import jakarta.persistence.*;
import org.apache.coyote.Response;
import org.aspectj.bridge.Message;


@Entity
@Table(name = "user")
public   class User {
    @Id

    @Column(name = "userid",length = 45)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int userid;

    @Column(name = "username",length = 255)
    private String username;

    @Column(name = "email",length = 255)
    private String email;

    @Column(name = "password",length = 255)
    private String password;


    public User(String email, String password, int userid, String username) {
        this.email = email;
        this.password = password;
        this.userid = userid;
        this.username = username;
    }

    public User(int userid, String username, String email, String encode) {


        this.username = username;
        this.email = email;
        this.password = encode;

    }

    public User() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "User{" +
                "email='" + email + '\'' +
                ", userid=" + userid +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }


    public boolean isPresent() {
        return userid != 0;
    }
}
