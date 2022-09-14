package com.example.Springbootcalculatorapplication.Model.Controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PathvariableController {
    @RequestMapping("/msg/{name}")
    public String message(@PathVariable String name){
        return  "Welcome to spring boot applications: "+name;
    }
    @RequestMapping("/vote/{name}/{age}")
    public String eligibilty(@PathVariable String name,@PathVariable int age){
        if(age>=8){
            return name+" "+"Eligible for voting: ";
        }else {
            return name+ " "+ " No u r not eligible for voting :";
        }
    }

}
