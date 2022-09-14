package com.example.Springbootcalculatorapplication.Model.Controller;

import com.example.Springbootcalculatorapplication.Model.Student;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class StudentControllerCrud {
    ArrayList<Student> studentArrayList =new ArrayList<>();
    @RequestMapping("/add_student/{name}/{section}/{age}")
    public String add(@PathVariable String name,@PathVariable String section,@PathVariable int age){
        Student student =new Student(name,section,age);
        studentArrayList.add(student);
        return  "Student added successfully";
    }
    @RequestMapping("/Students")
    public ArrayList<Student> getStudentArrayList(){
        return studentArrayList;
    }
    @RequestMapping("/Student")
    public String Updatename(@RequestParam String name,@RequestParam int index){
        Student student=studentArrayList.get(index);
        student.setName(name);

        return "Successfully update: ";
    }

    @RequestMapping("/delete")
    public String delete(@RequestParam  int index){
        studentArrayList.remove(index);
        return "succesfullydeletd ";

    }

}
