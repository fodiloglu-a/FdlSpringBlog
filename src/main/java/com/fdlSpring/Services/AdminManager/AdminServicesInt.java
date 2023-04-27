package com.fdlSpring.Services.AdminManager;

import com.fdlSpring.Model.AdminModel;

import java.util.List;

public interface AdminServicesInt {
    String createAsdmin(AdminModel map);

    String updateAdmin(String id, AdminModel map);

    String deleteAdminById(String id);

    AdminModel getById(String id);

    List<AdminModel> getAllAdmin();
}
