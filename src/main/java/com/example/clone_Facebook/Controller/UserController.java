package com.example.clone_Facebook.Controller;

import com.example.clone_Facebook.DTO.TagDTO;
import com.example.clone_Facebook.DTO.UserDTO;
import com.example.clone_Facebook.Payload.ResponseData;
import com.example.clone_Facebook.Service.Imp.UserServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserServiceImp userServiceImp;
    @GetMapping
    public ResponseEntity<?> getAllUser() {
        ResponseData responseData = new ResponseData();
        List< UserDTO> userDTOList = userServiceImp.getAllUser();
        if(userDTOList.size() > 0) {
            responseData.setData(userDTOList);
            responseData.setMessage("Get all user");
            responseData.setStatus(200);
        }else {
            responseData.setData("");
            responseData.setMessage("Get all user that bai. hoac khong co data");
            responseData.setStatus(400);
        }
        return new ResponseEntity<>(responseData, HttpStatus.OK);
    }
    @GetMapping("/{idUser}/friends")
    public ResponseEntity<?> getFriendsUserByIdUser(@PathVariable int idUser) {
        ResponseData responseData = new ResponseData();
        UserDTO userDTO = userServiceImp.getFriendsUserByIdUser(idUser);
        if(userDTO != null) {
            responseData.setData(userDTO);
            responseData.setMessage("Get friends user");
            responseData.setStatus(200);
        }else {
            responseData.setData("");
            responseData.setMessage("Get friends user that bai. hoac khong co data");
            responseData.setStatus(400);
        }
        return new ResponseEntity<>(responseData, HttpStatus.OK);
    }
}
