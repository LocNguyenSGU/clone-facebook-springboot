package com.example.clone_Facebook.Controller;

import com.example.clone_Facebook.DTO.CommentDTO;
import com.example.clone_Facebook.DTO.LoginDTO;
import com.example.clone_Facebook.DTO.SignupDTO;
import com.example.clone_Facebook.DTO.UserDTO;
import com.example.clone_Facebook.Entity.User;
import com.example.clone_Facebook.Payload.ResponseData;
import com.example.clone_Facebook.Security.Jwt.JwtUtils;
import com.example.clone_Facebook.Service.Imp.LoginServiceImp;
import com.example.clone_Facebook.Service.Imp.UserServiceImp;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.io.Encoders;
import io.jsonwebtoken.security.Keys;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.crypto.SecretKey;
import java.util.List;

@Controller
@RequestMapping("/auth")
public class AuthController {
    @Autowired
    private LoginServiceImp loginServiceImp;
    @Autowired
    private UserServiceImp userServiceImp;
    @Autowired
    private JwtUtils jwtUtils;
    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody LoginDTO loginDTO) {
        ResponseData responseData = new ResponseData();
        if(loginServiceImp.checkLogin(loginDTO.getEmail(), loginDTO.getPassword())) {
            responseData.setMessage("login success");
            responseData.setData(jwtUtils.generateToken(loginDTO.getEmail()));
        }else {
            responseData.setMessage("login failed");
            responseData.setData("");
        }
        return new ResponseEntity<>(responseData, HttpStatus.OK);
    }
    @PostMapping("/signup")
    public ResponseEntity<?> signup(@Valid @RequestBody SignupDTO signupDTO) {
        ResponseData responseData = new ResponseData();
        try {
            if(userServiceImp.findUserByEmail(signupDTO.getEmail())) {
                responseData.setMessage("Email already exists");
                responseData.setData("");
                return new ResponseEntity<>(responseData, HttpStatus.BAD_REQUEST);
            }
            UserDTO userDTO = userServiceImp.saveUser(signupDTO);
            if(userDTO == null) {
                responseData.setMessage("Signup failed");
                responseData.setData("");
                return new ResponseEntity<>(responseData, HttpStatus.INTERNAL_SERVER_ERROR);
            }
            responseData.setMessage("Signup success");
            responseData.setData(userDTO);
        }catch (Exception e) {
            e.printStackTrace();
            responseData.setMessage("An error occurred during signup");
            responseData.setData("");
        }
        return new ResponseEntity<>(responseData, HttpStatus.OK);
    }
}
