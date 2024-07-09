package com.example.clone_Facebook.Entity;

import jakarta.persistence.*;

import java.util.List;

@Entity(name="tag")
public class Tag {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idTag;
    @OneToMany(mappedBy = "tag")
    private List<TagUserGroup> tagUserGroupList;
    private String name;
    private String description;
    private String isDeleted;

}
