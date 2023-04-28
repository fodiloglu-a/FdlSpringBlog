package com.fdlSpring.Model;


import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Data
@Document
public class BloggerModel {

    private String bloggerId;
    private String bloggerName;
    private String bloggerSurname;
    private String bloggerEmail;
    private List<BlogModel> blogModels=new ArrayList<>();

}
