package com.fdlSpring.Facades.FacadesMapping.Implament;

import com.fdlSpring.Facades.BlogDTO;
import com.fdlSpring.Facades.FacadesMapping.Interface.BlogsFacadesInt;
import com.fdlSpring.Model.BlogModel;
import com.fdlSpring.Model.CategoryModel;
import com.fdlSpring.Services.BlogManager.BlogServicesImp;
import com.fdlSpring.Services.CategoryManager.CategoryServices;
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
    public String createBlog(BlogDTO blogDTO) {

        return this.blogServicesImp.createBlog(this.modelMapper.map(blogDTO, BlogModel.class));
    }

    @Override
    public BlogDTO getBlogById(String id) {
        return this.modelMapper.map(this.blogServicesImp.getBlogById(id),BlogDTO.class);
    }

    @Override
    public BlogDTO getBlogByTitle(String title) {
        return this.modelMapper.map(this.blogServicesImp.getBlogByTitle(title),BlogDTO.class);
    }

    @Override
    public List<BlogDTO> getBlogs() {
        List<BlogDTO> blogResponses=new ArrayList<>();
        List<BlogModel> blogs=this.blogServicesImp.getBlogs();
        for (BlogModel blog : blogs) {
            blogResponses.add(this.modelMapper.map(blog, BlogDTO.class));

        }
        return blogResponses;
    }

    @Override
    public List<BlogDTO> getBlogsByCategory(String category) {
        List<BlogDTO> blogResponses=new ArrayList<>();
        List<BlogModel> responses=this.blogServicesImp.getBlogsByCategory(category);
        for (BlogModel respons : responses) {
            blogResponses.add(this.modelMapper.map(respons,BlogDTO.class));

        }
        return blogResponses;
    }

    @Override
    public List<BlogDTO> getBlogsByBloggerId(String id) {

        List<BlogDTO> blogResponses=new ArrayList<>();
        List<BlogModel> responses=this.blogServicesImp.getBlogsByBloggerId(id);
        for (BlogModel respons : responses) {
            blogResponses.add(this.modelMapper.map(respons,BlogDTO.class));

        }
        return blogResponses;

    }

    @Override
    public String updateBlog(BlogDTO blogDTO ,String id) {
        return this.blogServicesImp.updateBlog(blogDTO,id);
    }
}
