package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Sunglasses sunglasses=null;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Choose model \n1. Rayban\n2. com.company.Sushi\n3. Paris ");
        int model=scanner.nextInt();
        sunglasses=FactoryClass.getInstance(model);
        sunglasses.wear();
        sunglasses.remove();
    }
}
