package com.academie.polimorfism;

public class Cat extends Animal {

    @Override
    public void makeNoise() {
        System.out.println("Cat making noise...");
        super.makeNoise();
    }
}
