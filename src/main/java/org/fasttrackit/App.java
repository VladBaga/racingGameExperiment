package org.fasttrackit;

import javax.swing.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Car car = new Car();
        car.name = "Logan";
        car.color = "red";
        car.doorcount = 4;
        car.wheelcount = 4;
        car.maxspeed = 174;
        car.year = 2006;
        car.mileage = 7.5;
        car.running = true;

        Engine engine = new Engine();
        engine.manufacturer = "Renault";
        engine.capacity = 1600;

        car.engine = engine;

        Driver driver = new Driver();
        driver.name = "David";
        driver.haicolor = "blue";
        driver.trophies = 7;
        driver.skilllevel = 8;
        driver.license = true;
    }

}
