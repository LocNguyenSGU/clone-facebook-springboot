package com.example.clone_Facebook.Service;

import com.example.clone_Facebook.DTO.FriendshipDTO;
import com.example.clone_Facebook.DTO.SignupDTO;
import com.example.clone_Facebook.DTO.UserDTO;
import com.example.clone_Facebook.Entity.Friendship;
import com.example.clone_Facebook.Entity.Mode;
import com.example.clone_Facebook.Entity.User;
import com.example.clone_Facebook.Repository.UserRepository;
import com.example.clone_Facebook.Service.Imp.UserServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
@Service
public class UserService implements UserServiceImp {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public List<UserDTO> getAllUser() {
        List<User> userList = userRepository.findAll();
        List<UserDTO> userDTOList = new ArrayList<>();
        for(User user : userList) {
            UserDTO userDTO = new UserDTO();
            userDTO.setIdUser(user.getIdUser());
            userDTO.setAvatar(user.getAvatar());
            userDTO.setCoverImage(user.getCoverImage());
            userDTO.setCreateAt(user.getCreateAt());
            userDTO.setDayOfBirth(user.getDayOfBirth());
            userDTO.setEmail(user.getEmail());
            userDTO.setFirstName(user.getFirstName());
            userDTO.setLastName(user.getLastName());
            userDTO.setNumberFriend(user.getNumberFriend());
            userDTO.setPassword(user.getPassword());
            userDTO.setPhone(user.getPhone());
            userDTO.setStatus(user.getStatus());
            userDTO.setUpdateAt(user.getUpdateAt());
            userDTO.setIdMode(user.getMode().getIdMode());
            userDTOList.add(userDTO);
        }
        return userDTOList;
    }

    @Override
    public UserDTO getFriendsUserByIdUser(int idUser) {
        User user = userRepository.findFriendsUserByIdUser(idUser);
        List<Friendship> friendshipList = user.getFriendshipList();
        List<FriendshipDTO> friendshipDTOList = new ArrayList<>();
        for(Friendship friendship : friendshipList) {
            FriendshipDTO friendshipDTO = new FriendshipDTO();
            friendshipDTO.setIdFriendship(friendship.getIdFriendship());
            friendshipDTO.setIdUser(friendship.getUser().getIdUser());
            friendshipDTO.setIdFriend(friendship.getFriend().getIdUser());
            friendshipDTO.setStatus(friendship.getStatus());
            friendshipDTO.setCreateAt(friendship.getCreateAt());
            friendshipDTOList.add(friendshipDTO);
        }
        final UserDTO userDTO = getUserDTO(user, friendshipDTOList);
        return userDTO;
    }

    @Override
    public UserDTO saveUser(SignupDTO signupDTO) {
        UserDTO userDTO = new UserDTO();
        try {
            User user = new User();
            user.setEmail(signupDTO.getEmail());
            user.setFirstName(signupDTO.getFirstName());
            user.setLastName(signupDTO.getLastName());
            user.setGender(signupDTO.getGender());
            user.setPassword(passwordEncoder.encode(signupDTO.getPassword()));
            user.setRole("user");
            user.setCreateAt(Timestamp.valueOf(LocalDateTime.now()));
            user.setUpdateAt(Timestamp.valueOf(LocalDateTime.now()));
            Mode mode = new Mode();
            mode.setIdMode(1);
            user.setMode(mode);
            userRepository.save(user);

            userDTO.setEmail(user.getEmail());
            userDTO.setPassword(user.getPassword());
            userDTO.setGender(user.getGender());
            userDTO.setFirstName(user.getFirstName());
            userDTO.setLastName(user.getLastName());
            userDTO.setRole(user.getRole());
            userDTO.setCreateAt(user.getCreateAt());
            userDTO.setUpdateAt(user.getUpdateAt());
            userDTO.setIdMode(user.getMode().getIdMode());
        } catch (Exception e) {
            // Log the error
            e.printStackTrace();

            // Return null or an appropriate response indicating failure
            return null;
        }
        return userDTO;
    }

    @Override
    public boolean findUserByEmail(String email) {
        User user = userRepository.findByEmail(email);
        if(user == null) {
            return false;
        }
        return true;
    }


    private static UserDTO getUserDTO(User user, List<FriendshipDTO> friendshipDTOList) {
        UserDTO userDTO = new UserDTO();
        userDTO.setIdUser(user.getIdUser());
        userDTO.setAvatar(user.getAvatar());
        userDTO.setCoverImage(user.getCoverImage());
        userDTO.setCreateAt(user.getCreateAt());
        userDTO.setDayOfBirth(user.getDayOfBirth());
        userDTO.setEmail(user.getEmail());
        userDTO.setFirstName(user.getFirstName());
        userDTO.setLastName(user.getLastName());
        userDTO.setNumberFriend(user.getNumberFriend());
        userDTO.setPassword(user.getPassword());
        userDTO.setPhone(user.getPhone());
        userDTO.setStatus(user.getStatus());
        userDTO.setUpdateAt(user.getUpdateAt());
        userDTO.setIdMode(user.getMode().getIdMode());
        userDTO.setFriendshipDTO(friendshipDTOList);
        return userDTO;
    }
}
