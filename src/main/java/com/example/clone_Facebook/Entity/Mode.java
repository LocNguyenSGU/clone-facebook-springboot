package com.example.clone_Facebook.Entity;

import jakarta.persistence.*;

import java.util.List;
import java.util.Set;

@Entity(name="mode")
public class Mode {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idMode;
    @Column(name = "name")
    private String name;
    @Column(name = "description")

    private String description;
    @Column(name="imageURL")
    private String imageURL;
    @Column(name="isDeleted")
    private int isDeleted;
    @OneToMany(mappedBy = "mode")
    private List<User> userList;
    @OneToMany(mappedBy = "mode")
    private List<Post> postList;
    @OneToMany(mappedBy = "mode")
    private List<UserGroup> userGroupList;

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

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    public List<Post> getPostList() {
        return postList;
    }

    public void setPostList(List<Post> postList) {
        this.postList = postList;
    }

    public List<UserGroup> getUserGroupList() {
        return userGroupList;
    }

    public void setUserGroupList(List<UserGroup> userGroupList) {
        this.userGroupList = userGroupList;
    }
}
