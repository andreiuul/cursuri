package com.academie.actiuni;

public class App {
    public static void main(String[] args) {
        Conducator conducator = new Conducator();
        Basculanta basculanta1 = new Basculanta(4,"B05JWX");
        Basculanta basculanta2 = new Basculanta(4,"IF02JKX");
        Tir tir1=new Tir(12,"B09TIU");
        conducator.setBasculanta(basculanta1);
        conducator.accelereaza();
        //conducator.setBasculanta(basculanta2);
        //conducator.accelereaza();
        conducator.dateJos();
        conducator.setTir(tir1);
        conducator.franeaza();
        conducator.dateJos();

        //Adauga bicileta( nu are nr de inmatriculare)
// cu model sau serie si nr de roti
// pentru setTir sau setBas. sa se afiseze un mesaj
        Bicicleta bike = new Bicicleta();
        Bicicleta bike2 = new Bicicleta();
        conducator.setBicicleta(bike);
        conducator.accelereaza();
        conducator.franeaza();
        conducator.setBicicleta(bike2);
        conducator.dateJos();
    }
}