package com.fdlSpring.Repository;

import com.fdlSpring.Model.FileModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface FileDao extends MongoRepository<FileModel,String> {
}
