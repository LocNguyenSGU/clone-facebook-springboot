package com.example.clone_Facebook.Controller;

import com.example.clone_Facebook.DTO.ModeDTO;
import com.example.clone_Facebook.DTO.UserGroupDTO;
import com.example.clone_Facebook.Payload.ResponseData;
import com.example.clone_Facebook.Service.Imp.UserGroupServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/usergroup")
public class UserGroupController {
    @Autowired
    private UserGroupServiceImp userGroupServiceImp;
    @GetMapping
    public ResponseEntity<?> getAllUserGroup() {
        ResponseData responseData = new ResponseData();
       List< UserGroupDTO> userGroupDTOList = userGroupServiceImp.getAllUserGroup();
        if(userGroupDTOList.size() > 0) {
            responseData.setData(userGroupDTOList);
            responseData.setMessage("lay tat ca cac user group");
            responseData.setStatus(200);
        } else {
            responseData.setData("");
            responseData.setMessage("lay tat ca cac user group khong duoc, hoac khong co user group de lay");
            responseData.setStatus(400);
        }
        return new ResponseEntity<>(responseData, HttpStatus.OK);
    }
}
