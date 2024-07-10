package com.example.clone_Facebook.DTO;

public class ModeDTO {
    private int idMode;
    private String name;
    private String description;
    private String imageURL;
    private int isDeleted;
    public ModeDTO() {

    }

    public ModeDTO(int idMode, String name, String description, String imageURL, int isDeleted) {
        this.idMode = idMode;
        this.name = name;
        this.description = description;
        this.imageURL = imageURL;
        this.isDeleted = isDeleted;
    }

    public int getIdMode() {
        return idMode;
    }

    public void setIdMode(int idMode) {
        this.idMode = idMode;
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
