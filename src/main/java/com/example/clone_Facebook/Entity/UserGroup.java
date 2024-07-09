package com.example.clone_Facebook.Entity;

import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.List;

@Entity(name="userGroup")
public class UserGroup {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idUserGroup;
    @OneToMany(mappedBy = "userGroup")
    private List<MemberUserGroup> memberUserGroupList;
    @OneToMany(mappedBy = "userGroup")
    private List<TagUserGroup> tagUserGroupList;
    private String name;
    private String description;
    private Timestamp createAt;
    private Timestamp updateAt;
    private int numberMember;
    @ManyToOne
    @JoinColumn(name="idMode")
    private Mode mode;
    @OneToMany(mappedBy = "userGroup")
    private List<PostUserGroup> postUserGroupList;
    private int isDeleted;

}
