package com.academie.actiuni_nou;

public class Basculanta extends Vehicle {
    private String nrInmatriculare;

    public Basculanta(String nrInmatriculare, int nrRoti) {
        super(nrInmatriculare, nrRoti);
    }

    @Override
    public void accelereaza() {
        System.out.println("Basculanta " + super.nrInmatriculare +  " accelereaza");

    }

    @Override
    public void franeaza() {
        System.out.println(nrInmatriculare);
        System.out.println(super.nrInmatriculare);
    }
}