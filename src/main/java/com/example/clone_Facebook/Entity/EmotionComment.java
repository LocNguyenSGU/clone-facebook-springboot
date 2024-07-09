package com.example.clone_Facebook.Entity;

import jakarta.persistence.*;

import java.sql.Timestamp;

@Entity(name = "emotionComment")
public class EmotionComment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idEmotionComment;
    @OneToOne
    @JoinColumn(name="reacterId", referencedColumnName = "idUser")
    private User reacter;
    @OneToOne
    @JoinColumn(name="idEmotion", referencedColumnName = "idEmotion")
    private Emotion emotion;
    @ManyToOne
    @JoinColumn(name="idPost")
    private Post post;
    @ManyToOne
    @JoinColumn(name="idComment")
    private Comment comment;
    private Timestamp createAt;
    private Timestamp updateAt;
    private int isDeleted;
}
