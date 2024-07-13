package com.example.clone_Facebook.Service;

import com.example.clone_Facebook.DTO.EmotionDTO;
import com.example.clone_Facebook.Entity.Emotion;
import com.example.clone_Facebook.Repository.EmotionRepository;
import com.example.clone_Facebook.Service.Imp.EmotionServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmotionService implements EmotionServiceImp {
    @Autowired
    private EmotionRepository emotionRepository;

    @Override
    public List<EmotionDTO> getAllEmotion() {
        List<Emotion> emotionList = emotionRepository.findAll();
        List<EmotionDTO> emotionDTOList = new ArrayList<>();
        for(Emotion emotion : emotionList) {
            EmotionDTO emotionDTO = new EmotionDTO();
            emotionDTO.setIdEmotion(emotion.getIdEmotion());
            emotionDTO.setName(emotion.getName());
            emotionDTO.setDescription(emotion.getDescription());
            emotionDTO.setImageURL(emotion.getImage());
            emotionDTO.setIsDeleted(emotion.getIsDeleted());
            emotionDTOList.add(emotionDTO);
        }
        return emotionDTOList;
    }
}
