package com.fdlSpring.Facades.FacadesMapping.Implament;

import com.fdlSpring.Facades.CategoryDTO;
import com.fdlSpring.Facades.FacadesMapping.Interface.CategoryFacadesInt;
import com.fdlSpring.Model.CategoryModel;
import com.fdlSpring.Services.CategoryManager.CategoryServicesImp;
import jakarta.annotation.Resource;
import org.modelmapper.ModelMapper;

import java.util.ArrayList;
import java.util.List;

public class CategoryFacadesImp implements CategoryFacadesInt {

    @Resource
    private CategoryServicesImp categoryServicesImp;
    @Resource
    private ModelMapper modelMapper;
    @Override
    public String createCategory(CategoryDTO categoryRequest) {
        if (categoryRequest.getCategoryId().isEmpty() || categoryRequest.getCategoryName().isEmpty()){
            return "not Successful";

        }


        return this.categoryServicesImp.createCategory(this.modelMapper.map(categoryRequest, CategoryModel.class));
    }

    @Override
    public String update(CategoryDTO categoryRequest, String updateId) {
        CategoryModel categoryModel=this.categoryServicesImp.getCategoryById(updateId);
        if(categoryModel.getCategoryId().isEmpty())
        {
            return "Not Successful";
        }
        categoryModel.setCategoryName(categoryRequest.getCategoryName());
        if (categoryModel.getBlogModels().isEmpty()){
            categoryModel.setBlogModels(categoryRequest.getBlogModels());
        }else {
           if ( categoryModel.getBlogModels().size()==categoryRequest.getBlogModels().size()){
               categoryModel.setBlogModels(categoryRequest.getBlogModels());
           }

        }



        return this.categoryServicesImp.update(categoryModel);
    }

    @Override
    public List<CategoryDTO> getCategory() {
        List<CategoryDTO> categoryRespons =new ArrayList<>();
        List<CategoryModel> categoryModels=categoryServicesImp.getCategory();
        for (CategoryModel categoryModel : categoryModels) {
            categoryRespons.add(this.modelMapper.map(categoryModel, CategoryDTO.class));

        }
        return categoryRespons;
    }

    @Override
    public CategoryDTO getCategoryById(String categoryId) {
        CategoryModel model = this.categoryServicesImp.getCategoryById(categoryId);
        CategoryDTO response=this.modelMapper.map(model, CategoryDTO.class);

        return response;
    }

    @Override
    public String delete(String id) {
        return categoryServicesImp.delete(id);
    }
}
