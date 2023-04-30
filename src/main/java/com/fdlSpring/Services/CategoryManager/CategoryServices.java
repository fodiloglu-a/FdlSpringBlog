package com.fdlSpring.Services.CategoryManager;

import com.fdlSpring.Model.CategoryModel;

import java.util.List;

public interface CategoryServices {
    Object getCategoryById(String categoryId);

    List<CategoryModel> getCategory();



    String createCategory(CategoryModel map);

    String update(CategoryModel categoryModel);

    String delete(String id);
}
