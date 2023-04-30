package com.fdlSpring.Controller.ModelController;

import com.fdlSpring.Facades.FacadesMapping.Implament.FileFacadesImp;
import com.fdlSpring.Facades.FileDTO;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/file")
public class FileController {

    @Resource
    private FileFacadesImp fileFacadesImp;

    @PostMapping("/add")
    private String add(@RequestBody FileDTO dto){
        return fileFacadesImp.add(dto);
    }
    @GetMapping("/getById")
    private FileDTO getById(@RequestParam String id){
        return fileFacadesImp.getById(id);
    }
    @DeleteMapping
    private String delete(@RequestParam String id){
        return fileFacadesImp.delete(id);
    }

    @GetMapping("/getAll")
    private List<FileDTO> getAll(){
        return fileFacadesImp.getAll();
    }

    @PutMapping("/update")
    private String update(@RequestBody FileDTO dto,@RequestParam String id){
        return this.fileFacadesImp.update(dto,id);
    }


}
