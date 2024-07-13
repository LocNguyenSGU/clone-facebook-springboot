package com.example.clone_Facebook.DTO;

import com.example.clone_Facebook.Entity.EmotionPost;

import java.sql.Timestamp;

public class EmotionPostDTO {
    private int idEmotionPost;
    private Timestamp createAt;
    private int isDeleted;
    private Timestamp updateAt;
    private int idEmotion;
    private int idPost;
    private int reacterId;
    public EmotionPostDTO() {}

    public EmotionPostDTO(int idEmotionPost, Timestamp createAt, int isDeleted, Timestamp updateAt, int idEmotion, int idPost, int reacterId) {
        this.idEmotionPost = idEmotionPost;
        this.createAt = createAt;
        this.isDeleted = isDeleted;
        this.updateAt = updateAt;
        this.idEmotion = idEmotion;
        this.idPost = idPost;
        this.reacterId = reacterId;
    }

    public int getIdEmotionPost() {
        return idEmotionPost;
    }

    public void setIdEmotionPost(int idEmotionPost) {
        this.idEmotionPost = idEmotionPost;
    }

    public Timestamp getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Timestamp createAt) {
        this.createAt = createAt;
    }

    public int getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(int isDeleted) {
        this.isDeleted = isDeleted;
    }

    public Timestamp getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Timestamp updateAt) {
        this.updateAt = updateAt;
    }

    public int getIdEmotion() {
        return idEmotion;
    }

    public void setIdEmotion(int idEmotion) {
        this.idEmotion = idEmotion;
    }

    public int getIdPost() {
        return idPost;
    }

    public void setIdPost(int idPost) {
        this.idPost = idPost;
    }

    public int getReacterId() {
        return reacterId;
    }

    public void setReacterId(int reacterId) {
        this.reacterId = reacterId;
    }
}
