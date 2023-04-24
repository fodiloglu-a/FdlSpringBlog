package com.fdlSpring.Facades.FacadesMapping.Interface;

import com.fdlSpring.Facades.BlogDto.BlogRequest;
import com.fdlSpring.Facades.BlogDto.BlogResponse;

public interface BlogsFacadesInt {

    String createBlog(BlogRequest blogRequest);

    BlogResponse getBlogById(String id);

    BlogResponse getBlogByTitle(String title);
}
