package com.fdlSpring.Model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;



@Data
@Document
public class BlogModel {


    @Id
    private String blogId;
    private String blogTitle;
    private String categoryId;

    private CategoryModel blogCategoryModel;
    private String bloggerId;
    private byte[] blogFile;
    private String blogFileId;
    private String blogFileSummary;
    private byte[] blogLogo;
    private String blogLogoUrl;
    private String blogLogoId;


}
