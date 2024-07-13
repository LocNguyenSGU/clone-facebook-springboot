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
    private int isManPoster;
    private int isDeleted;

    public UserPost() {}
    public UserPost(int idUserPost, User user, Post post, int isManPoster, int isDeleted) {
        this.idUserPost = idUserPost;
        this.user = user;
        this.post = post;
        this.isManPoster = isManPoster;
        this.isDeleted = isDeleted;
    }

    public int getIdUserPost() {
        return idUserPost;
    }

    public void setIdUserPost(int idUserPost) {
        this.idUserPost = idUserPost;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }

    public int getIsManPoster() {
        return isManPoster;
    }

    public void setIsManPoster(int manPoster) {
        isManPoster = manPoster;
    }

    public int getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(int isDeleted) {
        this.isDeleted = isDeleted;
    }
}
