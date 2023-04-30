package com.fdlSpring.Beans.FacadesBeans;

import com.fdlSpring.Facades.FacadesMapping.Implament.*;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class FacadesBeans {
    @Bean
    public BlogFacadesImp blogFacadesImp(){
        return new BlogFacadesImp();
    }

    @Bean
    public CategoryFacadesImp categoryFacadesImp(){
        return new CategoryFacadesImp();
    }

    @Bean
    public AdminFacadesImp adminFacadesImp(){return new AdminFacadesImp();}

    @Bean
    public BloggerFacadesImp bloggerFacadesImp(){return new BloggerFacadesImp();}

    @Bean
    public ReaderFacadesImp readerFacadesImp(){return new ReaderFacadesImp();}
    @Bean
    public FileFacadesImp fileFacadesImp(){
        return new FileFacadesImp();
    }
    @Bean
    public LogoFacadesImp logoFacadesImp(){
        return new LogoFacadesImp();
    }


}
