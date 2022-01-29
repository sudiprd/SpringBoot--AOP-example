package com.example.aopexample.manager;

import com.example.aopexample.annotation.ExecutionTime;
import com.example.aopexample.service.Vehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class VehicleManager {

    @Autowired
    private Vehicle car;

    @Autowired
    private Vehicle bike;

    @ExecutionTime
    public void perform(){
        car.setConfig(90, 4);
        System.out.println(car.cc());
        car.price(202020);
        car.company(" Tesla ");
        car.color(" red ");

        System.out.println("=================");
        bike.setConfig(90, 1);
        System.out.println(bike.cc());
        bike.price(234456);
        bike.company(" Java ");
        bike.color(" charcoal ");

    }
}
