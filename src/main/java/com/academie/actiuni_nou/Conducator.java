package com.academie.actiuni_nou;

import java.util.Objects;

public class Conducator {



    private Vehicle vehicle;

    public void setVehicle(Vehicle vehicle) {
        if (vehicle == null) {
            throw new NullPointerException("Pe viitor un mesaj");
        }
        if (this.vehicle != null) {
            //mesaj
            return;
        }
        this.vehicle = vehicle;
    }

    public void dateJos() {
        if (vehicle != null) {
            System.out.println("Conducatorul era ocupat cu..." + vehicle.getNrInmatriculare());
            vehicle = null;
        } else {
            System.out.println("Conducatorul este deja liber!");
        }
    }
    public void accelereaza(){
        System.out.println("Conducatorul accelereaza");
        vehicle.accelereaza();
    }
}

