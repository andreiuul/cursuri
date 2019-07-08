package com.academie.polimorfism;

public class AppCalculators {

    public static void main(String[] args) {
        FabricaDeCalculatoare fdc = new FabricaDeCalculatoare();
        AbstractCalculator ac = fdc.getCalculator();
        if (ac instanceof AlinCalculator) {
            AlinCalculator alinc = (AlinCalculator) ac;
            System.out.println(alinc.sum(4, 3));
        }
        System.out.println(ac.getClass());
        System.out.println(ac.multiply(7, 3));
    }

}
