package com.fdlSpring.Controller;


import com.fdlSpring.Facades.CategoryDTO.CategoryRequest;
import com.fdlSpring.Facades.CategoryDTO.CategoryResponse;
import com.fdlSpring.Facades.FacadesMapping.Implament.CategoryFacadesImp;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/category")
public class CategoryController {
    @Resource
    CategoryFacadesImp categoryFacadesImp;

    @PostMapping("/create")
    public String createCategory(@RequestBody CategoryRequest categoryRequest){
        return this.categoryFacadesImp.createCategory(categoryRequest);
    }
    @PutMapping("/update")
    public String update(@RequestBody CategoryRequest categoryRequest,@RequestParam String updateId){
        return this.categoryFacadesImp.update(categoryRequest,updateId);
    }


    @GetMapping("/getCategory")
    public List<CategoryResponse> getCategory(){
        return this.categoryFacadesImp.getCategory();
    }

    @GetMapping("/getCategoryById")
    public CategoryResponse getCategoryById(@RequestParam String categoryId){
       return  this.categoryFacadesImp.getCategoryById(categoryId);
    }
}
