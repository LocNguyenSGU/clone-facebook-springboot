package com.example.clone_Facebook.DTO;

import java.sql.Timestamp;

public class CommentDTO {
    private int idComment;
    private String content;
    private Timestamp createAt;
    private int idParentComment;
    private int isDeleted;
    private int numberEmotion;
    private int numberReply;
    private Timestamp updateAt;
    private int idPost;
    public CommentDTO() {}

    public CommentDTO(int idComment, String content, Timestamp createAt, int idParentComment, int isDeleted, int numberEmotion, int numberReply, Timestamp updateAt, int idPost) {
        this.idComment = idComment;
        this.content = content;
        this.createAt = createAt;
        this.idParentComment = idParentComment;
        this.isDeleted = isDeleted;
        this.numberEmotion = numberEmotion;
        this.numberReply = numberReply;
        this.updateAt = updateAt;
        this.idPost = idPost;
    }

    public int getIdComment() {
        return idComment;
    }

    public void setIdComment(int idComment) {
        this.idComment = idComment;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Timestamp getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Timestamp createAt) {
        this.createAt = createAt;
    }

    public int getIdParentComment() {
        return idParentComment;
    }

    public void setIdParentComment(int idParentComment) {
        this.idParentComment = idParentComment;
    }

    public int getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(int isDeleted) {
        this.isDeleted = isDeleted;
    }

    public int getNumberEmotion() {
        return numberEmotion;
    }

    public void setNumberEmotion(int numberEmotion) {
        this.numberEmotion = numberEmotion;
    }

    public int getNumberReply() {
        return numberReply;
    }

    public void setNumberReply(int numberReply) {
        this.numberReply = numberReply;
    }

    public Timestamp getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Timestamp updateAt) {
        this.updateAt = updateAt;
    }

    public int getIdPost() {
        return idPost;
    }

    public void setIdPost(int idPost) {
        this.idPost = idPost;
    }
}
