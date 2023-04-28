package com.fdlSpring.Services.AdminManager;

import com.fdlSpring.Model.AdminModel;
import com.fdlSpring.Repository.AdminDao;
import jakarta.annotation.Resource;

import java.util.List;

public class AdminServicesImp implements AdminServicesInt{
    @Resource
    private AdminDao adminDao;
    @Override
    public String createAsdmin(AdminModel map) {
         adminDao.save(map);
         return "null";
    }

    @Override
    public String updateAdmin(String id, AdminModel map) {
        AdminModel adminModel=adminDao.findById(id).get();
        adminModel.setAdminEmail(map.getAdminEmail());
        adminModel.setAdminName(map.getAdminName());
        adminModel.setAdminUserName(map.getAdminUserName());

        adminDao.save(adminModel);

        return "null";
    }

    @Override
    public String deleteAdminById(String id) {
          adminDao.delete(adminDao.findById(id).get());
          return "null";
    }

    @Override
    public AdminModel getById(String id) {
        return adminDao.findById(id).get();
    }

    @Override
    public List<AdminModel> getAllAdmin() {
        return adminDao.findAll();
    }
}
