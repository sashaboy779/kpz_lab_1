package com.oleksandr;

public class Main {

    public static void main(String[] args) {
        var car1 = CarsFactory.getCar(CarType.FORD);
        var car2 = CarsFactory.getCar(CarType.FERRARI);
    }
}
