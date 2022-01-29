package com.example.aopexample.service;


import org.springframework.stereotype.Component;


@Component
public class Car implements Vehicle {

    private int radius;
    private int noOfCylinder;

    @Override
    public void setConfig(int config1, int config2) {
        this.radius = config1;
        this.noOfCylinder = config2;
    }

    @Override
    public double cc() {
        return PI * this.radius * this.radius* stroke * this.noOfCylinder;
    }

    @Override
    public void color(String color) {
        System.out.println(" Car Color is : " + color);
    }

    @Override
    public void price(int amount) {
        System.out.println(" Car price is : "+ amount+ " $");
    }

    @Override
    public void company(String brand) {
        System.out.println("Car brand is : "+brand);
    }

}

