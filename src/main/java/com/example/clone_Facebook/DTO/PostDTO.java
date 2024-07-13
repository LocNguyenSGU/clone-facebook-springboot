package com.example.clone_Facebook.DTO;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;

public class PostDTO {
    private int idPost;
    private String content;
    private Timestamp createdAt;
    private int numberComment;
    private int numberEmotion;
    private int numberShare;
    private int status;
    private Timestamp updatedAt;
    private int isDeleted;
    private List<UserPostDTO> userPostDTOList;
    private List<EmotionPostDTO> emotionPostDTOList;
    public PostDTO() {}

    public PostDTO(int idPost, String content, Timestamp createdAt, int numberComment, int numberEmotion, int numberShare, int status, Timestamp updatedAt, List<UserPostDTO> userPostDTOList, List<EmotionPostDTO> emotionPostDTOList,int isDeleted) {
        this.idPost = idPost;
        this.content = content;
        this.createdAt = createdAt;
        this.numberComment = numberComment;
        this.numberEmotion = numberEmotion;
        this.numberShare = numberShare;
        this.status = status;
        this.updatedAt = updatedAt;
        this.isDeleted = isDeleted;
        this.userPostDTOList = userPostDTOList;
        this.emotionPostDTOList = emotionPostDTOList;
    }

    public int getIdPost() {
        return idPost;
    }

    public void setIdPost(int idPost) {
        this.idPost = idPost;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    public int getNumberComment() {
        return numberComment;
    }

    public void setNumberComment(int numberComment) {
        this.numberComment = numberComment;
    }

    public int getNumberEmotion() {
        return numberEmotion;
    }

    public void setNumberEmotion(int numberEmotion) {
        this.numberEmotion = numberEmotion;
    }

    public int getNumberShare() {
        return numberShare;
    }

    public void setNumberShare(int numberShare) {
        this.numberShare = numberShare;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Timestamp getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
    }

    public int getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(int isDeleted) {
        this.isDeleted = isDeleted;
    }

    public List<UserPostDTO> getUserPostDTOList() {
        return userPostDTOList;
    }

    public void setUserPostDTOList(List<UserPostDTO> userPostDTOList) {
        this.userPostDTOList = userPostDTOList;
    }

    public List<EmotionPostDTO> getEmotionPostDTOList() {
        return emotionPostDTOList;
    }

    public void setEmotionPostDTOList(List<EmotionPostDTO> emotionPostDTOList) {
        this.emotionPostDTOList = emotionPostDTOList;
    }
}
