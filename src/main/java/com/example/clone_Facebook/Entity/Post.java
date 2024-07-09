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
}
