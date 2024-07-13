package com.example.clone_Facebook.DTO;

public class EmotionDTO {
    private int idEmotion;
    private String name;
    private String description;
    private String imageURL;
    private int isDeleted;
    public EmotionDTO() {}

    public EmotionDTO(int idEmotion, String name, String description, String imageURL, int isDeleted) {
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

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public int getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(int isDeleted) {
        this.isDeleted = isDeleted;
    }
}
