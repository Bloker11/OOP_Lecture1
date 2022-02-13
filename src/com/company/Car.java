package com.company;

public class Car implements Refuelable, Comparable<Car>{
    public String model;
    public String producer;
    public Double engineVolume;

    public Car(String model, String producer) {
        this.model = model;
        this.producer = producer;
    }

    public Car(String model, String producer, Double engineVolume) {
        this.model = model;
        this.producer = producer;
        this.engineVolume = engineVolume;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", producer='" + producer + '\'' +
                '}';
    }

    @Override
    public void refuel() {
        System.out.println("refueld to full");
    }

    @Override
    public void refuel(double volume) {
        System.out.println("refueld " + volume + " liters");
    }

    @Override
    public void refuel(int percentage) {
        System.out.println("refueld with " + percentage + "%");
    }

    @Override
    public int compareTo(Car o) {
        return this.producer.compareTo(o.producer);
    }
}
