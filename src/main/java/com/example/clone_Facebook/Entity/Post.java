package com.example.clone_Facebook.Entity;

import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.List;

@Entity(name="post")
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idPost;
    @OneToMany(mappedBy = "post")
    private List<Comment> commentList;
    @ManyToOne
    @JoinColumn(name = "idMode")
    private Mode mode;
    @OneToMany(mappedBy = "post")
    private List<EmotionPost> emotionPostList;
    @OneToMany(mappedBy = "post")
    private List<UserPost> userPostList;
    @OneToMany(mappedBy = "post")
    private List<PostUserGroup> postUserGroupList;
    @OneToMany(mappedBy = "post")
    private List<ImagePost> imagePostList;
    private String content;
    private Timestamp createAt;
    private Timestamp updateAt;
    private int numberEmotion;
    private int numberComment;
    private int numberShare;
    private int status;
    private int isDeleted;
    public Post() {}

    public Post(int idPost, List<Comment> commentList, Mode mode, List<EmotionPost> emotionPostList, List<UserPost> userPostList, List<PostUserGroup> postUserGroupList, List<ImagePost> imagePostList, String content, Timestamp createAt, Timestamp updateAt, int numberEmotion, int numberComment, int numberShare, int status, int isDeleted) {
        this.idPost = idPost;
        this.commentList = commentList;
        this.mode = mode;
        this.emotionPostList = emotionPostList;
        this.userPostList = userPostList;
        this.postUserGroupList = postUserGroupList;
        this.imagePostList = imagePostList;
        this.content = content;
        this.createAt = createAt;
        this.updateAt = updateAt;
        this.numberEmotion = numberEmotion;
        this.numberComment = numberComment;
        this.numberShare = numberShare;
        this.status = status;
        this.isDeleted = isDeleted;
    }

    public int getIdPost() {
        return idPost;
    }

    public void setIdPost(int idPost) {
        this.idPost = idPost;
    }

    public List<Comment> getCommentList() {
        return commentList;
    }

    public void setCommentList(List<Comment> commentList) {
        this.commentList = commentList;
    }

    public Mode getMode() {
        return mode;
    }

    public void setMode(Mode mode) {
        this.mode = mode;
    }

    public List<EmotionPost> getEmotionPostList() {
        return emotionPostList;
    }

    public void setEmotionPostList(List<EmotionPost> emotionPostList) {
        this.emotionPostList = emotionPostList;
    }

    public List<UserPost> getUserPostList() {
        return userPostList;
    }

    public void setUserPostList(List<UserPost> userPostList) {
        this.userPostList = userPostList;
    }

    public List<PostUserGroup> getPostUserGroupList() {
        return postUserGroupList;
    }

    public void setPostUserGroupList(List<PostUserGroup> postUserGroupList) {
        this.postUserGroupList = postUserGroupList;
    }

    public List<ImagePost> getImagePostList() {
        return imagePostList;
    }

    public void setImagePostList(List<ImagePost> imagePostList) {
        this.imagePostList = imagePostList;
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

    public int getNumberComment() {
        return numberComment;
    }

    public void setNumberComment(int numberComment) {
        this.numberComment = numberComment;
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

    public int getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(int isDeleted) {
        this.isDeleted = isDeleted;
    }
}
