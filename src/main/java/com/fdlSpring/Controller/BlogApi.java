package com.fdlSpring.Controller;

import com.fdlSpring.Facades.BlogDto.BlogRequest;
import com.fdlSpring.Facades.BlogDto.BlogResponse;
import com.fdlSpring.Facades.FacadesMapping.Implament.BlogFacadesImp;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/blog")
public class BlogApi {

    @Resource
    private BlogFacadesImp blogFacadesImp;


    @PostMapping("/creatBlog")
    public String creatBlog(@RequestBody BlogRequest blogRequest){
        return this.blogFacadesImp.createBlog(blogRequest);

    }

    @GetMapping("/getBlogById")
    public BlogResponse getBlogById(@RequestParam String id){
        return this.blogFacadesImp.getBlogById(id);


    }

    @GetMapping("/getBlogByTitle")
    public BlogResponse getBlogByTitle(@RequestParam String title){
        return this.blogFacadesImp.getBlogByTitle(title);
    }
















}
