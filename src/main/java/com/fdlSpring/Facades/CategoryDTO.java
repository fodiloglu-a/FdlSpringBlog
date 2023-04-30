package com.fdlSpring.Facades;

import com.fdlSpring.Model.BlogModel;
import lombok.Data;

import java.util.List;

@Data
public class CategoryDTO {
    private String categoryId;
    private String categoryName;
    private List<BlogModel> blogModels;
}
