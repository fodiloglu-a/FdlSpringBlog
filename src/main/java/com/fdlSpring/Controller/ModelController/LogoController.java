package com.fdlSpring.Controller.ModelController;

import com.fdlSpring.Facades.FacadesMapping.Implament.LogoFacadesImp;
import com.fdlSpring.Facades.LogoDTO;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class LogoController {
    @Resource
    private LogoFacadesImp logoFacadesImp;

    @PostMapping("/add")
    private String add(@RequestBody LogoDTO dto){
        return logoFacadesImp.add(dto);
    }
    @GetMapping("/getById")
    private LogoDTO getById(@RequestParam String id){
        return logoFacadesImp.getById(id);
    }
    @DeleteMapping
    private String delete(@RequestParam String id){
        return logoFacadesImp.delete(id);
    }

    @GetMapping("/getAll")
    private List<LogoDTO> getAll(){
        return logoFacadesImp.getAll();
    }

    @PutMapping("/update")
    private String update( @RequestBody  LogoDTO dto,@RequestParam String id){
        return this.logoFacadesImp.update(dto,id);
    }
}
