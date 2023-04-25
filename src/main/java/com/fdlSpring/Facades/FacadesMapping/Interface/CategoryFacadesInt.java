package com.fdlSpring.Facades.FacadesMapping.Interface;

import com.fdlSpring.Facades.CategoryDTO.CategoryRequest;
import com.fdlSpring.Facades.CategoryDTO.CategoryResponse;

import java.util.List;

public interface CategoryFacadesInt {
    String createCategory(CategoryRequest categoryRequest);

    String update(CategoryRequest categoryRequest, String updateId);

    List<CategoryResponse> getCategory();

    CategoryResponse getCategoryById(String categoryId);
}
