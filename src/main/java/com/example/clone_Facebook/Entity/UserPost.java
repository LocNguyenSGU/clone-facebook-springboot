package com.example.clone_Facebook.Entity;

import jakarta.persistence.*;

@Entity(name="userPost")
public class UserPost {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idUserPost;
    @ManyToOne
    @JoinColumn(name="idUser")
    private User user;
    @ManyToOne
    @JoinColumn(name="idPost")
    private Post post;
    private int isDeleted;
}
