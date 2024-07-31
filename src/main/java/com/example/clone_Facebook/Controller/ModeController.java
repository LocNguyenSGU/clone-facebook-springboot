package com.example.clone_Facebook.Controller;

import com.example.clone_Facebook.DTO.ModeDTO;
import com.example.clone_Facebook.Payload.ResponseData;
import com.example.clone_Facebook.Service.Imp.ModeServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/mode")
public class ModeController {
    @Autowired
    private ModeServiceImp modeServiceImp;
    @GetMapping
    public ResponseEntity<?> getAllMode() {
        ResponseData responseData = new ResponseData();
        List<ModeDTO> modeDTOList = modeServiceImp.getAllMode();
        if(modeDTOList.size() > 0) {
            responseData.setData(modeDTOList);
            responseData.setMessage("lay tat ca cac mode");
            responseData.setStatus(200);
        } else {
            responseData.setData("");
            responseData.setMessage("lay tat ca cac mode khong duoc, hoac khong co mode de lay");
            responseData.setStatus(400);
        }
        return new ResponseEntity<>(responseData, HttpStatus.OK);
    }

}
