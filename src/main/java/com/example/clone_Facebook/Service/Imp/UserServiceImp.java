package com.example.clone_Facebook.Service.Imp;

import com.example.clone_Facebook.DTO.SignupDTO;
import com.example.clone_Facebook.DTO.UserDTO;

import java.util.List;

public interface UserServiceImp {
    public List<UserDTO> getAllUser();
    public UserDTO getFriendsUserByIdUser(int idUser);
    public UserDTO saveUser(SignupDTO signupDTO);
    public boolean findUserByEmail(String email);
}
