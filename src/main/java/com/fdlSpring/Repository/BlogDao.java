package com.fdlSpring.Repository;

import com.fdlSpring.Model.BlogModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlogDao extends MongoRepository<BlogModel,String> {

    BlogModel getBlogModelByBlogTitleEquals(String title);
}
