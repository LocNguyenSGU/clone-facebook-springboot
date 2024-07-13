package com.example.clone_Facebook.Service.Imp;

import com.example.clone_Facebook.DTO.CommentDTO;

import java.util.List;

public interface CommentServiceImp {
    public List<CommentDTO> getCommentsByIdPost(int idPost);
}
