package com.earblissbackend.repository;


import com.earblissbackend.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository

public interface UserRepository extends JpaRepository<User,Integer> {

Optional<User> findByUsernameAndPassword(String username, String password);

    User findByUsername(String username);
}
