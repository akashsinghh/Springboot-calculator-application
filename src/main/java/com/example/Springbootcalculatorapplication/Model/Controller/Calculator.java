package com.example.Springbootcalculatorapplication.Model.Controller;

import com.example.Springbootcalculatorapplication.Model.Student;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class Calculator {
    @RequestMapping("/add")
    public int add(){
        int a=5;int b=6;int sum=a+b;
        System.out.println("Print addition: "+sum);
        return sum;
    }
    @RequestMapping("/subtraction")
    public int subtraction(){
        int a=5;int b=6;int sub=a-b;
        System.out.println("Print subtraction: "+sub);
        return sub;
    }
    @RequestMapping("/mutiply")
    public int mutiply(){
        int a=5;int b=6;int mul=a*b;
        System.out.println("Print mutiply: "+mul);
        return mul;
    }
    @RequestMapping("/divide")
    public int divide(){
        int a=84;int b=4;int div=a/b;
        System.out.println("Print divide: "+div);
        return div;
    }
    @RequestMapping("/course")
    public ArrayList<String> getcourse(){
        ArrayList<String> course= new ArrayList<>();
        course.add("JAVA");
        course.add("Springboot");
        course.add("Microservices");
        for(String var:course){
            System.out.println(var);
        }
        return course;
    }
    @RequestMapping("/student")
    public Student getstudent(){
        Student obj=new Student("Akash","IT",24);

        return obj;
    }

}
