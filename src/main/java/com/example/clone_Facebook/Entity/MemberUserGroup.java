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
    public MemberUserGroup() {

    }

    public MemberUserGroup(int idMemberUserGroup, User user, UserGroup userGroup, String role, Timestamp joinedAt, String status, int isDeleted) {
        this.idMemberUserGroup = idMemberUserGroup;
        this.user = user;
        this.userGroup = userGroup;
        this.role = role;
        this.joinedAt = joinedAt;
        this.status = status;
        this.isDeleted = isDeleted;
    }

    public int getIdMemberUserGroup() {
        return idMemberUserGroup;
    }

    public void setIdMemberUserGroup(int idMemberUserGroup) {
        this.idMemberUserGroup = idMemberUserGroup;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public UserGroup getUserGroup() {
        return userGroup;
    }

    public void setUserGroup(UserGroup userGroup) {
        this.userGroup = userGroup;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Timestamp getJoinedAt() {
        return joinedAt;
    }

    public void setJoinedAt(Timestamp joinedAt) {
        this.joinedAt = joinedAt;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(int isDeleted) {
        this.isDeleted = isDeleted;
    }
}
