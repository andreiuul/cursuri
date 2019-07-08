package com.academie.polimorfism;

import java.util.Random;

public class FabricaDeCalculatoare {

    private Random rnd = new Random();

    public AbstractCalculator getCalculator() {
        if (rnd.nextBoolean()) {
            return new AlinCalculator();
        }
        return new GrasuCalculator();
    }

}
