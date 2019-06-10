package com.academie.actiuni;

public class Basculanta {
    private int nrRoti;
    private String nrInmatriculare;
    public Basculanta (int nrRoti, String nrInmatriculare){
        this.nrRoti = nrRoti;
        this.nrInmatriculare = nrInmatriculare;
    }
    public void accelereaza(){
        System.out.println("Basculanta " + this.nrInmatriculare +  " accelereaza");
    }

    public void franeaza(){
        System.out.println("Basculanta " + this.nrInmatriculare + " franeaza");
    }

    public int getNrRoti(){
        return this.nrRoti;
    }

    public String getNrInmatriculare(){
        return this.nrInmatriculare;
    }
}
