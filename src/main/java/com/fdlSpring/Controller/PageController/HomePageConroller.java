package com.fdlSpring.Controller.PageController;

import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/")

public class HomePageConroller {

    public String getHomePage(){
        return "index.jsp";
    }
}
