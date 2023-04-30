package com.fdlSpring.Services.FileManager;

import com.fdlSpring.Model.FileModel;
import com.fdlSpring.Repository.FileDao;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FileServicesImp implements FileServicesInt{
    @Resource
    private FileDao fileDao;

    @Override
    public String add(FileModel map) {
        String message;
        try {
            if ( !map.getFileId().isEmpty() && map.getFile()!=null){
                fileDao.save(map);
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
    public FileModel getById(String id) {
        FileModel fileModel =null;

        try {
            fileModel = fileDao.findById(id).get();


        }catch (Exception e){

        }finally {
            if (fileModel.getFileId().isEmpty()){
                fileModel.setFileId(null);
                fileModel.setFile(null);

            }
        }
        return fileModel;
    }

    @Override
    public String delete(String id) {
        String message;
        try {
            fileDao.deleteById(id);
            message="Successful";
        }catch (Exception e){
            message=e.getMessage();
        }
        return message;
    }

    @Override
    public List<FileModel> getAll() {
        List<FileModel> fileModels =null;
        try {
            fileModels = fileDao.findAll();
        }catch (Exception e){

        }
        return fileModels;
    }

    @Override
    public String save(FileModel fileModel) {
        String message;
        try {
            fileDao.save(fileModel);
            message="Successful";
        }catch (Exception e){
            message=e.getMessage();
        }
        return message;
    }
}
