package com.example.clone_Facebook.DTO;

import java.sql.Timestamp;
import java.util.List;

public class UserGroupDTO {
    private int idUserGroup;
    private String name;
    private String description;
    private Timestamp createAt;
    private Timestamp updateAt;
    private int numberMember;
    private int idMode;
    private int isDeleted;
    private List<MemberUserGroupDTO> memberUserGroupDTOList;

    public UserGroupDTO() {

    }

    public UserGroupDTO(int idUserGroup, String name, String description, Timestamp createAt, Timestamp updateAt, int numberMember, int idMode, int isDeleted, List<MemberUserGroupDTO> memberUserGroupDTOList) {
        this.idUserGroup = idUserGroup;
        this.name = name;
        this.description = description;
        this.createAt = createAt;
        this.updateAt = updateAt;
        this.numberMember = numberMember;
        this.idMode = idMode;
        this.isDeleted = isDeleted;
        this.memberUserGroupDTOList = memberUserGroupDTOList;
    }

    public List<MemberUserGroupDTO> getMemberUserGroupDTOList() {
        return memberUserGroupDTOList;
    }

    public void setMemberUserGroupDTOList(List<MemberUserGroupDTO> memberUserGroupDTOList) {
        this.memberUserGroupDTOList = memberUserGroupDTOList;
    }

    public int getIdUserGroup() {
        return idUserGroup;
    }

    public void setIdUserGroup(int idUserGroup) {
        this.idUserGroup = idUserGroup;
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

    public int getIdMode() {
        return idMode;
    }

    public void setIdMode(int idMode) {
        this.idMode = idMode;
    }

    public int getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(int isDeleted) {
        this.isDeleted = isDeleted;
    }
}
