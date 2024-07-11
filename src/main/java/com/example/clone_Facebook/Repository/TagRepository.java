package com.example.clone_Facebook.Repository;

import com.example.clone_Facebook.Entity.Tag;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TagRepository extends JpaRepository<Tag, Integer> {
    public List<Tag> findAll();
}
