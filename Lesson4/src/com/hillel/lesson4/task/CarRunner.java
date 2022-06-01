package com.hillel.lesson4.task;

public class CarRunner {
    public static void main(String[] args) {
        double[] stations = {178.5, 152.8, 148.2};

        // 179 км Одесса - Кривое Озеро,
        // 153 км Кривое Озеро - Жашков,
        // 148 км Жашков - Киев.

        Car bmwX5 = new Car(80, 80, 9.6);
        System.out.println("""
                BMW X5\s
                Volume Tank: 80 liters
                Kilometers per liters: 9.6\040
                Gasoline cost: 57 grn""");
        System.out.println();


        for (double station : stations) {
            System.out.println(bmwX5.reFuel(bmwX5.drive(station)) * Double.parseDouble(args[0]) + " paid grn");
            bmwX5.addPetrol();
            System.out.println();

        }

        System.out.println(bmwX5.reFuel(bmwX5.drive(479.5)) * Double.parseDouble(args[0]) + " grn - full trip");
        System.out.println();
    }
}
