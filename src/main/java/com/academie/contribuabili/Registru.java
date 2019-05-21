package com.academie.contribuabili;

public enum Registru {

    REGISTRU,

    REGISTRU_PROVINCIE;

    private int counter = 0;

    private Contribuabil[] contribuabili = new Contribuabil[2];

    private Registru() {}

    public void adaugaContribuabil(Contribuabil contribuabil) {
        if (counter + 1 > contribuabili.length) {
            dubleazaArray();
        }
        contribuabili[counter] = contribuabil;
        counter++;
    }

    private void dubleazaArray() {
        Contribuabil[] nouArray = new Contribuabil[contribuabili.length * 2];

        for (int i = 0; i < contribuabili.length; i++) {
            nouArray[i] = contribuabili[i];
        }
        contribuabili = nouArray;

    }

    public void stergeContribuabil(Contribuabil contribuabil) {

        for (int i = 0; i < counter; i++) {

            if (contribuabil.getId() == contribuabili[i].getId()) {
                for (int j = i; j < counter-1; j++) {
                    contribuabili[j] = contribuabili[j + 1];

                }
                contribuabili[counter-1] = null;
                counter--;
                break;
            }

        }

    }
    public int getNumarContribuabili() {
        return counter;
    }


}
