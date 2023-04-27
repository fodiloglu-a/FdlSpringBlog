package com.fdlSpring.Facades.BloggerDTO;

import com.fdlSpring.Model.BloggerModel;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class BloggerResponse {
    private String bloggerId;
    private String bloggerName;
    private String bloggerSurname;
    private String bloggerEmail;
    private List<BloggerModel> bloggerModels;
}
