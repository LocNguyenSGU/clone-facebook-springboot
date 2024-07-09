package com.example.clone_Facebook.Entity;

import jakarta.persistence.*;

@Entity(name="imagePost")
public class ImagePost {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idImagePost;
    @ManyToOne
    @JoinColumn(name="idPost")
    private Post post;
    private String imageURL;
    private int isDeleted;
}
