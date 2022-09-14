package com.example.Springbootcalculatorapplication.Model.Controller;

import com.example.Springbootcalculatorapplication.Model.Employee;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class EmployeeCrud {
    ArrayList<Employee> employeeArrayList =new ArrayList<>();
    @RequestMapping("/addstudent/{name}/{department}/{salary}")
    public String add(@PathVariable String name, @PathVariable String department, @PathVariable int salary){

        Employee employee=new Employee(name,department,salary);
        employeeArrayList.add(employee);
        return "Successfully added your employee data";
    }
    @RequestMapping("/employee")
    public ArrayList<Employee> getEmployee(){
        return employeeArrayList;
    }
    @RequestMapping("/empupdate")
    public String updatename(@RequestParam String name,@RequestParam int index) {
        Employee employee = employeeArrayList.get(index);
        employee.setName(name);


        return "Successfully update name";
    }
    @RequestMapping("/deleteakas")
    public  String delete(@RequestParam int index){
        employeeArrayList.remove(index);
        return "Delete succesffully";

    }
}
