package com.example.clone_Facebook.Controller;

import com.example.clone_Facebook.DTO.CommentDTO;
import com.example.clone_Facebook.Payload.ResponseData;
import com.example.clone_Facebook.Service.Imp.CommentServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/post")
public class CommentController {
    @Autowired
    private CommentServiceImp commentServiceImp;
    @GetMapping("/{idPost}/comments")
    public ResponseEntity<?> getCommentsByIdPost(@PathVariable int idPost) {
        ResponseData responseData = new ResponseData();
        List<CommentDTO> commentDTOList = commentServiceImp.getCommentsByIdPost(idPost);
        if(commentDTOList.size() > 0) {
            responseData.setData(commentDTOList);
            responseData.setMessage("lay tat ca cac comment theo idPost");
            responseData.setStatus(200);
        } else {
            responseData.setData("");
            responseData.setMessage("lay tat ca cac comment theo idPost khong duoc, hoac khong co comments de lay");
            responseData.setStatus(400);
        }
        return new ResponseEntity<>(responseData, HttpStatus.OK);
    }
}
