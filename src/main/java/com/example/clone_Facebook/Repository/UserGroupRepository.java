package com.example.clone_Facebook.Repository;

import com.example.clone_Facebook.Entity.UserGroup;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserGroupRepository extends JpaRepository<UserGroup, Integer> {
    public List<UserGroup> findAll();
}
