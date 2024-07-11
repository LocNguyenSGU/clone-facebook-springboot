package com.example.clone_Facebook.Repository;

import com.example.clone_Facebook.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    public List<User> findAll();
}
