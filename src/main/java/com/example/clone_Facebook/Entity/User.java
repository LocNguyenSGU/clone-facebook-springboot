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

}
