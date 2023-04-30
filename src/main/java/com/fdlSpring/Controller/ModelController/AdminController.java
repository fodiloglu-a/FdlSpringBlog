package com.fdlSpring.Controller.ModelController;

import com.fdlSpring.Facades.AdminDTO;
import com.fdlSpring.Facades.FacadesMapping.Implament.AdminFacadesImp;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin")
public class AdminController {
    @Resource
    private AdminFacadesImp adminFacadesImp;

    @PostMapping("/create")
    public String createAdmin(@RequestBody AdminDTO request){
        return adminFacadesImp.createAdmin(request);
    }



    @PutMapping("/update")
    public String updateAdmin(@RequestBody AdminDTO request, @RequestParam String id){
        return adminFacadesImp.updateAdmin(request,id);
    }
    @DeleteMapping("/delete")
    public String deleteAdminById(@RequestParam String id){
        return adminFacadesImp.deleteAdminById(id);
    }


    @GetMapping("/getById")
    public AdminDTO getById(@RequestParam String id){
        return adminFacadesImp.getById(id);
    }

    @GetMapping("/getAll")
    public List<AdminDTO> getAllAdmin(){
        return adminFacadesImp.getAllAdmin();
    }
}
