package com.example.clone_Facebook.Controller;

import com.example.clone_Facebook.DTO.CommentDTO;
import com.example.clone_Facebook.Payload.ResponseData;
import com.example.clone_Facebook.Security.Jwt.JwtUtils;
import com.example.clone_Facebook.Service.Imp.LoginServiceImp;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.io.Encoders;
import io.jsonwebtoken.security.Keys;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.crypto.SecretKey;
import java.util.List;

@Controller
@RequestMapping("/auth")
public class AuthController {
    @Autowired
    private LoginServiceImp loginServiceImp;
    @Autowired
    private JwtUtils jwtUtils;
    @PostMapping("/login")
    public ResponseEntity<?> login(String email, String password) {
        ResponseData responseData = new ResponseData();
        if(loginServiceImp.checkLogin(email, password)) {
            responseData.setMessage("login success");
            responseData.setData(jwtUtils.generateToken(email));
        }else {
            responseData.setMessage("login failed");
            responseData.setData("");
        }
        return new ResponseEntity<>(responseData, HttpStatus.OK);
    }
}
