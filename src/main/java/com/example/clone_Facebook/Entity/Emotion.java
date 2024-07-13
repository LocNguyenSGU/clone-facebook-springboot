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
    private String imageURL;
    private int isDeleted;

    public Emotion() {}
    public Emotion(int idEmotion, String name, String description, String imageURL, int isDeleted) {
        this.idEmotion = idEmotion;
        this.name = name;
        this.description = description;
        this.imageURL = imageURL;
        this.isDeleted = isDeleted;
    }

    public int getIdEmotion() {
        return idEmotion;
    }

    public void setIdEmotion(int idEmotion) {
        this.idEmotion = idEmotion;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return imageURL;
    }

    public void setImage(String image) {
        this.imageURL = image;
    }

    public int getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(int isDeleted) {
        this.isDeleted = isDeleted;
    }
}
