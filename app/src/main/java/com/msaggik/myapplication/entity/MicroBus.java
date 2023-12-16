package com.msaggik.myapplication.entity;

public class MicroBus implements cars {

    @Override
    public int getCapacity() {
        return 8;
    }

    @Override
    public int getMaxSpeed() {
        return 180;
    }

    @Override
    public double getWeight() {
        return 1.6;
    }
}
