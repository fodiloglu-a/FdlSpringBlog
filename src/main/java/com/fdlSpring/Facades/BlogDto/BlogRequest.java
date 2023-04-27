package com.fdlSpring.Facades.BlogDto;


import lombok.Data;

import java.time.LocalDateTime;


@Data
public class BlogRequest {

    private  String  blogId;
    private  String  blogTitle;
    private  String  blogCategoryId;
    private  String  bloggerId;
    private  byte[]  blogFile;
    private  String  blogFileId;
    private  String  blogFileSummary;
    private  byte[]  blogLogo;
    private  String  blogLogoUrl;
    private  String  blogLogoId;
    private  LocalDateTime date;
}
