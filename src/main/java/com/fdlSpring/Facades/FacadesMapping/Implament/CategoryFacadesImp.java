package com.fdlSpring.Facades.FacadesMapping.Implament;

import com.fdlSpring.Facades.CategoryDTO.CategoryRequest;
import com.fdlSpring.Facades.CategoryDTO.CategoryResponse;
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
    public String createCategory(CategoryRequest categoryRequest) {
        if (categoryRequest.getCategoryId().isEmpty() || categoryRequest.getCategoryName().isEmpty()){
            return "not Successful";

        }


        return this.categoryServicesImp.createCategory(this.modelMapper.map(categoryRequest, CategoryModel.class));
    }

    @Override
    public String update(CategoryRequest categoryRequest, String updateId) {
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
    public List<CategoryResponse> getCategory() {
        List<CategoryResponse>categoryResponses=new ArrayList<>();
        List<CategoryModel> categoryModels=categoryServicesImp.getCategory();
        for (CategoryModel categoryModel : categoryModels) {
            categoryResponses.add(this.modelMapper.map(categoryModel,CategoryResponse.class));

        }
        return categoryResponses ;
    }

    @Override
    public CategoryResponse getCategoryById(String categoryId) {
        CategoryModel model = this.categoryServicesImp.getCategoryById(categoryId);
        CategoryResponse response=this.modelMapper.map(model,CategoryResponse.class);

        return response;
    }
}
