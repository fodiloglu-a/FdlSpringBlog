package com.fdlSpring.Controller.ModelController;

import com.fdlSpring.Facades.AdminDTO.AdminRequest;
import com.fdlSpring.Facades.AdminDTO.AdminResponse;
import com.fdlSpring.Facades.FacadesMapping.Implament.AdminFacadesImp;
import com.fdlSpring.Facades.ReaderDTO.ReaderRequest;
import com.fdlSpring.Facades.ReaderDTO.ReaderResponse;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin")
public class AdminController {
    @Resource
    private AdminFacadesImp adminFacadesImp;

    @PostMapping("/create")
    public String createAdmin(@RequestBody AdminRequest request){
        return adminFacadesImp.createAdmin(request);
    }



    @PutMapping("/update")
    public String updateAdmin(@RequestBody AdminRequest request, @RequestParam String id){
        return adminFacadesImp.updateAdmin(request,id);
    }
    @DeleteMapping("/delete")
    public String deleteAdminById(@RequestParam String id){
        return adminFacadesImp.deleteAdminById(id);
    }


    @GetMapping("/getById")
    public AdminResponse getById(@RequestParam String id){
        return adminFacadesImp.getById(id);
    }
    @GetMapping("/getBlogger")
    public List<AdminResponse> getAllAdmin(){
        return adminFacadesImp.getAllAdmin();
    }
}
