package com.academie.polimorfism;

public class GrasuCalculator extends AbstractCalculator {


    @Override
    public int multiply(int x, int y) {
        System.out.println("Grasu se distreaza");
        int result = 0;
        while (x > 0) {
            x--;
            result += y;
        }
        return result;
    }
}
