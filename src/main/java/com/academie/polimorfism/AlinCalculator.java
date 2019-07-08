package com.academie.polimorfism;

public class AlinCalculator extends AbstractCalculator {


    @Override
    public int multiply(int x, int y) {
        System.out.println("Alin calculeaza");
        return x * y;
    }

    public int sum(int x, int y) {
        System.out.println("Alin insumeaza...");
        return x + y;
    }
}
