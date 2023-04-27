package com.fdlSpring.Repository;

import com.fdlSpring.Model.CategoryModel;
import com.fdlSpring.Model.ReaderModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ReaderDao extends MongoRepository<ReaderModel,String> {
}
