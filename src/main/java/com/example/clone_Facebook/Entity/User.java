package com.example.clone_Facebook.Entity;

import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

@Entity(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUser;
    @ManyToOne
    @JoinColumn(name="idMode")
    private Mode mode;
    @OneToMany(mappedBy = "user")
    private List<Comment> commentList;
    @OneToMany(mappedBy = "user")
    private List<Friendship> friendshipList;
    @OneToMany(mappedBy = "user")
    List<UserPost> userPostList;
    @OneToMany(mappedBy = "user")
    List<MemberUserGroup> memberUserGroupList;
//    @OneToMany(mappedBy = "user")
    @Column(name="firstName")
    private String firstName;
    @Column(name="lastName")
    private String lastName;
    @Column(name="phone")
    private String phone;
    @Column(name="sex")
    private String sex;
    @Column(name="email")

    private String email;
    @Column(name="password")

    private String password;
    @Column(name="dayOfBirth")

    private Date dayOfBirth;
    @Column(name="avatar")

    private String avatar;
    @Column(name="coverImage")

    private String coverImage;
    @Column(name="numberFriend")

    private int numberFriend;
    @Column(name="createAt")

    private Timestamp createAt;
    @Column(name="updateAT")

    private Timestamp updateAt;
    @Column(name="status")

    private int status;
    @Column(name="role")
    private String role;

    public User() {}

    public User(int idUser, Mode mode, List<Comment> commentList, List<Friendship> friendshipList, List<UserPost> userPostList, List<MemberUserGroup> memberUserGroupList, String firstName, String lastName, String phone, String email, String password, Date dayOfBirth, String avatar, String coverImage, int numberFriend, Timestamp createAt, Timestamp updateAt, int status, String sex, String role) {
        this.idUser = idUser;
        this.mode = mode;
        this.commentList = commentList;
        this.friendshipList = friendshipList;
        this.userPostList = userPostList;
        this.memberUserGroupList = memberUserGroupList;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.email = email;
        this.password = password;
        this.dayOfBirth = dayOfBirth;
        this.avatar = avatar;
        this.coverImage = coverImage;
        this.numberFriend = numberFriend;
        this.createAt = createAt;
        this.updateAt = updateAt;
        this.status = status;
        this.sex=sex;
        this.role = role;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public Mode getMode() {
        return mode;
    }

    public void setMode(Mode mode) {
        this.mode = mode;
    }

    public List<Comment> getCommentList() {
        return commentList;
    }

    public void setCommentList(List<Comment> commentList) {
        this.commentList = commentList;
    }

    public List<Friendship> getFriendshipList() {
        return friendshipList;
    }

    public void setFriendshipList(List<Friendship> friendshipList) {
        this.friendshipList = friendshipList;
    }

    public List<UserPost> getUserPostList() {
        return userPostList;
    }

    public void setUserPostList(List<UserPost> userPostList) {
        this.userPostList = userPostList;
    }

    public List<MemberUserGroup> getMemberUserGroupList() {
        return memberUserGroupList;
    }

    public void setMemberUserGroupList(List<MemberUserGroup> memberUserGroupList) {
        this.memberUserGroupList = memberUserGroupList;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(Date dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
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

    public int getNumberFriend() {
        return numberFriend;
    }

    public void setNumberFriend(int numberFriend) {
        this.numberFriend = numberFriend;
    }

    public Timestamp getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Timestamp createAt) {
        this.createAt = createAt;
    }

    public Timestamp getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Timestamp updateAt) {
        this.updateAt = updateAt;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
