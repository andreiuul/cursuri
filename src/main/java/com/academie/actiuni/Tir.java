package com.academie.actiuni;

public class Tir {
    private int nrRoti;
    private String nrInmatriculare;
    public Tir (int nrRoti, String nrInmatriculare){
        this.nrRoti = nrRoti;
        this.nrInmatriculare = nrInmatriculare;
    }
    public void accelereaza(){
        System.out.println("Tirul " + this.nrInmatriculare +  " accelereaza");
    }

    public void franeaza(){
        System.out.println("Tirul " + this.nrInmatriculare + " franeaza");
    }

    public int getNrRoti(){
        return this.nrRoti;
    }

    public String getNrInmatriculare(){
        return this.nrInmatriculare;
    }
}