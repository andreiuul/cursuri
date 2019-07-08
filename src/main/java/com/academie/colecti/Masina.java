package com.academie.colecti;

import java.util.Objects;

public class Masina /*implements Comparable<Masina>*/ {

    private String nrInmatriculare;
    private int odometru;

    public Masina(String nrInmatriculare, int odometru) {
        this.nrInmatriculare = nrInmatriculare;
        this.odometru = odometru;
    }

    public String getNrInmatriculare() {
        return nrInmatriculare;
    }

    public int getOdometru() {
        return odometru;
    }

    @Override
    public String toString() {
        return "Masina cu nr: " + nrInmatriculare + " odo:" + odometru;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Masina masina = (Masina) o;
        return odometru == masina.odometru &&
                nrInmatriculare.equals(masina.nrInmatriculare);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nrInmatriculare, odometru);
    }

    /*@Override
    public int compareTo(Masina o) {
        return nrInmatriculare.compareTo(o.nrInmatriculare);
    }*/
}
