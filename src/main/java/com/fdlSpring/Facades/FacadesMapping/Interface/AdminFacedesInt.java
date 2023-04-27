package com.fdlSpring.Facades.FacadesMapping.Interface;

import com.fdlSpring.Facades.AdminDTO.AdminRequest;
import com.fdlSpring.Facades.AdminDTO.AdminResponse;
import com.fdlSpring.Facades.BlogDto.BlogRequest;
import com.fdlSpring.Facades.BlogDto.BlogResponse;

import java.util.List;

public interface AdminFacedesInt {


    String createAdmin(AdminRequest request);

    String updateAdmin(AdminRequest request, String id);

    String deleteAdminById(String id);

    AdminResponse getById(String id);

    List<AdminResponse> getAllAdmin();
}
