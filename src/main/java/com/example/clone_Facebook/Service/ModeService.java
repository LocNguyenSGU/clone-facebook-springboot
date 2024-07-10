package com.example.clone_Facebook.Service;

import com.example.clone_Facebook.DTO.ModeDTO;
import com.example.clone_Facebook.Entity.Mode;
import com.example.clone_Facebook.Repository.ModeRepository;
import com.example.clone_Facebook.Service.Imp.ModeServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ModeService implements ModeServiceImp {
    @Autowired
    private ModeRepository modeRepository;
    @Override
    public List<ModeDTO> getAllMode() {
        List<Mode> modeList = modeRepository.findAll();
        List<ModeDTO> modeDTOList = new ArrayList<>();
        for (Mode mode : modeList) {
            ModeDTO modeDTO = new ModeDTO();
            modeDTO.setIdMode(mode.getIdMode());
            modeDTO.setName(mode.getName());
            modeDTO.setDescription(mode.getDescription());
            modeDTO.setImageURL(mode.getImageURL());
            modeDTO.setIsDeleted(mode.getIsDeleted());
            modeDTOList.add(modeDTO);
        }
        return modeDTOList;
    }
}
