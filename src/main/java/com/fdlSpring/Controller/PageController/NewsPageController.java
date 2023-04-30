package com.fdlSpring.Controller.PageController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@RequestMapping("/v")
@ResponseBody
@Controller
public class NewsPageController {

    @GetMapping()
    public String getPage(){
        return "String";
    }
}
