package com.company;

public class Main {

    public static void main(String[] args) {
	    Student student=new StudentBuilden().getInstance();
	        student.setId(100);
	        student.setName("Soksan");
	        student.setAge(18);
	        student.showInfo();
    }
}
