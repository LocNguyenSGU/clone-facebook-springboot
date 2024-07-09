package com.example.clone_Facebook.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name="emotion")
public class Emotion {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idEmotion;
    private String name;
    private String description;
    private String image;
    private String isDeleted;

}
