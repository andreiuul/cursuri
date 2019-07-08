package com.academie.colecti;

import java.util.*;

public class AppColecti2 {

    java.sql.Date d;
    Date d1;

    public static void main(String[] args) {
        // a doua <Masina> e optionala
        //ArrayList<Masina> masini = new ArrayList<Masina>();
        List<Masina> masini = new LinkedList();
        Masina peCareVreauSaRemove;
        masini.add(peCareVreauSaRemove = new Masina("DJ 13 LIE", 180));
        masini.add(new Masina("DJ 14 LIE", 190));
        masini.add(new Masina("DJ 15 LIE", 200));
        Iterator<Masina> it = masini.iterator();
        for (;it.hasNext();) {
            System.out.println(it.next());
        }
        System.out.println("===============");
        masini.forEach(System.out::println);
        System.out.println("===============");
        System.out.println(masini);
        System.out.println(masini.size());
//        masini.add(new Object());
//        masini.add("Vasile");
//        masini.add(null);
        masini.remove(1);
        System.out.println(masini);
        System.out.println(masini.size());

//        masini.remove(2);
//        System.out.println(masini);
//        System.out.println(masini.size());

        masini.remove(new Masina("DJ 13 LIE", 180));
//      //masini.remove(peCareVreauSaRemove);
        System.out.println(masini);
        System.out.println(masini.size());

        System.out.println(masini.isEmpty());

        System.out.println(masini.get(0));

        String[] cuvinte = new String[] {"ana", "are", "mere", "si", "prune"};
        System.out.println(concat(cuvinte).toString());

        System.out.println("========================");
        List<String> words = new ArrayList<>();
        words.add("Bunica");
        words.add("Mamica");
        words.add("Adela");
        words.add("Cristina");
        Collections.sort(words);
        System.out.println(words);

        System.out.println("========================");
        List<Masina> cars = new ArrayList<>();
        cars.add(new Masina("N17", 1));
        cars.add(new Masina("N16", 0));
        cars.add(new Masina("n3", 2));
        cars.add(new Masina("a2", 3));
        Collections.sort(cars, new Comparator<Masina>() {
            @Override
            public int compare(Masina o1, Masina o2) {
                return o1.getNrInmatriculare().compareTo(o2.getNrInmatriculare());
            }
        });
        System.out.println(cars);
    }

    public static StringBuilder concat(String[] cuvinte) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < cuvinte.length - 1; i++) {
            result.append(cuvinte[i]).append(",");
        }
        return result.append(cuvinte[cuvinte.length - 1]);
        //return result;
    }
}
