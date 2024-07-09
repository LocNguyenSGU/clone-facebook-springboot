package com.example.clone_Facebook.Entity;

import jakarta.persistence.*;

@Entity(name="imageComment")
public class ImageComment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idImageComment;
    @ManyToOne
    @JoinColumn(name="idPost")
    private Post post;
    @ManyToOne
    @JoinColumn(name="idComment")
    private Comment comment;
    private String imageURL;
    private int isDeleted;
}
