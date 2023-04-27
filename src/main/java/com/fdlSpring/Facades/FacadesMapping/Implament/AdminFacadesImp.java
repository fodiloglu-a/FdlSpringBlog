package com.fdlSpring.Facades.FacadesMapping.Implament;

import com.fdlSpring.Facades.AdminDTO.AdminRequest;
import com.fdlSpring.Facades.AdminDTO.AdminResponse;
import com.fdlSpring.Facades.FacadesMapping.Interface.AdminFacedesInt;
import com.fdlSpring.Model.AdminModel;
import com.fdlSpring.Services.AdminManager.AdminServicesImp;
import jakarta.annotation.Resource;
import org.modelmapper.ModelMapper;
import org.springframework.boot.Banner;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

public class AdminFacadesImp implements AdminFacedesInt {
    @Resource
    private AdminServicesImp adminServicesImp;
    @Resource
    private ModelMapper mapper;
    @Override
    public String createAdmin(AdminRequest request) {
        return adminServicesImp.createAsdmin(mapper.map(request, AdminModel.class));
    }

    @Override
    public String updateAdmin(AdminRequest request, String id) {
        return adminServicesImp.updateAdmin(id,mapper.map(request,AdminModel.class));
    }

    @Override
    public String deleteAdminById(String id) {
        return adminServicesImp.deleteAdminById(id);
    }

    @Override
    public AdminResponse getById(String id) {
        return mapper.map(adminServicesImp.getById(id),AdminResponse.class);
    }

    @Override
    public List<AdminResponse> getAllAdmin() {
        List<AdminResponse> responses=new ArrayList<>();
        List<AdminModel> models=adminServicesImp.getAllAdmin();
        for (AdminModel model : models) {
            responses.add(mapper.map(model,AdminResponse.class));
        }
        return responses;
    }
}
