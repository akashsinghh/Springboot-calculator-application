package com.example.Springbootcalculatorapplication.Model.Controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorofPAth {
    @RequestMapping("/add/{a}/{b}")
    public String add(@PathVariable int a,@PathVariable int b){
        return "Addition of :"+(a+b);
    }
    @RequestMapping("/sub/{a}/{b}")
    public  String sub(@PathVariable int a,@PathVariable int b){
        return "Subtraction of :"+(a-b);
    }
    @RequestMapping("/mul/{a}/{b}")
    public String mul(@PathVariable int a,@PathVariable int b){
        return "Multiplication of :"+(a*b);

    }
    @RequestMapping("/Division/{a}/{b}")
    public String Division(@PathVariable int a,@PathVariable int b){
        return "Division of :"+(a/b);
    }@RequestMapping("/Square/{num}")
    public String Square(@PathVariable int num){
        return "Squaring the numbers: "+num * num;
    }
    @RequestMapping("/cube/{num}")
    public String cube(@PathVariable int num)
    {
        return "Cube the numbers: "+ num * num * num;
    }
    @RequestMapping("/Evenodd/{num}")
    public String Evenodd(@PathVariable int num){
        if(num%2==0){
            return "This number is even :"+num;
        }else {
            return "This number is odd :"+num;
        }

    }
}
