package com.example.clone_Facebook.Service;

import com.example.clone_Facebook.DTO.UserDTO;
import com.example.clone_Facebook.Entity.User;
import com.example.clone_Facebook.Repository.UserRepository;
import com.example.clone_Facebook.Service.Imp.UserServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class UserService implements UserServiceImp {
    @Autowired
    private UserRepository userRepository;
    @Override
    public List<UserDTO> getAllUser() {
        List<User> userList = userRepository.findAll();
        List<UserDTO> userDTOList = new ArrayList<>();
        for(User user : userList) {
            UserDTO userDTO = new UserDTO();
            userDTO.setIdUser(user.getIdUser());
            userDTO.setAvatar(user.getAvatar());
            userDTO.setCoverImage(user.getCoverImage());
            userDTO.setCreateAt(user.getCreateAt());
            userDTO.setDayOfBirth(user.getDayOfBirth());
            userDTO.setEmail(user.getEmail());
            userDTO.setFirstName(user.getFirstName());
            userDTO.setLastName(user.getLastName());
            userDTO.setNumberFriend(user.getNumberFriend());
            userDTO.setPassword(user.getPassword());
            userDTO.setPhone(user.getPhone());
            userDTO.setStatus(user.getStatus());
            userDTO.setUpdateAt(user.getUpdateAt());
            userDTO.setIdMode(user.getMode().getIdMode());
            userDTOList.add(userDTO);
        }
        return userDTOList;
    }
}
