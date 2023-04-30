package com.fdlSpring.Services.CategoryManager;

import com.fdlSpring.Model.CategoryModel;
import com.fdlSpring.Repository.CategoryDao;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CategoryServicesImp implements CategoryServices{
    @Resource
    public CategoryDao categoryDao;
    @Override
    public CategoryModel getCategoryById(String categoryId) {
        return this.categoryDao.findById(categoryId).get();
    }

    @Override
    public List<CategoryModel> getCategory() {
        return this.categoryDao.findAll();
    }

    @Override
    public String update(CategoryModel categoryModel) {
         this.categoryDao.save(categoryModel);
         return "Successful";
    }

    @Override
    public String delete(String id) {
        try {
            categoryDao.deleteById(id);
        }catch (Exception e){
            return new RuntimeException().getMessage();
        }
        return "null";
    }

    @Override
    public String createCategory(CategoryModel map) {
          this.categoryDao.save(map);return "Successful";
    }
}
