package com.springJwt.SpringJwt.repository;

import com.springJwt.SpringJwt.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
    User findByUsername(String username);
}
