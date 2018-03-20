package com.company;

public class ModelDemo
{
    public static void main(String[] args)
    {
        StaffModel sd1 = new StaffModel();
        sd1.setId(111);
        sd1.setAge(12);
        sd1.setSalary(1000);
        sd1.setName("Hehh");

        System.out.println(sd1.getId());
        System.out.println(sd1.getAge());
        System.out.println(sd1.getSalary());
        System.out.println(sd1.getName());
    }
}
