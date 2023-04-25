package com.fdlSpring.Beans.FacadesBeans;

import com.fdlSpring.Facades.FacadesMapping.Implament.BlogFacadesImp;
import com.fdlSpring.Facades.FacadesMapping.Implament.CategoryFacadesImp;
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
}
