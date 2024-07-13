package com.example.clone_Facebook.DTO;

import java.sql.Timestamp;

public class FriendshipDTO {
    private int idFriendship;
    private int idUser;
    private int idFriend;
    private Timestamp createAt;
    private String status;
    public FriendshipDTO(){}

    public FriendshipDTO(int idFriendship, int idUser, int idFriend, Timestamp createAt, String status) {
        this.idFriendship = idFriendship;
        this.idUser = idUser;
        this.idFriend = idFriend;
        this.createAt = createAt;
        this.status = status;
    }

    public int getIdFriendship() {
        return idFriendship;
    }

    public void setIdFriendship(int idFriendship) {
        this.idFriendship = idFriendship;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public int getIdFriend() {
        return idFriend;
    }

    public void setIdFriend(int idFriend) {
        this.idFriend = idFriend;
    }

    public Timestamp getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Timestamp createAt) {
        this.createAt = createAt;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
