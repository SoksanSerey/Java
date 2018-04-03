package com.company;

import com.company.Sunglasses;

public class Sushi implements Sunglasses {
    @Override
    public void wear() {
        System.out.println("wear com.company.Sushi");
    }

    @Override
    public void remove() {
        System.out.println("remove com.company.Sushi");
    }
}
