package com.fdlSpring.Services.BlogManager;

import com.fdlSpring.Facades.BlogDto.BlogRequest;
import com.fdlSpring.Model.BlogModel;
import com.fdlSpring.Model.CategoryModel;
import com.fdlSpring.Repository.BlogDao;
import com.fdlSpring.Repository.CategoryDao;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.awt.font.TextHitInfo;
import java.util.List;
import java.util.Optional;

@Service
public class BlogServicesImp implements BlogServices{

    @Resource
    private BlogDao blogDao;
    @Resource
    private CategoryDao categoryDao;

    @Override
    public String createBlog(BlogModel model) {

        try
        {
            CategoryModel categoryModel=categoryDao.findById(model.getCategoryId()).get();
            if (!categoryModel.getCategoryId().isEmpty()){
                model.setBlogCategoryModel(categoryModel);


            }else {return "Category Id Not Be Null";}
        }catch (Exception e){return e.getMessage();}



        return "Success";
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

    @Override
    public List<BlogModel> getBlogsByCategory(String category) {
        return this.blogDao.getBlogModelsByCategoryIdEquals(category);
    }

    @Override
    public List<BlogModel> getBlogsByBloggerId(String id) {
        return this.blogDao.getBlogModelsByBloggerIdEquals(id);
    }

    @Override
    public String updateBlog(BlogModel blogModel) {


        this.blogDao.save(blogModel);

        return "null";
    }

    @Override
    public String deleteBlogById(String id) {

          try {
              Optional<BlogModel> blogModel=this.blogDao.findById("id");
              if (blogModel.isEmpty()){
                  return "Model Not Fount";
              }else {
                  this.blogDao.deleteById(id);

              }


          }catch (Exception e){
              e.getMessage();
          }

        return "deleteSuccessful";
    }


}
