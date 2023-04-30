package com.fdlSpring.Controller.ModelController;


import com.fdlSpring.Facades.CategoryDTO;
import com.fdlSpring.Facades.FacadesMapping.Implament.CategoryFacadesImp;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/category")
public class CategoryController {
    @Resource
    CategoryFacadesImp categoryFacadesImp;

    @PostMapping("/create")
    public String createCategory(@RequestBody CategoryDTO categoryRequest){
        return this.categoryFacadesImp.createCategory(categoryRequest);
    }
    @PutMapping("/update")
    public String update(@RequestBody CategoryDTO categoryRequest,@RequestParam String updateId){
        return this.categoryFacadesImp.update(categoryRequest,updateId);
    }

    @DeleteMapping("/delete")
    public String delete(@RequestParam String id){
        return categoryFacadesImp.delete(id);
    }


    @GetMapping("/getCategory")
    public List<CategoryDTO> getCategory(){
        return this.categoryFacadesImp.getCategory();
    }

    @GetMapping("/getCategoryById")
    public CategoryDTO getCategoryById(@RequestParam String categoryId){
       return  this.categoryFacadesImp.getCategoryById(categoryId);
    }
}
