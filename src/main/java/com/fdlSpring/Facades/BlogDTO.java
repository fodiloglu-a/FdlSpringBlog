package com.fdlSpring.Facades;


import lombok.Data;

import java.time.LocalDateTime;


@Data
public class BlogDTO {

    private  String  blogId;
    private  String  blogTitle;
    private  String  blogCategoryId;
    private  String  bloggerId;
    private  byte[]  blogFile;//file dao oluşturulacak
    private  String  blogFileId;
    private  String  blogFileSummary;
    private  byte[]  blogLogo; //logo dao oluşturulacak
    private  String  blogLogoUrl;
    private  String  blogLogoId;
    private  LocalDateTime date;//işlemleri yapılacak
}
