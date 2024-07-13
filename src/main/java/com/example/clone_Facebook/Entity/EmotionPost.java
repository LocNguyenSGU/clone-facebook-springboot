package com.example.clone_Facebook.Entity;

import jakarta.persistence.*;

import java.sql.Timestamp;

@Entity(name = "emotionPost")
public class EmotionPost {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idEmotionPost;
    @OneToOne
    @JoinColumn(name="reacterId", referencedColumnName = "idUser")
    private User reacter;
    @OneToOne
    @JoinColumn(name="idEmotion", referencedColumnName = "idEmotion")
    private Emotion emotion;
    @ManyToOne
    @JoinColumn(name="idPost")
    private Post post;
    private Timestamp createAt;
    private Timestamp updateAt;
    private int isDeleted;
    public EmotionPost(){}
    public EmotionPost(int idEmotionPost, User reacter, Emotion emotion, Post post, Timestamp createAt, Timestamp updateAt, int isDeleted) {
        this.idEmotionPost = idEmotionPost;
        this.reacter = reacter;
        this.emotion = emotion;
        this.post = post;
        this.createAt = createAt;
        this.updateAt = updateAt;
        this.isDeleted = isDeleted;
    }

    public int getIdEmotionPost() {
        return idEmotionPost;
    }

    public void setIdEmotionPost(int idEmotionPost) {
        this.idEmotionPost = idEmotionPost;
    }

    public User getReacter() {
        return reacter;
    }

    public void setReacter(User reacter) {
        this.reacter = reacter;
    }

    public Emotion getEmotion() {
        return emotion;
    }

    public void setEmotion(Emotion emotion) {
        this.emotion = emotion;
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }

    public Timestamp getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Timestamp createAt) {
        this.createAt = createAt;
    }

    public Timestamp getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Timestamp updateAt) {
        this.updateAt = updateAt;
    }

    public int getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(int isDeleted) {
        this.isDeleted = isDeleted;
    }
}
