package com.fdlSpring.Services.LogoManager;

import com.fdlSpring.Model.LogoModel;
import com.fdlSpring.Repository.LogoDao;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.PrimitiveIterator;

@Service
public class LogoServicesImp implements LogoServicesInt{
    @Resource
    private LogoDao logoDao;

    @Override
    public String add(LogoModel map) {
        String message;
        try {
            if (!map.getLogoId().isEmpty() && map.getLogoUri().isEmpty() && map.getLogoImg()==null){
                logoDao.save(map);
                message="Successful";

            }
            else{
                message="Not Successful";
            }
        }catch (Exception e){
            message=e.getMessage();
        }
        return message;
    }

    @Override
    public LogoModel getById(String id) {
        LogoModel logoModel=null;

        try {
              logoModel=logoDao.findById(id).get();


        }catch (Exception e){

        }finally {
            if (logoModel.getLogoId().isEmpty()){
                logoModel.setLogoUri(null);
                logoModel.setLogoImg(null);
                logoModel.setLogoId(null);
            }
        }
        return logoModel;
    }

    @Override
    public String delete(String id) {
        String message;
        try {
            logoDao.deleteById(id);
            message="Successful";
        }catch (Exception e){
            message=e.getMessage();
        }
        return message;
    }

    @Override
    public List<LogoModel> getAll() {
        List<LogoModel> logoModelList=null;
        try {
            logoModelList=logoDao.findAll();
        }catch (Exception e){

        }
        return logoModelList;
    }

    @Override
    public String save(LogoModel logoModel) {
        String message;
        try {
            logoDao.save(logoModel);
            message="Successful";
        }catch (Exception e){
            message=e.getMessage();
        }
        return message;
    }
}
