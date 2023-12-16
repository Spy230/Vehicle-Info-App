package com.msaggik.myapplication.entity;

public class Truck implements cars {


    @Override
    public int getCapacity() {
        return 3;
    }

    @Override
    public int getMaxSpeed() {
        return 170;
    }

    @Override
    public double getWeight() {
        return 3.0;
    }
}
