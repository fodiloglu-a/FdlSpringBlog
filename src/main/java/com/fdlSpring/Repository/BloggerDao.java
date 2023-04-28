package com.fdlSpring.Repository;

import com.fdlSpring.Model.BloggerModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BloggerDao extends MongoRepository<BloggerModel,String> {
}
