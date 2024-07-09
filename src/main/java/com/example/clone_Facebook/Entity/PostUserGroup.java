package com.example.clone_Facebook.Entity;

import jakarta.persistence.*;

@Entity(name="postUserGroup")
public class PostUserGroup {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int postUserGroup;
    @ManyToOne
    @JoinColumn(name="idPost")
    private Post post;
    @ManyToOne
    @JoinColumn(name="idUserGroup")
    private UserGroup userGroup;
    private int isDeleted;

}
