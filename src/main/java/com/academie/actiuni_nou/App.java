package com.academie.actiuni_nou;

import java.sql.SQLOutput;

public class App {

    public static void main(String[] args) {
        Vehicle v = new Tir("B12COM", 12);
        Vehicle tir = new Tir("IF16LAC", 16);
        Vehicle basculanta1 = new Basculanta("MS14DUF", 8);
        Tir tir2 = new Tir("DJ44MAC", 2);
        Conducator conducator = new Conducator();
        conducator.setVehicle(tir);
        //conducator.setVehicle(null);
        conducator.accelereaza();
        conducator.dateJos();
        conducator.dateJos();
        conducator.setVehicle(basculanta1);
        conducator.accelereaza();


//        v = null;
//        System.out.println(v instanceof Vehicle);
//        System.out.println(v instanceof Tir);
//        System.out.println(v instanceof Object);
//        System.out.println(v instanceof Basculanta);

        //System.out.println(v instanceof Conducator);

        //TODO
        // 10 copiem din app vechi si adaptam
        // 2 implementam in conducator accelereaza
    }
}