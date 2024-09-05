package com.example.clone_Facebook.DTO;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

public class UserDTO {
    private int idUser;
    private String avatar;
    private String coverImage;
    private Timestamp createAt;
    private Date dayOfBirth;
    private String email;
    private String firstName;
    private String lastName;
    private int numberFriend;
    private String password;
    private String phone;
    private String gender;
    private int status;
    private Timestamp updateAt;
    private int idMode;
    private String role;
    private List<FriendshipDTO> friendshipDTOList;

    public UserDTO() {
    }

    public UserDTO(int idUser, String avatar, String coverImage, Timestamp createAt, Date dayOfBirth, String email, String firstName, String lastName, int numberFriend, String password, String phone, String gender, int status, Timestamp updateAt, int idMode, String role, List<FriendshipDTO> friendshipDTOList) {
        this.idUser = idUser;
        this.avatar = avatar;
        this.coverImage = coverImage;
        this.createAt = createAt;
        this.dayOfBirth = dayOfBirth;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.numberFriend = numberFriend;
        this.password = password;
        this.phone = phone;
        this.gender = gender;
        this.status = status;
        this.updateAt = updateAt;
        this.idMode = idMode;
        this.role = role;
        this.friendshipDTOList = friendshipDTOList;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getCoverImage() {
        return coverImage;
    }

    public void setCoverImage(String coverImage) {
        this.coverImage = coverImage;
    }

    public Timestamp getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Timestamp createAt) {
        this.createAt = createAt;
    }

    public Date getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(Date dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getNumberFriend() {
        return numberFriend;
    }

    public void setNumberFriend(int numberFriend) {
        this.numberFriend = numberFriend;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Timestamp getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Timestamp updateAt) {
        this.updateAt = updateAt;
    }

    public int getIdMode() {
        return idMode;
    }

    public void setIdMode(int idMode) {
        this.idMode = idMode;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public List<FriendshipDTO> getFriendshipDTOList() {
        return friendshipDTOList;
    }

    public void setFriendshipDTOList(List<FriendshipDTO> friendshipDTOList) {
        this.friendshipDTOList = friendshipDTOList;
    }
}