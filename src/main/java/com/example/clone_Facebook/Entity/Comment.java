package com.example.clone_Facebook.Entity;

import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.List;

@Entity(name="comment")
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idComment;
    @ManyToOne
    @JoinColumn(name="idPost")
    private Post post;
    @ManyToOne
    @JoinColumn(name="idUser")
    private User user;
    private int idParentComment;
    @OneToMany(mappedBy = "comment")
    private List<EmotionComment> emotionCommentList;
    @OneToMany(mappedBy = "comment")
    private List<ImageComment> imageCommentList;
    private String content;
    private Timestamp createAt;
    private Timestamp updateAt;
    private int numberEmotion;
    private int numberReply;
    private int isDeleted;
    public Comment() {}

    public Comment(int idComment, Post post, User user, int idParentComment, List<EmotionComment> emotionCommentList, List<ImageComment> imageCommentList, String content, Timestamp createAt, Timestamp updateAt, int numberEmotion, int numberReply, int isDeleted) {
        this.idComment = idComment;
        this.post = post;
        this.user = user;
        this.idParentComment = idParentComment;
        this.emotionCommentList = emotionCommentList;
        this.imageCommentList = imageCommentList;
        this.content = content;
        this.createAt = createAt;
        this.updateAt = updateAt;
        this.numberEmotion = numberEmotion;
        this.numberReply = numberReply;
        this.isDeleted = isDeleted;
    }

    public int getIdComment() {
        return idComment;
    }

    public void setIdComment(int idComment) {
        this.idComment = idComment;
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getIdParentComment() {
        return idParentComment;
    }

    public void setIdParentComment(int idParentComment) {
        this.idParentComment = idParentComment;
    }

    public List<EmotionComment> getEmotionCommentList() {
        return emotionCommentList;
    }

    public void setEmotionCommentList(List<EmotionComment> emotionCommentList) {
        this.emotionCommentList = emotionCommentList;
    }

    public List<ImageComment> getImageCommentList() {
        return imageCommentList;
    }

    public void setImageCommentList(List<ImageComment> imageCommentList) {
        this.imageCommentList = imageCommentList;
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

    public Timestamp getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Timestamp updateAt) {
        this.updateAt = updateAt;
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

    public int getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(int isDeleted) {
        this.isDeleted = isDeleted;
    }
}
