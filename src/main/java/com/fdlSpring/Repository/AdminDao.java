package com.fdlSpring.Repository;

import com.fdlSpring.Model.AdminModel;
import com.fdlSpring.Model.CategoryModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AdminDao extends MongoRepository<AdminModel,String> {
}
