package com.fdlSpring.Facades.FacadesMapping.Interface;

import com.fdlSpring.Facades.BlogDTO;

import java.util.List;

public interface BlogsFacadesInt {

    String createBlog(BlogDTO blogDTO);

    BlogDTO getBlogById(String id);

    BlogDTO getBlogByTitle(String title);

    List<BlogDTO> getBlogs();

    List<BlogDTO> getBlogsByCategory(String category);

    List<BlogDTO> getBlogsByBloggerId(String id);

    String updateBlog(BlogDTO blogeId,String id);
}
