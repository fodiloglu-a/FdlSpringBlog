package com.fdlSpring.Services.BlogManager;

import com.fdlSpring.Facades.BlogDto.BlogRequest;
import com.fdlSpring.Model.BlogModel;

import java.util.List;

public interface BlogServices {

    String createBlog(BlogModel map);

    Object getBlogById(String id);

    Object getBlogByTitle(String title);

    List<BlogModel> getBlogs();

    List<BlogModel> getBlogsByCategory(String category);

    List<BlogModel> getBlogsByBloggerId(String id);

    String updateBlog(BlogModel blogeId);
    String deleteBlogById(String id);
}
