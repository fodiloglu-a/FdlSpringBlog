package com.fdlSpring.Facades.FacadesMapping.Interface;

import com.fdlSpring.Facades.LogoDTO;

import java.util.List;

public interface LogoFacadesInt {
    String update(LogoDTO dto,String id);

    List<LogoDTO> getAll();

    String delete(String id);

    LogoDTO getById(String id);

    String add(LogoDTO dto);
}
