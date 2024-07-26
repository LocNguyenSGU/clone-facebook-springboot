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
    public UserGroup() {

    }

    public UserGroup(int idUserGroup, List<MemberUserGroup> memberUserGroupList, List<TagUserGroup> tagUserGroupList, String name, String description, Timestamp createAt, Timestamp updateAt, int numberMember, Mode mode, List<PostUserGroup> postUserGroupList, int isDeleted) {
        this.idUserGroup = idUserGroup;
        this.memberUserGroupList = memberUserGroupList;
        this.tagUserGroupList = tagUserGroupList;
        this.name = name;
        this.description = description;
        this.createAt = createAt;
        this.updateAt = updateAt;
        this.numberMember = numberMember;
        this.mode = mode;
        this.postUserGroupList = postUserGroupList;
        this.isDeleted = isDeleted;
    }

    public int getIdUserGroup() {
        return idUserGroup;
    }

    public void setIdUserGroup(int idUserGroup) {
        this.idUserGroup = idUserGroup;
    }

    public List<MemberUserGroup> getMemberUserGroupList() {
        return memberUserGroupList;
    }

    public void setMemberUserGroupList(List<MemberUserGroup> memberUserGroupList) {
        this.memberUserGroupList = memberUserGroupList;
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

    public Timestamp getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Timestamp createAt) {
        this.createAt = createAt;
    }

    public Timestamp getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Timestamp updateAt) {
        this.updateAt = updateAt;
    }

    public int getNumberMember() {
        return numberMember;
    }

    public void setNumberMember(int numberMember) {
        this.numberMember = numberMember;
    }

    public Mode getMode() {
        return mode;
    }

    public void setMode(Mode mode) {
        this.mode = mode;
    }

    public List<PostUserGroup> getPostUserGroupList() {
        return postUserGroupList;
    }

    public void setPostUserGroupList(List<PostUserGroup> postUserGroupList) {
        this.postUserGroupList = postUserGroupList;
    }

    public int getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(int isDeleted) {
        this.isDeleted = isDeleted;
    }
}
