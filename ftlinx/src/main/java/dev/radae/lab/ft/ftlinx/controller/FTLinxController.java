package dev.radae.lab.ft.ftlinx.controller;

import dev.radae.lab.ft.ftlinx.service.FTLinxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/ftlinx")
public class FTLinxController {

    @Autowired
    private FTLinxService ftLinxService;

    @RequestMapping("list")
    public Object list(){
        return ftLinxService.listDevice();

    }

    @RequestMapping("find")
    public Object findById(@RequestParam("id") int id){
        return ftLinxService.findById(id);
    }
}
