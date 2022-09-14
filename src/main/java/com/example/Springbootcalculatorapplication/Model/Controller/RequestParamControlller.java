package com.example.Springbootcalculatorapplication.Model.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestParamControlller {
    @RequestMapping("/info")
    public String info(@RequestParam String name){
        return name+" :"+ "This is a spring boot applications: ";
    }
    @RequestMapping("/skill")
    public String Skills(@RequestParam String name,@RequestParam String Skill){
        return  "This is person: " + name + "  Has skills  : "+  Skill;
    }
    @RequestMapping("/ADD")
    public String add(@RequestParam int a,@RequestParam int b){
        return "Addition : "+(a+b);
    }
    @RequestMapping("/SUBB")
    public String sub(@RequestParam int a,@RequestParam int b){
        return "Subtraction : "+(a-b);
    }@RequestMapping("/MUL")
    public String Mul(@RequestParam int a,@RequestParam int b){
        return "Multiplication : "+(a*b);
    }@RequestMapping("DIV")
    public String Div(@RequestParam int a,@RequestParam int b){
        return "Division : "+(a/b);
    }
}
