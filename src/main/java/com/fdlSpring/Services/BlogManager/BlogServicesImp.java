package com.fdlSpring.Services.BlogManager;

import com.fdlSpring.Model.BlogModel;
import com.fdlSpring.Repository.BlogDao;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogServicesImp implements BlogServices{

    @Resource
    private BlogDao blogDao;

    @Override
    public String createBlog(BlogModel map) {
        this.blogDao.save(map);
        return null;
    }

    @Override
    public BlogModel getBlogById(String id) {

        return this.blogDao.findById(id).get();
    }

    @Override
    public BlogModel getBlogByTitle(String title) {
        return this.blogDao.getBlogModelByBlogTitleEquals(title);
    }

    @Override
    public List<BlogModel> getBlogs() {

        return this.blogDao.findAll();
    }
}
