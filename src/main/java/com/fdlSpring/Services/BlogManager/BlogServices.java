package com.fdlSpring.Services.BlogManager;

import com.fdlSpring.Model.BlogModel;

public interface BlogServices {

    String createBlog(BlogModel map);

    Object getBlogById(String id);

    Object getBlogByTitle(String title);
}
