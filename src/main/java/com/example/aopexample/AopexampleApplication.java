package com.example.aopexample;

import com.example.aopexample.manager.VehicleManager;
import com.example.aopexample.service.Vehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@EnableAspectJAutoProxy
@SpringBootApplication
public class AopexampleApplication implements CommandLineRunner {

    @Autowired
    private VehicleManager vehicleManager;

    public static void main(String[] args) {
        SpringApplication.run(AopexampleApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
        this.getMethods();
    }

    public void getMethods(){
        vehicleManager.perform();
    }
}
