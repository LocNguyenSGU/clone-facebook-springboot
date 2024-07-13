package com.example.clone_Facebook.Repository;

import com.example.clone_Facebook.Entity.Comment;
import com.example.clone_Facebook.Entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface CommentRepository extends JpaRepository<Comment, Integer> {
    public List<Comment> findByPost_idPost(int idPost);
}
