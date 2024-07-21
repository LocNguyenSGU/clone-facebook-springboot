package com.example.clone_Facebook.Service.Imp;

import com.example.clone_Facebook.DTO.PostDTO;

import java.util.List;

public interface PostServiceImp {
    public List<PostDTO> getAllPost();
    public List<PostDTO> findByIsDeletedAndMode_idMode(int isDeleted, int idMode);
}
