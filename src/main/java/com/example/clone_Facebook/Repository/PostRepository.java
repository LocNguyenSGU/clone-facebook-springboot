package com.example.clone_Facebook.Repository;

import com.example.clone_Facebook.Entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface PostRepository extends JpaRepository<Post, Integer> {
    public List<Post> findAll();
}
