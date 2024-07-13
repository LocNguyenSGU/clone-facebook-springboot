package com.example.clone_Facebook.Entity;

import jakarta.persistence.*;

import java.sql.Timestamp;

@Entity(name="friendship")
public class Friendship {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idFriendship;
    @ManyToOne
    @JoinColumn(name="idUser")
    private User user;
    @ManyToOne
    @JoinColumn(name="idFriend")
    private User friend;
    private Timestamp createAt;
    private String status;
    private int isDeleted;
    public Friendship() {}

    public Friendship(int idFriendship, User user, User friend, Timestamp createAt, String status, int isDeleted) {
        this.idFriendship = idFriendship;
        this.user = user;
        this.friend = friend;
        this.createAt = createAt;
        this.status = status;
        this.isDeleted = isDeleted;
    }

    public int getIdFriendship() {
        return idFriendship;
    }

    public void setIdFriendship(int idFriendship) {
        this.idFriendship = idFriendship;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public User getFriend() {
        return friend;
    }

    public void setFriend(User friend) {
        this.friend = friend;
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

    public int getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(int isDeleted) {
        this.isDeleted = isDeleted;
    }
}
