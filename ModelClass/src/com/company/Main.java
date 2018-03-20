package com.company;

class StaffModel {
    private int id, age, salary;
    private String name;
    public StaffModel() {

    }

    public int getId() {
        return id;
    }

    public int getAge()
    {
        return age;
    }
    public int getSalary()
    {
        return salary;
    }
    public String getName()
    {
        return name;
    }
    public static void main(String[] args) {
        
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setName(String name) {
        this.name = name;
    }
}
