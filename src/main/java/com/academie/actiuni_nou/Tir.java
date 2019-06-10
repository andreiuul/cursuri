package com.academie.actiuni_nou;

public class Tir extends Vehicle {

    private boolean areRemorca;

    public Tir(String nrInmatriculare, int nrRoti) {
        super(nrInmatriculare, nrRoti);
        areRemorca = false;
    }

    @Override
    public void accelereaza() {
        System.out.println("Tirul " + this.nrInmatriculare + " accelereaza");
    }

    @Override
    public void franeaza() {

    }

    public void setAreRemorca(boolean areRemorca) {
        this.areRemorca = areRemorca;
    }

    public void incarca() {
        //...
    }
}
