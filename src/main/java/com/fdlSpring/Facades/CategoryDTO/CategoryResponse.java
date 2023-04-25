package com.fdlSpring.Facades.CategoryDTO;

import com.fdlSpring.Model.BlogModel;
import lombok.Data;

import java.util.List;

@Data
public class CategoryResponse {
    private String categoryId;
    private String categoryName;
    private List<BlogModel> blogModels;
}
