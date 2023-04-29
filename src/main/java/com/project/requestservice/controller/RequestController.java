package com.project.requestservice.controller;

import com.project.requestservice.model.Request;
import com.project.requestservice.service.RequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/request")
@CrossOrigin
public class RequestController {
    @Autowired
    private RequestService requestService;

    @PostMapping("/add")
    public String add(@RequestBody Request request){
        requestService.saveRequest(request);
        return "New order is made";
    }

    @GetMapping("/getAll")
    public List<Request> list(){
        return requestService.getAllStudents();
    }
}
