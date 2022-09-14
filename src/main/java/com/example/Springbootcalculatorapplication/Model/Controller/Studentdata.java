package com.example.Springbootcalculatorapplication.Model.Controller;

import com.example.Springbootcalculatorapplication.Model.Student;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class Studentdata {
    @RequestMapping("/students")
    public Student getfirstStudent(){
        ArrayList<Student> students=new ArrayList<>();
        Student obj=new Student("akash","IT",24);
        Student obj2=new Student("Rahul","Civil",26);
        Student obj3=new Student("Gajendr verma","Singer",32);
        students.add(obj);
        students.add(obj2);
        students.add(obj3);
        for (Student var:students){
            System.out.println(var);
        }
        return students.get(1);

    }
   // @RequestMapping("/getempl")
//    public String getempl(){
//        Employee obj=new Employee("Akash","CS",75000);
//        //return ;
//    }

}
