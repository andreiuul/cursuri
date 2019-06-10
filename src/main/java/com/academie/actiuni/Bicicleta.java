package com.academie.actiuni;

public class Bicicleta {
    private int nrRoti;

    public void accelereaza(){
        System.out.println("Bicicleta accelereaza");
    }

    public void franeaza(){
        System.out.println("Bicicleta franeaza");
    }

    public int getNrRoti(){
        return 2;
    }

    public String getNrInmatriculare(){
        return "N/A";
    }
}