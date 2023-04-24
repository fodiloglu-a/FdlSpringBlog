package com.fdlSpring.Model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class BlogModel {



    @Id
    private  String  blogId;
    private  String  blogTitle;
    private  String  blogText;
    private  String  blogComment;


}
