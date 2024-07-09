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
}
