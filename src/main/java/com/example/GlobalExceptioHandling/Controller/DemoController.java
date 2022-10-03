package com.example.GlobalExceptioHandling.Controller;

import com.example.GlobalExceptioHandling.Exception.ResourceNotFoundException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {


    @GetMapping("/get/{data}")
    public String checkGlobalException(@PathVariable("data")String data){
        if(data.length()<5) {
            throw new ResourceNotFoundException("This is Resource not found Exception");
        }
        return "HelloWorld";
    }
}
