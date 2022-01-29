package com.example.aopexample.service;



public interface Vehicle {
    final double PI = 3.14;
    final int stroke = 90;


    void setConfig(int config1, int config2);

    double cc();

    void color(String color);

    void price(int amount);

    void company(String brand);

}
