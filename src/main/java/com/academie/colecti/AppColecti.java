package com.academie.colecti;

public class AppColecti {

    public static void main(String[] args) {
        Masina[] masini = new Masina[3];
        masini[0] = new Masina("B 18 XXX", 180);
        masini[1] = new Masina("dj 13 lie", 200);
        masini[2] = new Masina("CT 05 BYW", 210);

        System.out.println(masini[0]);
        System.out.println(masini[1]);
        System.out.println(masini[2]);



        Masina[] tmp = new Masina[masini.length * 2];
        for (int i = 0; i < masini.length; i++) {
            tmp[i] = masini[i];
        }
        masini = tmp;
        masini[3] = new Masina("B 12 TTT", 120);

        System.out.println(masini[3]);
    }
}
