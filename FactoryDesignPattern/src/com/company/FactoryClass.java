package com.company;

public class FactoryClass {
    public static Sunglasses getInstance(int model)
    {
        switch (model)
        {
            case 1:
                return new Rayban();
            case 2:
                return new Sushi();
            case 3:
                return new Paris();
            default:
                System.out.println();
                return null;
        }
    }
}
