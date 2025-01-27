package com.savisoft.apirest.controller;

import com.savisoft.apirest.entity.Local;
import com.savisoft.apirest.error.LocalNotFoundException;
import com.savisoft.apirest.service.LocalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class LocalController {

    @Autowired
    LocalService localService;

    @GetMapping("/findLocalByNameWithJPQL/{name}")
    Optional<Local> findLocalByNameWithJPQL(@PathVariable String name){
        return localService.findLocalByNameWithJPQL(name);
    }

    @GetMapping("/findByName/{name}")
    Optional<Local> findByName(@PathVariable String name){
        return localService.findByName(name);
    }
    @GetMapping("/findByNameIgnoredCase/{name}")
    Optional<Local> findByNameIgnoredCase(@PathVariable String name){
        return localService.findByNameIgnoredCase(name);
    }

    @GetMapping("/findLocalById/{id}")
    Local findByName(@PathVariable Long id) throws LocalNotFoundException {
        return localService.findLocalById(id);
    }

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
