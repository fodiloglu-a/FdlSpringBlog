package com.fdlSpring.Facades.FacadesMapping.Implament;

import com.fdlSpring.Facades.BloggerDTO;
import com.fdlSpring.Facades.FacadesMapping.Interface.BloggerFacadesInt;
import com.fdlSpring.Model.BloggerModel;
import com.fdlSpring.Services.BloggerManager.BloggerServicesImp;
import jakarta.annotation.Resource;
import org.modelmapper.ModelMapper;

import java.util.ArrayList;
import java.util.List;

public class BloggerFacadesImp implements BloggerFacadesInt {
    @Resource
    private ModelMapper mapper;
    @Resource
    private BloggerServicesImp bloggerServicesImp;

    @Override
    public String createBlogger(BloggerDTO request) {
        BloggerModel bloggerModel=mapper.map(request,BloggerModel.class);
        return bloggerServicesImp.createBlogger(bloggerModel);
    }

    @Override
    public String updateBlogger(BloggerDTO request, String id) {
          return bloggerServicesImp.updateBlogger(mapper.map(request,BloggerModel.class),id);
    }

    @Override
    public String deleteBloggerById(String id) {
        return bloggerServicesImp.deleteBloggerById(id);
    }

    @Override
    public BloggerDTO getById(String id) {
        return  mapper.map(bloggerServicesImp.getById(id), BloggerDTO.class);
    }

    @Override
    public List<BloggerDTO> getAllBlogger() {
        List<BloggerDTO> responses=new ArrayList<>();
        List<BloggerModel> models=bloggerServicesImp.getAllBlogger();
        for (BloggerModel model : models) {
            responses.add(mapper.map(model, BloggerDTO.class));
        }
        return responses;
    }
}
