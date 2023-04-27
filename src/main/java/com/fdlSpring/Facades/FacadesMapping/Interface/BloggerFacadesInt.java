package com.fdlSpring.Facades.FacadesMapping.Interface;

import com.fdlSpring.Facades.AdminDTO.AdminRequest;
import com.fdlSpring.Facades.BlogDto.BlogRequest;
import com.fdlSpring.Facades.BlogDto.BlogResponse;
import com.fdlSpring.Facades.BloggerDTO.BloggerRequest;
import com.fdlSpring.Facades.BloggerDTO.BloggerResponse;

import java.util.List;

public interface BloggerFacadesInt {

    String createBlogger(AdminRequest request);

    String updateBlogger(BloggerRequest request, String id);

    String deleteBloggerById(String id);

    BloggerResponse getById(String id);

    List<BloggerResponse> getAllBlogger();
}
