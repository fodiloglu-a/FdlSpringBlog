package com.fdlSpring.Controller.ModelController;

import com.fdlSpring.Facades.FacadesMapping.Implament.ReaderFacadesImp;
import com.fdlSpring.Facades.ReaderDTO.ReaderRequest;
import com.fdlSpring.Facades.ReaderDTO.ReaderResponse;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reader")
public class ReaderController {

    @Resource
    private ReaderFacadesImp readerFacadesImp;

    @PostMapping("/create")
    public String createReader(@RequestBody ReaderRequest request){
        return readerFacadesImp.createReader(request);
    }



    @PutMapping("/update")
    public String updateReader(@RequestBody ReaderRequest request, @RequestParam String id){
        return readerFacadesImp.updateReader(request,id);
    }
    @DeleteMapping("/delete")
    public String deleteReaderById(@RequestParam String id){
        return readerFacadesImp.deleteReaderById(id);
    }


    @GetMapping("/getById")
    public ReaderResponse getById(@RequestParam String id){
        return readerFacadesImp.getById(id);
    }
    @GetMapping("/getBlogger")
    public List<ReaderResponse> getAllBlogger(){
        return readerFacadesImp.getAllReader();
    }

}
