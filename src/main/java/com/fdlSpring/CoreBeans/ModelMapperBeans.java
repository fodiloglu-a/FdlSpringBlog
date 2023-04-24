package com.fdlSpring.CoreBeans;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class ModelMapperBeans {

    @Bean
    public ModelMapper modelMapper(){
        return new ModelMapper();
    }
}
