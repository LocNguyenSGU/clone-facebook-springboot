package com.example.clone_Facebook.Service;

import com.example.clone_Facebook.DTO.MemberUserGroupDTO;
import com.example.clone_Facebook.DTO.UserGroupDTO;
import com.example.clone_Facebook.Entity.MemberUserGroup;
import com.example.clone_Facebook.Entity.UserGroup;
import com.example.clone_Facebook.Repository.UserGroupRepository;
import com.example.clone_Facebook.Service.Imp.UserGroupServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserGroupService implements UserGroupServiceImp {
    @Autowired
    private UserGroupRepository userGroupRepository;

    @Override
    public List<UserGroupDTO> getAllUserGroup() {
        List<UserGroup> userGroupList = userGroupRepository.findAll();
        List<UserGroupDTO> userGroupDTOList = new ArrayList<>();
        for(UserGroup userGroup : userGroupList) {
            UserGroupDTO userGroupDTO = new UserGroupDTO();
            userGroupDTO.setIdUserGroup(userGroup.getIdUserGroup());
            userGroupDTO.setName(userGroup.getName());
            userGroupDTO.setDescription(userGroup.getDescription());
            userGroupDTO.setCreateAt(userGroup.getCreateAt());
            userGroupDTO.setUpdateAt(userGroup.getUpdateAt());
            userGroupDTO.setNumberMember(userGroup.getNumberMember());
            List<MemberUserGroup> memberUserGroupList = userGroup.getMemberUserGroupList();
            List<MemberUserGroupDTO> memberUserGroupDTOList = new ArrayList<>();
            for(MemberUserGroup memberUserGroup : memberUserGroupList) {
                final MemberUserGroupDTO memberUserGroupDTO = getMemberUserGroupDTO(memberUserGroup);
                memberUserGroupDTOList.add(memberUserGroupDTO);
            }

            userGroupDTO.setMemberUserGroupDTOList(memberUserGroupDTOList);
            userGroupDTO.setIdMode(userGroup.getMode().getIdMode());

            userGroupDTOList.add(userGroupDTO);
        }
        return userGroupDTOList;
    }

    private static MemberUserGroupDTO getMemberUserGroupDTO(MemberUserGroup memberUserGroup) {
        MemberUserGroupDTO memberUserGroupDTO = new MemberUserGroupDTO();
        memberUserGroupDTO.setIdMemberUserGroup(memberUserGroup.getIdMemberUserGroup());
        memberUserGroupDTO.setRole(memberUserGroup.getRole());
        memberUserGroupDTO.setStatus(memberUserGroup.getStatus());
        memberUserGroupDTO.setJoinedAt(memberUserGroup.getJoinedAt());
        memberUserGroupDTO.setIsDeleted(memberUserGroup.getIsDeleted());
        memberUserGroupDTO.setIdUserGroup(memberUserGroup.getUserGroup().getIdUserGroup());
        return memberUserGroupDTO;
    }
}
