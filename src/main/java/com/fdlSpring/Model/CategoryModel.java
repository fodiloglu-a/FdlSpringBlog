package com.fdlSpring.Model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document
@Data
public class CategoryModel {
    @Id
    private String categoryId;
    private String categoryName;
    private List<BlogModel> blogModels;
}
