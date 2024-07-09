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


}
