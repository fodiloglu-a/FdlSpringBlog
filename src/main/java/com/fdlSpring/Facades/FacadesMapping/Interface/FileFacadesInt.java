package com.fdlSpring.Facades.FacadesMapping.Interface;

import com.fdlSpring.Facades.FileDTO;

import java.util.List;

public interface FileFacadesInt {
    String add(FileDTO dto);

    FileDTO getById(String id);

    String delete(String id);

    List<FileDTO> getAll();

    String update(FileDTO dto,String id);
}
