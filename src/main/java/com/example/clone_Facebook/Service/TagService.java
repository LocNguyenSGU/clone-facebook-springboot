package com.example.clone_Facebook.Service;

import com.example.clone_Facebook.DTO.TagDTO;
import com.example.clone_Facebook.Entity.Tag;
import com.example.clone_Facebook.Repository.TagRepository;
import com.example.clone_Facebook.Service.Imp.TagServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TagService implements TagServiceImp {
    @Autowired
    private TagRepository tagRepository;
    @Override
    public List<TagDTO> getAllTag() {
        List<Tag> tagList = tagRepository.findAll();
        List<TagDTO> tagDTOList = new ArrayList<>();
        for(Tag tag : tagList) {
            TagDTO tagDTO = new TagDTO();
            tagDTO.setIdTag(tag.getIdTag());
            tagDTO.setName(tag.getName());
            tagDTO.setDescription(tag.getDescription());
            tagDTO.setIsDeleted(tag.getIsDeleted());
            tagDTOList.add(tagDTO);
        }
        return tagDTOList;
    }
}
