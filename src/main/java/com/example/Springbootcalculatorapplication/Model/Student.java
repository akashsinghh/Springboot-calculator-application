package com.example.Springbootcalculatorapplication.Model;

public class Student {
    String name;
    String section;
    int age;

    public Student(String name, String section, int age) {
        this.name = name;
        this.section = section;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
