package com.example.clone_Facebook.Controller;

import com.example.clone_Facebook.DTO.ModeDTO;
import com.example.clone_Facebook.DTO.PostDTO;
import com.example.clone_Facebook.Payload.ResponseData;
import com.example.clone_Facebook.Service.Imp.PostServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping("/post")
@Controller
public class PostController {
    @Autowired
    private PostServiceImp postServiceImp;
    @GetMapping("/getall")
    public ResponseEntity<?> getAllPost() {
        ResponseData responseData = new ResponseData();
        List<PostDTO> postDTOList = postServiceImp.getAllPost();
        if(postDTOList.size() > 0) {
            responseData.setData(postDTOList);
            responseData.setMessage("lay tat ca cac post");
            responseData.setStatus(200);
        } else {
            responseData.setData("");
            responseData.setMessage("lay tat ca cac post khong duoc, hoac khong co post de lay");
            responseData.setStatus(400);
        }
        return new ResponseEntity<>(responseData, HttpStatus.OK);
    }
}
