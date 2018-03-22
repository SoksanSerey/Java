package com.company;

public class StudentBuilden {
    private int id;
    private String name;
    private int age;

    public StudentBuilden setId(int id) {
        this.id = id;
        return this;
    }

    public StudentBuilden setName(String name) {
        this.name = name;
        return this;
    }

    public StudentBuilden setAge(int age) {
        this.age = age;
        return this;
    }
    public Student getInstance()
    {
        Student s=new Student(id,name,age);
        return s;
    }
}
