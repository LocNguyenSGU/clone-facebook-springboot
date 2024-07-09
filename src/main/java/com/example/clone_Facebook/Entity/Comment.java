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
}
