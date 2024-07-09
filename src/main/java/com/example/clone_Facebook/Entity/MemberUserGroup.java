package com.example.clone_Facebook.Entity;

import jakarta.persistence.*;

import java.sql.Timestamp;

@Entity(name="memberUserGroup")
public class MemberUserGroup {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idMemberUserGroup;
    @ManyToOne
    @JoinColumn(name = "idUser")
    private User user;
    @ManyToOne
    @JoinColumn(name = "idUserGroup")
    private UserGroup userGroup;
    private String role;
    private Timestamp joinedAt;
    private String status;
    private int isDeleted;

}
