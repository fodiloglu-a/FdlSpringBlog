package com.fdlSpring.Facades.FacadesMapping.Implament;

import com.fdlSpring.Facades.FacadesMapping.Interface.LogoFacadesInt;
import com.fdlSpring.Facades.LogoDTO;
import com.fdlSpring.Model.LogoModel;
import com.fdlSpring.Services.LogoManager.LogoServicesImp;
import jakarta.annotation.Resource;
import org.modelmapper.ModelMapper;

import java.util.ArrayList;
import java.util.List;

public class LogoFacadesImp implements LogoFacadesInt {
    @Resource
    private ModelMapper mapper;

    @Resource
    private LogoServicesImp logoServicesImp;
    @Override
    public String update(LogoDTO dto,String id) {
        LogoModel logoModel= logoServicesImp.getById(id);
        logoModel.setLogoUri(dto.getLogoUri());
        logoModel.setLogoImg(dto.getLogoImg());
        logoModel.setLogoId(dto.getLogoId());
        String message=logoServicesImp.save(logoModel);
        return message;
    }

    @Override
    public List<LogoDTO>getAll() {
        List<LogoDTO> response=new ArrayList<>();
        List<LogoModel> logoModels=logoServicesImp.getAll();
        for (LogoModel logoModel : logoModels) {
            response.add(mapper.map(logoModel,LogoDTO.class));

        }

        return  response;
    }

    @Override
    public String delete(String id) {
        return logoServicesImp.delete(id);
    }

    @Override
    public LogoDTO getById(String id) {
        return mapper.map(logoServicesImp.getById(id),LogoDTO.class);
    }

    @Override
    public String add(LogoDTO dto) {
        return logoServicesImp.add(mapper.map(dto,LogoModel.class));
    }
}
