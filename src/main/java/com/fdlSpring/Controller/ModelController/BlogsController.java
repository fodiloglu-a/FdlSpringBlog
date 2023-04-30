package com.fdlSpring.Controller.ModelController;

import com.fdlSpring.Facades.BlogDTO;
import com.fdlSpring.Facades.FacadesMapping.Implament.BlogFacadesImp;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/blog")
public class BlogsController {

    @Resource
    private BlogFacadesImp blogFacadesImp;


    @PostMapping("/creatBlog")//Buraya gelen ımage dosyasının kontrolü  ve eklenene blog ile ilgili dosyaların kotrolü yapılacak.
    public String creatBlog(@RequestBody BlogDTO blogDTO){
        return this.blogFacadesImp.createBlog(blogDTO);

    }
    @PutMapping("/updateBlog")
    public  String updateBlog(@RequestBody BlogDTO blogDTO ,@RequestParam String id){
        return this.blogFacadesImp.updateBlog(blogDTO,id);
    }

    @GetMapping("/getBlogById")
    public BlogDTO getBlogById(@RequestParam String id){
        return this.blogFacadesImp.getBlogById(id);


    }

    @GetMapping("/getBlogByTitle")
    public BlogDTO getBlogByTitle(@RequestParam String title){
        return this.blogFacadesImp.getBlogByTitle(title);
    }

    @GetMapping("/getBlogsByCategory")
    public List<BlogDTO> getBlogsByCategory(@RequestParam String category){
        return this.blogFacadesImp.getBlogsByCategory(category);
    }

    @GetMapping("/getBlogsByBloggerId")
    public List<BlogDTO> getBlogsByBloggerId(String id){
        return this.blogFacadesImp.getBlogsByBloggerId(id);
    }
















}
