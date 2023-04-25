package com.fdlSpring.Repository;


import com.fdlSpring.Model.CategoryModel;
import org.springframework.data.mongodb.core.index.MongoPersistentEntityIndexResolver;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryDao extends MongoRepository<CategoryModel,String> {
}
