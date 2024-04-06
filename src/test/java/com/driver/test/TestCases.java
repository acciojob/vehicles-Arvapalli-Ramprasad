package com.driver.test;

import com.driver.Boat;
import com.driver.F1;
import com.driver.Car;
import com.driver.Main;
import com.driver.Vehicle;
import com.driver.WaterVehicle;

import org.junit.Test;
import static org.junit.Assert.*;

public class TestCases {
  public void testF1Acceleration() {
        F1 f1 = new F1("Ferrari", false);
        assertEquals(0, f1.getCurrentSpeed());

        f1.move(50, 0);
        assertEquals(50, f1.getCurrentSpeed());

        f1.accelerate(30);
        assertEquals(80, f1.getCurrentSpeed());

        f1.accelerate(-40);
        assertEquals(40, f1.getCurrentSpeed());

        f1.accelerate(-60); // Should stop the car
        assertEquals(0, f1.getCurrentSpeed());
    }
    public void testBoat() {
        Boat boat = new Boat("Titanic", 3000);
        assertEquals("Titanic", boat.getVehicleName());
        assertEquals(3000, boat.getVehicleCapacity());
    }
}
