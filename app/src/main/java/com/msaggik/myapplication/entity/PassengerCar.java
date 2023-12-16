package com.msaggik.myapplication.entity;

 public class PassengerCar implements cars {
     @Override
     public int getCapacity() {
         return 5;
     }

     @Override
     public int getMaxSpeed() {
         return 220;
     }

     @Override
     public double getWeight() {
         return 1.2;
     }
 }
