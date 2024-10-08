package com.example.clone_Facebook.Entity;

import jakarta.persistence.*;

import java.util.List;

@Entity(name="tag")
public class Tag {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTag;
    @OneToMany(mappedBy = "tag")
    private List<TagUserGroup> tagUserGroupList;
    private String name;
    private String description;
    private int isDeleted;
    public Tag() {
    }

    public Tag(int idTag, List<TagUserGroup> tagUserGroupList, String name, String description, int isDeleted) {
        this.idTag = idTag;
        this.tagUserGroupList = tagUserGroupList;
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

    public List<TagUserGroup> getTagUserGroupList() {
        return tagUserGroupList;
    }

    public void setTagUserGroupList(List<TagUserGroup> tagUserGroupList) {
        this.tagUserGroupList = tagUserGroupList;
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
