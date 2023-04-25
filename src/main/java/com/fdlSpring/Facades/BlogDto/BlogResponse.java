package com.fdlSpring.Facades.BlogDto;

import lombok.Data;

@Data
public class BlogResponse {

    private  String  blogId;
    private  String  blogTitle;
    private  String  blogCategory;
    private  String  blogger;
    private  byte[]  blogFile;
    private  String  blogFileId;
    private  String  blogFileSummary;
    private  byte[]  blogImage;
    private  byte[]  blogImageUrl;
    private  byte[]  blogImageId;
}
