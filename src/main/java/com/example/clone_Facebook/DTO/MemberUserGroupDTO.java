package com.example.clone_Facebook.DTO;

import com.example.clone_Facebook.Entity.User;
import com.example.clone_Facebook.Entity.UserGroup;
import jakarta.persistence.*;

import java.sql.Timestamp;

public class MemberUserGroupDTO {

    private int idMemberUserGroup;
    private int idUser;
    private int idUserGroup;
    private String role;
    private Timestamp joinedAt;
    private String status;
    private int isDeleted;

    public MemberUserGroupDTO() {

    }

    public MemberUserGroupDTO(int idMemberUserGroup, int idUser, int idUserGroup, String role, Timestamp joinedAt, String status, int isDeleted) {
        this.idMemberUserGroup = idMemberUserGroup;
        this.idUser = idUser;
        this.idUserGroup = idUserGroup;
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

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public int getIdUserGroup() {
        return idUserGroup;
    }

    public void setIdUserGroup(int idUserGroup) {
        this.idUserGroup = idUserGroup;
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
