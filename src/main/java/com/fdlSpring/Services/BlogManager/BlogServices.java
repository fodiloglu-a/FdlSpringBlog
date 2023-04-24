package com.fdlSpring.Services.BlogManager;

import com.fdlSpring.Model.BlogModel;

import java.util.List;

public interface BlogServices {

    String createBlog(BlogModel map);

    Object getBlogById(String id);

    Object getBlogByTitle(String title);

    List<BlogModel> getBlogs();
}
