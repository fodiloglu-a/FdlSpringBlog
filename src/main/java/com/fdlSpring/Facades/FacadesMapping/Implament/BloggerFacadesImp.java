package com.fdlSpring.Facades.FacadesMapping.Implament;

import com.fdlSpring.Facades.AdminDTO.AdminRequest;
import com.fdlSpring.Facades.AdminDTO.AdminResponse;
import com.fdlSpring.Facades.BloggerDTO.BloggerRequest;
import com.fdlSpring.Facades.BloggerDTO.BloggerResponse;
import com.fdlSpring.Facades.FacadesMapping.Interface.BloggerFacadesInt;
import com.fdlSpring.Model.AdminModel;
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
    public String createBlogger(AdminRequest request) {
        BloggerModel bloggerModel=mapper.map(request,BloggerModel.class);
        return bloggerServicesImp.createBlogger(bloggerModel);
    }

    @Override
    public String updateBlogger(BloggerRequest request, String id) {
          return bloggerServicesImp.updateBlogger(mapper.map(request,BloggerModel.class),id);
    }

    @Override
    public String deleteBloggerById(String id) {
        return bloggerServicesImp.deleteBloggerById(id);
    }

    @Override
    public BloggerResponse getById(String id) {
        return  mapper.map(bloggerServicesImp.getById(id),BloggerResponse.class);
    }

    @Override
    public List<BloggerResponse> getAllBlogger() {
        List<BloggerResponse> responses=new ArrayList<>();
        List<BloggerModel> models=bloggerServicesImp.getAllBlogger();
        for (BloggerModel model : models) {
            responses.add(mapper.map(model,BloggerResponse.class));
        }
        return responses;
    }
}
