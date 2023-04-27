package com.fdlSpring.Controller.ModelController;


import com.fdlSpring.Facades.AdminDTO.AdminRequest;
import com.fdlSpring.Facades.AdminDTO.AdminResponse;
import com.fdlSpring.Facades.BloggerDTO.BloggerRequest;
import com.fdlSpring.Facades.BloggerDTO.BloggerResponse;
import com.fdlSpring.Facades.FacadesMapping.Implament.BloggerFacadesImp;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/blogger")
public class BloggerController {
    @Resource
    private BloggerFacadesImp bloggerFacadesImp;


    @PostMapping("/create")
    public String createBlogger(@RequestBody AdminRequest request){
        return bloggerFacadesImp.createBlogger(request);
    }



    @PutMapping("/update")
    public String updateBlogger(@RequestBody BloggerRequest request, @RequestParam String id){
        return bloggerFacadesImp.updateBlogger(request,id);
    }
    @DeleteMapping("/delete")
    public String deleteBloggerById(@RequestParam String id){
        return bloggerFacadesImp.deleteBloggerById(id);
    }


    @GetMapping("/getById")
    public BloggerResponse getById(@RequestParam String id){
        return bloggerFacadesImp.getById(id);
    }
    @GetMapping("/getBlogger")
    public List<BloggerResponse> getAllBlogger(){
        return bloggerFacadesImp.getAllBlogger();
    }


}
