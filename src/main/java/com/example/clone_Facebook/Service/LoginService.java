package com.example.clone_Facebook.Service;

import com.example.clone_Facebook.Entity.User;
import com.example.clone_Facebook.Repository.UserRepository;
import com.example.clone_Facebook.Service.Imp.LoginServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class LoginService implements LoginServiceImp {
    @Autowired
    private PasswordEncoder passwordEncoder;
    @Autowired
    private UserRepository userRepository;

    @Override
    public boolean checkLogin(String email, String password) {
        User user = userRepository.findByEmail(email);
        return passwordEncoder.matches(password, user.getPassword());
    }

}
