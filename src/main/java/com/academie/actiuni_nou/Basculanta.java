package com.academie.actiuni_nou;

public class Basculanta extends Vehicle {

    public Basculanta(String nrInmatriculare, int nrRoti) {
        super(nrInmatriculare, nrRoti);
    }

    @Override
    public void accelereaza() {
        System.out.println("Basculanta " + this.nrInmatriculare +  " accelereaza");

    }

    @Override
    public void franeaza() {

    }
}