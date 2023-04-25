package com.fdlSpring.Facades.FacadesMapping.Interface;

import com.fdlSpring.Facades.BlogDto.BlogRequest;
import com.fdlSpring.Facades.BlogDto.BlogResponse;

import java.util.List;

public interface BlogsFacadesInt {

    String createBlog(BlogRequest blogRequest);

    BlogResponse getBlogById(String id);

    BlogResponse getBlogByTitle(String title);

    List<BlogResponse> getBlogs();

    List<BlogResponse> getBlogsByCategory(String category);

    List<BlogResponse> getBlogsByBloggerId(String id);

    String updateBlog(BlogRequest blogeId);
}
