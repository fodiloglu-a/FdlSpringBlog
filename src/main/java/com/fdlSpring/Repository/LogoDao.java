package com.fdlSpring.Repository;

import com.fdlSpring.Model.FileModel;
import com.fdlSpring.Model.LogoModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface LogoDao extends MongoRepository<LogoModel,String> {
}
