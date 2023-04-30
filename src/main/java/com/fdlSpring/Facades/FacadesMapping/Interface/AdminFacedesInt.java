package com.fdlSpring.Facades.FacadesMapping.Interface;

import com.fdlSpring.Facades.AdminDTO;

import java.util.List;

public interface AdminFacedesInt {


    String createAdmin(AdminDTO request);

    String updateAdmin(AdminDTO request, String id);

    String deleteAdminById(String id);

    AdminDTO getById(String id);

    List<AdminDTO> getAllAdmin();
}
