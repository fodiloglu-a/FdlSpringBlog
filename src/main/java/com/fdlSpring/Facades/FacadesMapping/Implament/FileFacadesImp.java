package com.fdlSpring.Facades.FacadesMapping.Implament;

import com.fdlSpring.Facades.FacadesMapping.Interface.FileFacadesInt;
import com.fdlSpring.Facades.FileDTO;
import com.fdlSpring.Facades.LogoDTO;
import com.fdlSpring.Model.FileModel;
import com.fdlSpring.Model.LogoModel;
import com.fdlSpring.Services.FileManager.FileServicesImp;
import jakarta.annotation.Resource;
import org.modelmapper.ModelMapper;

import java.util.ArrayList;
import java.util.List;

public class FileFacadesImp implements FileFacadesInt {
    @Resource
    private ModelMapper mapper;

    @Resource
    private FileServicesImp fileServicesImp;

    @Override
    public String update(FileDTO dto, String id) {
        FileModel fileModel = fileServicesImp.getById(id);
        fileModel.setFile(dto.getFile());
        fileModel.setFileId(dto.getFileId());

        String message= fileServicesImp.save(fileModel);
        return message;
    }

    @Override
    public List<FileDTO> getAll() {
        List<FileDTO> response=new ArrayList<>();
        List<FileModel> fileModels= fileServicesImp.getAll();
        for (FileModel fileModel : fileModels) {
            response.add(mapper.map(fileModel,FileDTO.class));

        }

        return  response;
    }

    @Override
    public String delete(String id) {
        return fileServicesImp.delete(id);
    }

    @Override
    public FileDTO getById(String id) {
        return mapper.map(fileServicesImp.getById(id),FileDTO.class);
    }

    @Override
    public String add(FileDTO dto) {
        return fileServicesImp.add(mapper.map(dto,FileModel.class));
    }
}
