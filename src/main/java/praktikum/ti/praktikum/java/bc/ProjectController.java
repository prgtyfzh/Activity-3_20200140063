/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum.ti.praktikum.java.bc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import service.ServiceProcess;

/**
 *
 * @author Pragitya Faazha
 */
@Controller
@ResponseBody
public class ProjectController {
    ServiceProcess sv = new ServiceProcess();
    
    @RequestMapping("/idrtojpy")
    public String tampilidrtojpy(){
        float idr = sv.getidrtojpy(3000);
        
        String view = "Hasil JPY = " + idr;
        
        return view;
    }
    @RequestMapping("/jpytoidr")
    public String tampiljpytoidr(){
        float jpy = sv.getjpytoidr(3000);
        
        String view = "Hasil Rupiah = " + jpy;
        
        return view;
    }
    @RequestMapping("/dollartoidr")
    public String tampildollartoidr(){
        float dollar = sv.getdollartoidr(3000);
        
        String view = "Hasil Rupiah = " + dollar;
        
        return view;
    }
    @RequestMapping("/idrtodollar")
    public String tampilidrtodollar(){
        float idr = sv.getidrtodollar(3000);
        
        String view = "Hasil Dollar = " + idr;
        
        return view;
    }
    @RequestMapping("/idrtokrw")
    public String tampilidrtokrw(){
        float idr = sv.getidrtokrw(5000);
        
        String view = "Hasil KRW = " + idr;
        
        return view;
    }
    @RequestMapping("/krwtoidr")
    public String tampilkrwtoidr(){
        float krw = sv.getkrwtoidr(5000);
        
        String view = "Hasil Rupiah = " + krw;
        
        return view;
    }
}
