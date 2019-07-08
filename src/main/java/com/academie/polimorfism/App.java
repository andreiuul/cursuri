package com.academie.polimorfism;

public class App {

    public static void main(String[] args) {
        Calculator c = new Calculator();
        c.aduna(1, -7);
        c.aduna((double)1, (double)-7);
        c.aduna(1, (double)-7);
        c.aduna(3.2, 6.4);
    }

}
