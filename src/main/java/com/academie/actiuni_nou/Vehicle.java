package com.academie.actiuni_nou;

public abstract class Vehicle {

    protected String nrInmatriculare;
    private int nrRoti;

    public Vehicle(String nrInmatriculare, int nrRoti) {
        this.nrInmatriculare = nrInmatriculare;
        this.nrRoti = nrRoti;
    }

    public String getNrInmatriculare() {
        return nrInmatriculare;
    }

    public int getNrRoti() {
        return nrRoti;
    }

    public abstract void accelereaza();

    public abstract void franeaza();
}