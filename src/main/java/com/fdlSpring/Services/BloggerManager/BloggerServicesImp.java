package com.fdlSpring.Services.BloggerManager;

import com.fdlSpring.Facades.AdminDTO.AdminRequest;
import com.fdlSpring.Facades.BloggerDTO.BloggerRequest;
import com.fdlSpring.Model.AdminModel;
import com.fdlSpring.Model.BloggerModel;
import com.fdlSpring.Repository.BloggerDao;
import jakarta.annotation.Resource;

import java.util.List;

public class BloggerServicesImp implements BloggerServicesInt{
    @Resource
    private BloggerDao bloggerDao;
    @Override
    public String createBlogger(BloggerModel request) {
        bloggerDao.save(request);
        return "null";
    }

    @Override
    public String updateBlogger(BloggerModel request, String id) {
        BloggerModel bloggerModel=bloggerDao.findById(id).get();
        bloggerModel.setBloggerEmail(request.getBloggerEmail());
        bloggerModel.setBloggerSurname(request.getBloggerSurname());
        bloggerModel.setBloggerName(request.getBloggerName());
        return "null";
    }

    @Override
    public String deleteBloggerById(String id) {
        bloggerDao.delete(bloggerDao.findById(id).get());
        return "null";
    }

    @Override
    public BloggerModel getById(String id) {
        return bloggerDao.findById(id).get();
    }

    @Override
    public List<BloggerModel> getAllBlogger() {
        return bloggerDao.findAll();
    }
}
