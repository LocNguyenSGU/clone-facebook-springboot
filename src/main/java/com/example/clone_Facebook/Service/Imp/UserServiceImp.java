package com.example.clone_Facebook.Service.Imp;

import com.example.clone_Facebook.DTO.UserDTO;

import java.util.List;

public interface UserServiceImp {
    public List<UserDTO> getAllUser();
    public UserDTO getFriendsUserByIdUser(int idUser);
}
