package com.example.clone_Facebook.Controller;

import com.example.clone_Facebook.DTO.TagDTO;
import com.example.clone_Facebook.Payload.ResponseData;
import com.example.clone_Facebook.Service.Imp.TagServiceImp;
import com.example.clone_Facebook.Service.TagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/tag")
public class TagController {
    @Autowired
    private TagServiceImp tagServiceImp;
    @GetMapping("/getall")
    public ResponseEntity<?> getAllTag() {
        ResponseData responseData = new ResponseData();
        List<TagDTO> tagDTOList = tagServiceImp.getAllTag();
        if(tagDTOList.size() > 0) {
            responseData.setData(tagDTOList);
            responseData.setMessage("Get all tag");
            responseData.setStatus(200);
        }else {
            responseData.setData("");
            responseData.setMessage("Get all tag that bai. hoac khong co data");
            responseData.setStatus(400);
        }
        return new ResponseEntity<>(responseData, HttpStatus.OK);
    }
}
