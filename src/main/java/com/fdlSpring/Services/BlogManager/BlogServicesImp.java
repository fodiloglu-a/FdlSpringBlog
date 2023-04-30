package com.fdlSpring.Services.BlogManager;

import com.fdlSpring.Facades.BlogDTO;
import com.fdlSpring.Model.BlogModel;
import com.fdlSpring.Model.BloggerModel;
import com.fdlSpring.Model.CategoryModel;
import com.fdlSpring.Repository.BlogDao;
import com.fdlSpring.Services.BloggerManager.BloggerServicesImp;
import com.fdlSpring.Services.CategoryManager.CategoryServicesImp;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BlogServicesImp implements BlogServices{

    @Resource
    private BlogDao blogDao;
    @Resource
    private CategoryServicesImp categoryServicesImp;
    @Resource
    private BloggerServicesImp bloggerServicesImp;


    @Override
    public String createBlog(BlogModel model) {

        BloggerModel bloggerModel=null;
        CategoryModel categoryModel=null;
        try
        {
            try {
                  bloggerModel= bloggerServicesImp.getById(model.getBloggerId());

            }catch (Exception e) {

            }
            try {
                categoryModel=categoryServicesImp.getCategoryById(model.getCategoryId());


            }catch (Exception e){

            }


        }catch (Exception e){

        }



        finally {
            model.setBloggerModel(bloggerModel);
            model.setBlogCategoryModel(categoryModel);
        }


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
    public String updateBlog(BlogDTO dto, String id) {
        BlogModel blog=null;
       try {
            blog=blogDao.findById(id).get();
       }catch (Exception e){
           return e.getMessage();
       }
       blog.setBlogId(dto.getBlogId());
       blog.setBlogFile(dto.getBlogFile());
       blog.setBlogTitle(dto.getBlogTitle());
       blog.setBlogCategoryModel(categoryServicesImp.getCategoryById(dto.getBlogCategoryId()));
       blog.setBloggerModel(bloggerServicesImp.getById(dto.getBloggerId()));
    if (blog.getBlogId().isEmpty())
    {
        return "Not Be Successful";
    }
    else {
        blogDao.save(blog);
        return "Successful";
    }


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
