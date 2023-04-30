package com.fdlSpring.Services.LogoManager;

import com.fdlSpring.Model.LogoModel;

import java.util.List;

public interface LogoServicesInt {
    String add(LogoModel map);

    LogoModel getById(String id);

    String delete(String id);

    List<LogoModel> getAll();

    String save(LogoModel logoModel);
}
