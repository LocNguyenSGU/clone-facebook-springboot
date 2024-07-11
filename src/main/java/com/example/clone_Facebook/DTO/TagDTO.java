package com.example.clone_Facebook.DTO;

public class TagDTO {
    private int idTag;
    private String name;
    private String description;
    private int isDeleted;
    public TagDTO() {}

    public TagDTO(int idTag, String name, String description, int isDeleted) {
        this.idTag = idTag;
        this.name = name;
        this.description = description;
        this.isDeleted = isDeleted;
    }

    public int getIdTag() {
        return idTag;
    }

    public void setIdTag(int idTag) {
        this.idTag = idTag;
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

    public int getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(int isDeleted) {
        this.isDeleted = isDeleted;
    }
}
