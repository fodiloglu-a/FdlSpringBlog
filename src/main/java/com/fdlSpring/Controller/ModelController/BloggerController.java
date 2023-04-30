package com.fdlSpring.Controller.ModelController;


import com.fdlSpring.Facades.BloggerDTO;
import com.fdlSpring.Facades.FacadesMapping.Implament.BloggerFacadesImp;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/blogger")
public class BloggerController {
    @Resource
    private BloggerFacadesImp bloggerFacadesImp;


    @PostMapping("/create")
    public String createBlogger(@RequestBody BloggerDTO request){
        return bloggerFacadesImp.createBlogger(request);
    }



    @PutMapping("/update")
    public String updateBlogger(@RequestBody BloggerDTO request, @RequestParam String id){
        return bloggerFacadesImp.updateBlogger(request,id);
    }
    @DeleteMapping("/delete")
    public String deleteBloggerById(@RequestParam String id){
        return bloggerFacadesImp.deleteBloggerById(id);
    }


    @GetMapping("/getById")
    public BloggerDTO getById(@RequestParam String id){
        return bloggerFacadesImp.getById(id);
    }
    @GetMapping("/getBlogger")
    public List<BloggerDTO> getAllBlogger(){
        return bloggerFacadesImp.getAllBlogger();
    }


}
