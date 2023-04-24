package com.fdlSpring.Facades.BlogDto;


import lombok.Data;

@Data
public class BlogRequest {

    private  String  blogId;
    private  String  blogTitle;
    private  String  blogText;
    private  String  blogComment;
}
