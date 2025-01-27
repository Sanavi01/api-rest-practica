package com.savisoft.apirest.controller;

import com.savisoft.apirest.entity.Local;
import com.savisoft.apirest.service.LocalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LocalController {

    @Autowired
    LocalService localService;

    @GetMapping("/findAllLocals")
    public List<Local> findAllLocals(){
        return localService.findAllLocals();
    }

    @PostMapping("/saveLocal")
    public Local saveLocal(@RequestBody Local local){
        return localService.saveLocal(local);
    }

    @PutMapping("/updateLocal/{id}")
    public Local updateLocal(@PathVariable Long id, @RequestBody Local local){
        return  localService.updateLocal(id, local);
    }

    @DeleteMapping("/deleteLocal/{id}")
    public void deleteLocal(@PathVariable Long id){
        localService.deleteLocal(id);
    }









}
