package com.fdlSpring.Facades.FacadesMapping.Implament;

import com.fdlSpring.Facades.AdminDTO;
import com.fdlSpring.Facades.FacadesMapping.Interface.AdminFacedesInt;
import com.fdlSpring.Model.AdminModel;
import com.fdlSpring.Services.AdminManager.AdminServicesImp;
import jakarta.annotation.Resource;
import org.modelmapper.ModelMapper;

import java.util.ArrayList;
import java.util.List;

public class AdminFacadesImp implements AdminFacedesInt {
    @Resource
    private AdminServicesImp adminServicesImp;
    @Resource
    private ModelMapper mapper;
    @Override
    public String createAdmin(AdminDTO request) {
        return adminServicesImp.createAsdmin(mapper.map(request, AdminModel.class));
    }

    @Override
    public String updateAdmin(AdminDTO request, String id) {
        return adminServicesImp.updateAdmin(id,mapper.map(request,AdminModel.class));
    }

    @Override
    public String deleteAdminById(String id) {
        return adminServicesImp.deleteAdminById(id);
    }

    @Override
    public AdminDTO getById(String id) {
        return mapper.map(adminServicesImp.getById(id), AdminDTO.class);
    }

    @Override
    public List<AdminDTO> getAllAdmin() {
        List<AdminDTO> responses=new ArrayList<>();
        List<AdminModel> models=adminServicesImp.getAllAdmin();
        for (AdminModel model : models) {
            responses.add(mapper.map(model, AdminDTO.class));
        }
        return responses;
    }
}
