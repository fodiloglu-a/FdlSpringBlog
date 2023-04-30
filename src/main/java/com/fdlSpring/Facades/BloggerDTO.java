package com.fdlSpring.Facades;

import com.fdlSpring.Model.BlogModel;
import com.fdlSpring.Model.BloggerModel;
import lombok.Data;

import java.util.List;

@Data
public class BloggerDTO {
    private String bloggerId;
    private String bloggerName;
    private String bloggerSurname;
    private String bloggerEmail;
    private List<BlogModel> bloggerModels;
}
