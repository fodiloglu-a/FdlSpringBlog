package com.fdlSpring.Services.FileManager;

import com.fdlSpring.Model.FileModel;

import java.util.List;

public interface FileServicesInt {
    FileModel getById(String id);

    String save(FileModel fileModel);

    List<FileModel> getAll();

    String delete(String id);

    String add(FileModel map);
}
