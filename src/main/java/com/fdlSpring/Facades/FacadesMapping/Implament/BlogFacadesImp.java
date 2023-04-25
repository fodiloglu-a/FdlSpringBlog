package com.fdlSpring.Facades.FacadesMapping.Implament;

import com.fdlSpring.Facades.BlogDto.BlogRequest;
import com.fdlSpring.Facades.BlogDto.BlogResponse;
import com.fdlSpring.Facades.FacadesMapping.Interface.BlogsFacadesInt;
import com.fdlSpring.Model.BlogModel;
import com.fdlSpring.Services.BlogManager.BlogServicesImp;
import jakarta.annotation.Resource;
import org.modelmapper.ModelMapper;

import java.util.ArrayList;
import java.util.List;

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

    @Override
    public List<BlogResponse> getBlogs() {
        List<BlogResponse> blogResponses=new ArrayList<>();
        List<BlogModel> blogs=this.blogServicesImp.getBlogs();
        for (BlogModel blog : blogs) {
            blogResponses.add(this.modelMapper.map(blog, BlogResponse.class));

        }
        return blogResponses;
    }

    @Override
    public List<BlogResponse> getBlogsByCategory(String category) {
        List<BlogResponse> blogResponses=new ArrayList<>();
        List<BlogModel> responses=this.blogServicesImp.getBlogsByCategory(category);
        for (BlogModel respons : responses) {
            blogResponses.add(this.modelMapper.map(respons,BlogResponse.class));

        }
        return blogResponses;
    }

    @Override
    public List<BlogResponse> getBlogsByBloggerId(String id) {

        List<BlogResponse> blogResponses=new ArrayList<>();
        List<BlogModel> responses=this.blogServicesImp.getBlogsByBloggerId(id);
        for (BlogModel respons : responses) {
            blogResponses.add(this.modelMapper.map(respons,BlogResponse.class));

        }
        return blogResponses;

    }

    @Override
    public String updateBlog(BlogRequest blogRequest) {
        BlogModel blogModel=this.blogServicesImp.getBlogById(blogRequest.getBlogId());
        if (!blogModel.getBlogId().equals(blogRequest.getBlogId())){
            this.blogServicesImp.deleteBlogById(blogModel.getBlogId());
            blogModel.setBlogId(blogRequest.getBlogId());
        }

        blogModel.setBlogFile(blogRequest.getBlogFile());
        blogModel.setBlogFileId(blogRequest.getBlogFileId());
        blogModel.setBlogLogo(blogRequest.getBlogLogo());
        blogModel.setBlogLogoId(blogRequest.getBlogLogoId());
        blogModel.setBlogTitle(blogRequest.getBlogTitle());
        blogModel.setBlogFileSummary(blogRequest.getBlogFileSummary());
        blogModel.setBloggerId(blogRequest.getBloggerId());
        blogModel.setBlogLogoUrl(blogRequest.getBlogLogoUrl());
        return this.blogServicesImp.updateBlog(blogModel);
    }
}
