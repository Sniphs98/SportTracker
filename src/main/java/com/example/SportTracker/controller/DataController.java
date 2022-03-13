package com.example.SportTracker.controller;

import com.example.SportTracker.service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/data")
public class DataController {

    @Autowired
    DataService dataService;

    @GetMapping("/hallo")
    public String sayHallo(){
        return dataService.sayHallo();
    }

}
