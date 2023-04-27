package com.fdlSpring.Services.BloggerManager;

import com.fdlSpring.Facades.AdminDTO.AdminRequest;
import com.fdlSpring.Facades.BloggerDTO.BloggerRequest;
import com.fdlSpring.Model.AdminModel;
import com.fdlSpring.Model.BloggerModel;

import java.util.List;

public interface BloggerServicesInt {
    String createBlogger(BloggerModel request);

    String updateBlogger(BloggerModel request, String id);

    String deleteBloggerById(String id);

    BloggerModel getById(String id);

    List<BloggerModel> getAllBlogger();
}
