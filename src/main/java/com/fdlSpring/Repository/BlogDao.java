package com.fdlSpring.Repository;

import com.fdlSpring.Model.BlogModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BlogDao extends MongoRepository<BlogModel,String> {


    List<BlogModel> getBlogModelsByCategoryIdEquals(String category);
    List<BlogModel> getBlogModelsByBloggerIdEquals(String bloggerId);

    BlogModel getBlogModelByBlogTitleEquals(String title);





}
