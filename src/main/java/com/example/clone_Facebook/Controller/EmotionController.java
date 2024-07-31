package com.example.clone_Facebook.Controller;

import com.example.clone_Facebook.DTO.EmotionDTO;
import com.example.clone_Facebook.DTO.ModeDTO;
import com.example.clone_Facebook.Payload.ResponseData;
import com.example.clone_Facebook.Service.Imp.EmotionServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/emotion")
public class EmotionController {
    @Autowired
    private EmotionServiceImp emotionServiceImp;
    @GetMapping
    public ResponseEntity<?> getAllEmotion() {
        ResponseData responseData = new ResponseData();
        List<EmotionDTO> emotionDTOList = emotionServiceImp.getAllEmotion();
        if(emotionDTOList.size() > 0) {
            responseData.setData(emotionDTOList);
            responseData.setMessage("lay tat ca cac emotion");
            responseData.setStatus(200);
        } else {
            responseData.setData("");
            responseData.setMessage("lay tat ca cac emotion khong duoc, hoac khong co emotion de lay");
            responseData.setStatus(400);
        }
        return new ResponseEntity<>(responseData, HttpStatus.OK);
    }
}
