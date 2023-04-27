package com.fdlSpring.Controller;

import com.fdlSpring.Facades.BlogDto.BlogRequest;
import com.fdlSpring.Facades.BlogDto.BlogResponse;
import com.fdlSpring.Facades.FacadesMapping.Implament.BlogFacadesImp;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/blog")
public class BlogsPageController {

    @Resource
    private BlogFacadesImp blogFacadesImp;


    @PostMapping("/creatBlog")
    public String creatBlog(@RequestBody BlogRequest blogRequest){
        return this.blogFacadesImp.createBlog(blogRequest);

    }
    @PutMapping("/updateBlog")
    public  String updateBlog(@RequestBody  BlogRequest blogRequest){
        return this.blogFacadesImp.updateBlog(blogRequest);
    }

    @GetMapping("/getBlogById")
    public BlogResponse getBlogById(@RequestParam String id){
        return this.blogFacadesImp.getBlogById(id);


    }

    @GetMapping("/getBlogByTitle")
    public BlogResponse getBlogByTitle(@RequestParam String title){
        return this.blogFacadesImp.getBlogByTitle(title);
    }

    @GetMapping("/getBlogsByCategory")
    public List<BlogResponse> getBlogsByCategory(@RequestParam String category){
        return this.blogFacadesImp.getBlogsByCategory(category);
    }

    @GetMapping("/getBlogsByBloggerId")
    public List<BlogResponse> getBlogsByBloggerId(String id){
        return this.blogFacadesImp.getBlogsByBloggerId(id);
    }
















}
