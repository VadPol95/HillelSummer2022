package com.hillel.lesson4.task;

public class Car { // Машина БМВ Х5

    private final double volumeTank;   // обьем бака
    private final double restInTheTank;    // остаток в баке
    private final double kilometerPerLiter;  // расход топлива на 100 км


    public Car(double volumeTank, double restInTheTank, double kilometerPerLiter) {
        this.volumeTank = volumeTank;
        this.restInTheTank = restInTheTank;
        this.kilometerPerLiter = kilometerPerLiter;

    }

    public void addPetrol() { //Залить полный бак с учетом остатка
        double rest = volumeTank - restInTheTank;
        double result = rest + restInTheTank;
        System.out.println("Petrol station: poured gasoline full tank");

    }

    public double drive(double km) { // Определить остаток топлива по преодолении N км
        double consPerKm = kilometerPerLiter / 100;
        double consMultiplyPerKm = consPerKm * km;
        double result = restInTheTank - consMultiplyPerKm;
        System.out.println("After overcoming " + km + " km, there was gasoline left " + result);
        return result;


    }

    public double reFuel(double reFuel) { // Определить сколько надо дозаправить топлива при преодолении N км
        double result = volumeTank - reFuel;
        System.out.println("Need to fill up with petrol: " + result);
        return result;
    }

}
