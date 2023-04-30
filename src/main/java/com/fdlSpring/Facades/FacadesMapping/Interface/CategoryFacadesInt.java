package com.fdlSpring.Facades.FacadesMapping.Interface;

import com.fdlSpring.Facades.CategoryDTO;

import java.util.List;

public interface CategoryFacadesInt {
    String createCategory(CategoryDTO categoryRequest);

    String update(CategoryDTO categoryRequest, String updateId);

    List<CategoryDTO> getCategory();

    CategoryDTO getCategoryById(String categoryId);

    String delete(String id);
}
