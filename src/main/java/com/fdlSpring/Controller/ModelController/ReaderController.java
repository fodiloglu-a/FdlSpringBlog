package com.fdlSpring.Controller.ModelController;

import com.fdlSpring.Facades.FacadesMapping.Implament.ReaderFacadesImp;
import com.fdlSpring.Facades.ReaderDTO;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reader")
public class ReaderController {

    @Resource
    private ReaderFacadesImp readerFacadesImp;

    @PostMapping("/create")
    public String createReader(@RequestBody ReaderDTO request){
        return readerFacadesImp.createReader(request);
    }



    @PutMapping("/update")
    public String updateReader(@RequestBody ReaderDTO request, @RequestParam String id){
        return readerFacadesImp.updateReader(request,id);
    }
    @DeleteMapping("/delete")
    public String deleteReaderById(@RequestParam String id){
        return readerFacadesImp.deleteReaderById(id);
    }


    @GetMapping("/getById")
    public ReaderDTO getById(@RequestParam String id){
        return readerFacadesImp.getById(id);
    }
    @GetMapping("/getBlogger")
    public List<ReaderDTO> getAllBlogger(){
        return readerFacadesImp.getAllReader();
    }

}
