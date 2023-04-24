package com.fdlSpring.Facades.FacadesMapping.Implament;

import com.fdlSpring.Facades.BlogDto.BlogRequest;
import com.fdlSpring.Facades.BlogDto.BlogResponse;
import com.fdlSpring.Facades.FacadesMapping.Interface.BlogsFacadesInt;
import com.fdlSpring.Model.BlogModel;
import com.fdlSpring.Services.BlogManager.BlogServicesImp;
import jakarta.annotation.Resource;
import org.modelmapper.ModelMapper;

public class BlogFacadesImp implements BlogsFacadesInt {

    @Resource
    private ModelMapper modelMapper;
    @Resource
    private BlogServicesImp blogServicesImp;


    @Override
    public String createBlog(BlogRequest blogRequest) {

        return this.blogServicesImp.createBlog(this.modelMapper.map(blogRequest, BlogModel.class));
    }

    @Override
    public BlogResponse getBlogById(String id) {
        return this.modelMapper.map(this.blogServicesImp.getBlogById(id),BlogResponse.class);
    }

    @Override
    public BlogResponse getBlogByTitle(String title) {
        return this.modelMapper.map(this.blogServicesImp.getBlogByTitle(title),BlogResponse.class);
    }
}
