package com.example.clone_Facebook.Entity;

import jakarta.persistence.*;

@Entity(name = "tagUserGroup")
public class TagUserGroup {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idTagUserGroup;
    @ManyToOne
    @JoinColumn(name="idUserGroup")
    private UserGroup userGroup;
    @ManyToOne
    @JoinColumn(name="idTag")
    private Tag tag;
    private int isDeleted;
}
