package com.academie.actiuni;

public class Conducator {
    private Basculanta basculanta;
    private Tir tir;
    private int verif = 0;
    private Bicicleta bicicleta;

    public void accelereaza() {
        System.out.println("Conducatorul accelereaza");
        if (verif == 1) {
            basculanta.accelereaza();
        } else if (verif == 2) {
            tir.accelereaza();
        } else if (verif == 3) {
            bicicleta.accelereaza();
        }else{
            System.out.println("Conducatorul nu conduce nimic");
        }
    }

    public void franeaza() {
        System.out.println("Conducatorul franeaza");
        if (verif == 1) {

            basculanta.franeaza();
        } else if (verif == 2) {

            tir.franeaza();
        } else if (verif == 3) {
            bicicleta.franeaza();
        }else{
            System.out.println("Conducatorul nu conduce nimic");
        }

    }

    public void setBasculanta(Basculanta basculanta) {
        if (verif == 0) {
            this.basculanta = basculanta;
            System.out.println("Conducatorul s-a urcat in basculanta " + basculanta.getNrInmatriculare());
            verif = 1;
        } else {
            if (verif == 1) {
                System.out.println("Conducatorul este ocupat cu basculanta" + this.basculanta.getNrInmatriculare());
            } else if (verif == 2) {
                System.out.println("Conducatorul este ocupat cu tirul" + this.tir.getNrInmatriculare());
            } else {
                System.out.println("Conducatorul e cu bicicleta");
            }
        }

    }

    public void dateJos() {
        if (verif != 0) {
            System.out.println("Conducatorul s-a dat jos");
            verif = 0;
        } else {
            System.out.println("Conducatorul era deja liber");
        }
    }


    public void setTir(Tir tir) {
        if (verif == 0) {
            this.tir = tir;
            System.out.println("Conducatorul s-a urcat in tirul " + tir.getNrInmatriculare());
            verif = 2;
        } else {
            if (verif == 1) {
                System.out.println("Conducatorul este ocupat cu basculanta" + this.basculanta.getNrInmatriculare());
            } else if (verif == 2) {
                System.out.println("Conducatorul este ocupat cu tirul" + this.tir.getNrInmatriculare());
            } else {
                System.out.println("Conducatorul e cu bicicleta");
            }
        }

    }

    public void setBicicleta(Bicicleta bicicleta) {
        if (verif == 0) {
            this.bicicleta = bicicleta;
            System.out.println("Conducatorul s-a urcat pe bicicleta");
            verif = 3;
        } else {
            if (verif == 1) {
                System.out.println("Conducatorul este ocupat cu basculanta" + this.basculanta.getNrInmatriculare());
            } else if (verif == 2) {
                System.out.println("Conducatorul este ocupat cu tirul" + this.tir.getNrInmatriculare());
            } else {
                System.out.println("Conducatorul e cu alta bicicleta");
            }
        }
    }
}
