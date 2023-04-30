package com.fdlSpring.Facades.FacadesMapping.Interface;

import com.fdlSpring.Facades.BloggerDTO;

import java.util.List;

public interface BloggerFacadesInt {

    String createBlogger(BloggerDTO request);

    String updateBlogger(BloggerDTO request, String id);

    String deleteBloggerById(String id);

    BloggerDTO getById(String id);

    List<BloggerDTO> getAllBlogger();
}
